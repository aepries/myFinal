//package com.example.aaronpries.myfinal;
//
//import android.content.Context;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//
///**
// * Created by aaronpries on 12/6/16.
// */
//
//public class DbHelper extends SQLiteOpenHelper{
//
////    private static final String DB_NAME="AEPRIES";
////    private static final int DB_VER = 1;
////    public static final String DB_TABLE="Task";
////    public static final String DB_COLUMN = "TaskName";
////
////
////
////    public DbHelper(Context context) {
////        super(context, DB_NAME, null, DB_VER);
////    }
////
////    @Override
////    public void onCreate(SQLiteDatabase sqLiteDatabase) {
////        String query = String.format("CREATE TABLE %s (ID INTEGER PRIMARY KEY AUTOINCREMENT,%s TEXT NOT NULL",DB_NAME,DB_COLUMN);
////        db.execSQL(query);
////
////    }
////
////    @Override
////    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
////        String query = String.format("DELETE TABLE IF EXISTS %s", DB_TABLE);
////        db.execSQL(query);
////        onCreate(db);
////
////    }
//}
