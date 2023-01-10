package com.diyorbek.wallpaper.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Plants(
    val imagePlant: Int,
    val namePlant: String,
    val descPlant: String,
    val isHealthy: Boolean
): Parcelable
