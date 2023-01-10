package com.diyorbek.wallpaper.util

import com.diyorbek.wallpaper.R
import com.diyorbek.wallpaper.model.Plants

object Constantas {
    fun plantsList(): MutableList<Plants> {
        return mutableListOf(
            Plants(R.drawable.cactus, "Diego", "Cactus thats grow in desert", true),
            Plants(R.drawable.cassy, "Cassy", "Very good plant", false),
            Plants(R.drawable.luna, "Luna", "Like luna", true),
            Plants(R.drawable.flower, "Diego", "Cactus thats grow in desert", true),
        )
    }
}