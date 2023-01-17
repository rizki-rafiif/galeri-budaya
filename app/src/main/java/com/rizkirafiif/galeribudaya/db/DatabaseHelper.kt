package com.rizkirafiif.galeribudaya.db

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.SQLException
import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion.DAERAH
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion.JENIS
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion.NAME
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion.TABLE_BUDAYA
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion._ID

class DatabaseHelper(context: Context) {
    companion object{
        private lateinit var dbCreation: DatabaseCreation
        private var INSTANCE:DatabaseHelper ?= null
        private lateinit var database: SQLiteDatabase
        fun getInstance(context: Context):DatabaseHelper = INSTANCE ?: synchronized(this){
            INSTANCE ?: DatabaseHelper(context)
        }
    }
    init {
        dbCreation = DatabaseCreation(context)
    }
    @Throws(SQLException::class)

    fun open() {
        database = dbCreation.writableDatabase
    }
    fun openRead(){
        database = dbCreation.readableDatabase
    }
    fun deleteAll(){
        database = dbCreation.writableDatabase
        database.delete(TABLE_BUDAYA, null, null)
    }
    fun close() {
        dbCreation.close()
        if (database.isOpen) database.close()
    }

    fun queryById(id:String):Cursor{
        val query = "SELECT * FROM $TABLE_BUDAYA todo WHERE $_ID = '$id'"
        return database.rawQuery(query, null)
    }

    fun queryMakanan():Cursor{
        val query = "SELECT * FROM $TABLE_BUDAYA todo WHERE $JENIS = 'makanan'"
        return database.rawQuery(query, null)
    }

    fun queryTarian():Cursor{
        val query = "SELECT * FROM $TABLE_BUDAYA todo WHERE $JENIS = 'tarian'"
        return database.rawQuery(query, null)
    }

    fun querySenjata():Cursor{
        val query = "SELECT * FROM $TABLE_BUDAYA todo WHERE $JENIS = 'senjata'"
        return database.rawQuery(query, null)
    }

    fun queryPakaian():Cursor{
        val query = "SELECT * FROM $TABLE_BUDAYA todo WHERE $JENIS = 'pakaian'"
        return database.rawQuery(query, null)
    }

    fun queryBenda():Cursor{
        val query = "SELECT * FROM $TABLE_BUDAYA todo WHERE $JENIS = 'benda'"
        return database.rawQuery(query, null)
    }

    fun queryNonBenda():Cursor{
        val query = "SELECT * FROM $TABLE_BUDAYA todo WHERE $JENIS = 'non benda'"
        return database.rawQuery(query, null)
    }


    fun queryDaerah(daerah: String):Cursor{
        val query = "SELECT * FROM $TABLE_BUDAYA todo WHERE $DAERAH = '$daerah'"
        return database.rawQuery(query, null)
    }

    fun queryOfDaerah():Cursor{
        val query = "SELECT DISTINCT $DAERAH FROM $TABLE_BUDAYA ORDER BY $DAERAH ASC"
        return database.rawQuery(query, null)
    }

    fun queryOfSearch(search:String):Cursor{
        val query = "SELECT * FROM $TABLE_BUDAYA todo WHERE $NAME LIKE '%$search%'"
        return database.rawQuery(query, null)
    }


    // ------------------------- insert method ----------------------------------- //
    //val dbcreation2 = DatabaseCreation(context)

    val db = dbCreation.writableDatabase

    // Create a new map of values, where column names are the keys
    fun insertData(id:String, nama:String, jenis:String, daerah:String, deskripsi:String, gambar1:String,
                   gambar2:String, gambar3:String, gambar4:String, gambar5: String){
        val values = ContentValues().apply {
            put(DatabaseContract.BudayaColumns._ID, id)
            put(DatabaseContract.BudayaColumns.NAME, nama)
            put(DatabaseContract.BudayaColumns.JENIS, jenis)
            put(DatabaseContract.BudayaColumns.DAERAH, daerah)
            put(DatabaseContract.BudayaColumns.DESKRIPSI, deskripsi)
            put(DatabaseContract.BudayaColumns.GAMBAR_1, gambar1)
            put(DatabaseContract.BudayaColumns.GAMBAR_2, gambar2)
            put(DatabaseContract.BudayaColumns.GAMBAR_3, gambar3)
            put(DatabaseContract.BudayaColumns.GAMBAR_4, gambar4)
            put(DatabaseContract.BudayaColumns.GAMBAR_5, gambar5)
        }

        // Insert the new row, returning the primary key value of the new row
        db?.insert(DatabaseContract.BudayaColumns.TABLE_BUDAYA, null, values)
    }
}