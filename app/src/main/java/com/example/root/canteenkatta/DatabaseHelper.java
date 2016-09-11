package com.example.root.canteenkatta;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.Menu;

/**
 * Created by root on 9/11/16.
 */
public class DatabaseHelper extends SQLiteOpenHelper{

    public static final String DatabaseName = "Menu.db";
    public static final String TableName = "SpJainMess";
    public static final String Col_1 = "Id";
    public static final String Col_2 = "Menu";



    public DatabaseHelper(Context context) {
        super(context, DatabaseName, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table SpJainMess Id Interger primary key autoincrement , Menu test");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists SpJainMess");
        onCreate(db);

    }
}
