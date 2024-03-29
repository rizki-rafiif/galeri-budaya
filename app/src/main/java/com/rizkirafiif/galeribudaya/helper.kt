package com.rizkirafiif.galeribudaya

import android.database.Cursor
import com.rizkirafiif.galeribudaya.Data.Budaya
import com.rizkirafiif.galeribudaya.db.DatabaseContract

object helper {
    fun mapCursorToArrayList(budayaCursor: Cursor?):ArrayList<Budaya>{
        val listBudaya = ArrayList<Budaya>()
        budayaCursor?.apply {
            while (moveToNext()){
                val id = getString(getColumnIndexOrThrow(DatabaseContract.BudayaColumns._ID))
                val nama = getString(getColumnIndexOrThrow(DatabaseContract.BudayaColumns.NAME))
                val jenis = getString(getColumnIndexOrThrow(DatabaseContract.BudayaColumns.JENIS))
                val daerah = getString(getColumnIndexOrThrow(DatabaseContract.BudayaColumns.DAERAH))
                val deskripsi = getString(getColumnIndexOrThrow(DatabaseContract.BudayaColumns.DESKRIPSI))
                val gambar1 = getString(getColumnIndexOrThrow(DatabaseContract.BudayaColumns.GAMBAR_1))
                val gambar2 = getString(getColumnIndexOrThrow(DatabaseContract.BudayaColumns.GAMBAR_2))
                val gambar3 = getString(getColumnIndexOrThrow(DatabaseContract.BudayaColumns.GAMBAR_3))
                val gambar4 = getString(getColumnIndexOrThrow(DatabaseContract.BudayaColumns.GAMBAR_4))
                val gambar5 = getString(getColumnIndexOrThrow(DatabaseContract.BudayaColumns.GAMBAR_5))

                listBudaya.add(Budaya(id, nama, jenis, daerah, deskripsi, gambar1,
                    gambar2, gambar3, gambar4, gambar5))
            }
        }
        return listBudaya
    }

    fun mapBrowseCursorToArrayList(budayaCursor: Cursor?):ArrayList<Budaya>{
        val listBudaya = ArrayList<Budaya>()
        budayaCursor?.apply {
            while (moveToNext()){
                val daerah = getString(getColumnIndexOrThrow(DatabaseContract.BudayaColumns.DAERAH))
                listBudaya.add(Budaya(null, null, null, daerah, null,
                    null, null, null, null, null))
            }
        }
        return listBudaya
    }

}