package com.rizkirafiif.galeribudaya.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion.DAERAH
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion.DESKRIPSI
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion.GAMBAR_1
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion.GAMBAR_2
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion.GAMBAR_3
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion.GAMBAR_4
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion.GAMBAR_5
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion.JENIS
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion.NAME
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion.TABLE_BUDAYA
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion.VIDEO
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion._ID

class DatabaseCreation(context: Context) : SQLiteOpenHelper
    (context, DATABASE_NAME, null, DATABASE_VERSION){
    companion object{
        private const val DATABASE_NAME = "db_galeri_budaya"
        private const val DATABASE_VERSION = 1
        private const val SQL_CREATE_TABLE_GALERI_BUDAYA = "CREATE TABLE $TABLE_BUDAYA" +
                " ( $_ID TEXT ," +
                " $NAME TEXT ," +
                " $JENIS TEXT ," +
                " $DAERAH TEXT ," +
                " $DESKRIPSI TEXT ," +
                " $VIDEO TEXT ," +
                " $GAMBAR_1 TEXT ," +
                " $GAMBAR_2 TEXT ," +
                " $GAMBAR_3 TEXT ," +
                " $GAMBAR_4 TEXT ," +
                " $GAMBAR_5 TEXT )"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(SQL_CREATE_TABLE_GALERI_BUDAYA)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVer: Int, newVer: Int) {
        db?.execSQL("DROP TABLE IF EXISTS $TABLE_BUDAYA")
        onCreate(db)
    }

    override fun onDowngrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        onUpgrade(db, oldVersion, newVersion)
    }

}