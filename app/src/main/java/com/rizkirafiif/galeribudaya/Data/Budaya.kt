package com.rizkirafiif.galeribudaya.Data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Budaya (
    var id: String ?= null,
    var nama: String ?= null,
    var jenis: String ?= null,
    var daerah: String ?= null,
    var deskripsi: String ?= null,
    var gambar1: String ?= null,
    var gambar2: String ?= null,
    var gambar3: String ?= null,
    var gambar4: String ?= null,
    var gambar5: String ?= null
) :  Parcelable