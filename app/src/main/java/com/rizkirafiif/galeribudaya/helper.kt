package com.rizkirafiif.galeribudaya

import android.database.Cursor
import com.rizkirafiif.galeribudaya.Data.Budaya
import com.rizkirafiif.galeribudaya.db.DatabaseContract

object helper {
    fun mapCursorToArrayList(budayaCursor: Cursor?):ArrayList<Budaya>{
        val listBudaya = ArrayList<Budaya>()
        budayaCursor?.apply {
            while (moveToNext()){
                val id = getInt(getColumnIndexOrThrow(DatabaseContract.BudayaColumns._ID))
                val nama = getString(getColumnIndexOrThrow(DatabaseContract.BudayaColumns.NAME))
                val deskripsi = getString(getColumnIndexOrThrow(DatabaseContract.BudayaColumns.DESKRIPSI))
                val gambar1 = getString(getColumnIndexOrThrow(DatabaseContract.BudayaColumns.GAMBAR_1))
                listBudaya.add(Budaya(id, nama, null, null, deskripsi, null,
                    gambar1, null, null, null, null))
            }
        }
        return listBudaya
    }

}