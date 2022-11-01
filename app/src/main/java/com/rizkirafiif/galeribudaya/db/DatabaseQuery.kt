package com.rizkirafiif.galeribudaya.db

import android.content.Context
import android.database.Cursor
import android.database.SQLException
import android.database.sqlite.SQLiteDatabase
import com.rizkirafiif.galeribudaya.db.DatabaseHelper.BudayaColumns.Companion.TABLE_BUDAYA
import com.rizkirafiif.galeribudaya.db.DatabaseHelper.BudayaColumns.Companion._ID

class DatabaseQuery(context: Context) {
    companion object{
        private lateinit var dbCreation: DatabaseCreation
        private var INSTANCE:DatabaseQuery ?= null
        private lateinit var database:SQLiteDatabase
        fun getInstance(context: Context):DatabaseQuery = INSTANCE ?: synchronized(this){
            INSTANCE ?: DatabaseQuery(context)
        }
    }
    init {
        dbCreation = DatabaseCreation(context)
    }
    @Throws(SQLException::class)

    fun open() {
        database = dbCreation.writableDatabase
    }
    fun close() {
        dbCreation.close()
        if (database.isOpen) database.close()
    }
    fun queryAll(): Cursor {
        return database.query( TABLE_BUDAYA, null, null, null, null, null, "$_ID ASC")
    }
    fun queryById(id: String): Cursor {
        return database.query( TABLE_BUDAYA, null, "$_ID = ?", arrayOf(id), null, null, null, null)
    }
}