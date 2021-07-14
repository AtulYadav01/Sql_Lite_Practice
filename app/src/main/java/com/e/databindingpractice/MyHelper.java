package com.e.databindingpractice;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyHelper extends SQLiteOpenHelper {

    private static final String dbname = "MyDB";
    private static final int version = 1;

    public MyHelper(Context context) {
        super(context, dbname, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        //Create Table
        String sql;
        sql = "CREATE TABLE PRODUCTS(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                " NAME TEXT, " +
                "DESCRIPTION TEXT, " +
                "PRICE REAL)";

        db.execSQL(sql);

        //Insert Data

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
