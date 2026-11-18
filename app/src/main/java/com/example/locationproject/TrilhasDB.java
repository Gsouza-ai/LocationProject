package com.example.locationproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class TrilhasDB extends SQLiteOpenHelper {
    private static final String DATABASE = "trilha_database";
    private static final int VERSION = 1;

    public TrilhasDB(Context context) {
        super(context, DATABASE, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
    }

    public void registrarWaypoint(Waypoint waypoint){
    }

    public ArrayList<Waypoint> recuperarWaypoint(){
        return null;
    }

    public void apagarTrilha(){
        getWritableDatabase().execSQL("DELETE FROM waypoints");
    }
}
