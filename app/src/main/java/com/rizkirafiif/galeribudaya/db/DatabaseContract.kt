package com.rizkirafiif.galeribudaya.db

import android.provider.BaseColumns

class DatabaseContract {
    internal class BudayaColumns : BaseColumns {
        companion object {
            const val TABLE_BUDAYA = "budaya"
            const val _ID = "id"
            const val NAME = "nama"
            const val JENIS = "jenis"
            const val DAERAH = "daerah"
            const val DESKRIPSI = "deskripsi"
            const val VIDEO = "link_video"
            const val GAMBAR_1 = "link_gambar_1"
            const val GAMBAR_2 = "link_gambar_2"
            const val GAMBAR_3 = "link_gambar_3"
            const val GAMBAR_4 = "link_gambar_4"
            const val GAMBAR_5 = "link_gambar_5"
        }
    }
}