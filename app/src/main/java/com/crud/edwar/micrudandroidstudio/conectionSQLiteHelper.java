package com.crud.edwar.micrudandroidstudio;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.crud.edwar.micrudandroidstudio.Entidades.usuarios;

/**
 * Created by edwar on 18/12/2017.
 */

public class conectionSQLiteHelper extends SQLiteOpenHelper {
    final String CREAR_TABLA_USUARIOS="CREATE TABLE usuarios(id INTEGER,nombre TEXT,telefono TEXT)";
    final String BORRAR_TABLA_USUARIOS="DROP TABLE IF EXIST usuarios";

    public conectionSQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREAR_TABLA_USUARIOS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAntigua, int versionNueva) {
       db.execSQL(BORRAR_TABLA_USUARIOS);
       onCreate(db);
    }

}
