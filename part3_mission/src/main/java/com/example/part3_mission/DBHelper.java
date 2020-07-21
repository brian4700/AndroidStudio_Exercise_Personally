package com.example.part3_mission;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERAION = 1;
    public DBHelper(Context context) {super (context, "contactdb", null, DATABASE_VERAION); }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String tableSql = "create table tb_contact (" +
                "_id integar primary key autoincrement," +
                "name not null," +
                "phone," +
                "email)";
        db.execSQL(tableSql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if(newVersion == DATABASE_VERAION){
            db.execSQL("drop table tb_contact");
            onCreate(db);
        }

    }
}
