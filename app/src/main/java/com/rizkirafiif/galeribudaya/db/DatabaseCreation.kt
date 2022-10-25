package com.rizkirafiif.galeribudaya.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.rizkirafiif.galeribudaya.db.DatabaseHelper.BudayaColumns.Companion.DAERAH
import com.rizkirafiif.galeribudaya.db.DatabaseHelper.BudayaColumns.Companion.DESKRIPSI
import com.rizkirafiif.galeribudaya.db.DatabaseHelper.BudayaColumns.Companion.GAMBAR_1
import com.rizkirafiif.galeribudaya.db.DatabaseHelper.BudayaColumns.Companion.GAMBAR_2
import com.rizkirafiif.galeribudaya.db.DatabaseHelper.BudayaColumns.Companion.GAMBAR_3
import com.rizkirafiif.galeribudaya.db.DatabaseHelper.BudayaColumns.Companion.GAMBAR_4
import com.rizkirafiif.galeribudaya.db.DatabaseHelper.BudayaColumns.Companion.GAMBAR_5
import com.rizkirafiif.galeribudaya.db.DatabaseHelper.BudayaColumns.Companion.JENIS
import com.rizkirafiif.galeribudaya.db.DatabaseHelper.BudayaColumns.Companion.NAME
import com.rizkirafiif.galeribudaya.db.DatabaseHelper.BudayaColumns.Companion.TABLE_BUDAYA
import com.rizkirafiif.galeribudaya.db.DatabaseHelper.BudayaColumns.Companion.VIDEO
import com.rizkirafiif.galeribudaya.db.DatabaseHelper.BudayaColumns.Companion._ID

internal class DatabaseCreation(context: Context) : SQLiteOpenHelper
    (context, DATABASE_NAME, null, DATABASE_VERSION){
    companion object{
        private const val DATABASE_NAME = "db_galeri_budaya"
        private const val DATABASE_VERSION = 10
        private const val SQL_CREATE_TABLE_GALERI_BUDAYA = "CREATE TABLE $TABLE_BUDAYA" +
                " (${_ID} INTEGER PRIMARY KEY AUTOINCREMENT," +
                " $NAME TEXT NOT NULL," +
                " $JENIS TEXT NOT NULL," +
                " $DAERAH TEXT NOT NULL," +
                " $DESKRIPSI TEXT NOT NULL," +
                " $VIDEO TEXT NOT NULL," +
                " $GAMBAR_1 TEXT NOT NULL," +
                " $GAMBAR_2 TEXT NOT NULL," +
                " $GAMBAR_3 TEXT NOT NULL," +
                " $GAMBAR_4 TEXT NOT NULL," +
                " $GAMBAR_5 TEXT NOT NULL)"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        if (db != null) db.execSQL(SQL_CREATE_TABLE_GALERI_BUDAYA)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVer: Int, newVer: Int) {
        if (db != null) {
            db.execSQL("DROP TABLE IF EXISTS $TABLE_BUDAYA")
        }
        onCreate(db)
    }
}