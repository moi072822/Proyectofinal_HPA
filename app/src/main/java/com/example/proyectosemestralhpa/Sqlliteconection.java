package com.example.proyectosemestralhpa;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Sqlliteconection extends SQLiteOpenHelper {
    public Sqlliteconection(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE usuarios (" +
                "id INTEGER PRIMARY KEY, " +
                "nombre TEXT NOT NULL, " +
                "apellido TEXT NOT NULL, " +
                "correo TEXT NOT NULL, " +
                "cedula TEXT NOT NULL, " +
                "edad INTEGER, " +
                "contraseña TEXT NOT NULL)");
        sqLiteDatabase.execSQL("CREATE TABLE instrumentos (" +
                "id INTEGER PRIMARY KEY, " +
                "instrumento TEXT NOT NULL, " +
                "tipo TEXT NOT NULL, "+
                "imagen BLOB)");
    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
