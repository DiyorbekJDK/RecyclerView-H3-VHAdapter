package com.diyorbek.wallpaper.adapter

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.diyorbek.wallpaper.MainActivity
import com.diyorbek.wallpaper.R
import com.diyorbek.wallpaper.model.Plants
import com.google.android.material.button.MaterialButton
class RvAdapter(
    private val plantsList: List<Plants>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.plants_sample, parent, false)
        return RvViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as RvViewHolder).bind(plantsList[position])
    }

    override fun getItemCount(): Int {
        return plantsList.size
    }

    inner class RvViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        @SuppressLint("ResourceAsColor")
        fun bind(plants: Plants) {
            val name: TextView = view.findViewById(R.id.plantName)
            val desc: TextView = view.findViewById(R.id.plantDesc)
            val image: ImageView = view.findViewById(R.id.plantImage)
            val isHealthy: MaterialButton = view.findViewById(R.id.isHealthy)
            name.text = plants.namePlant
            desc.text = plants.descPlant
            image.setImageResource(plants.imagePlant)
            if (!plants.isHealthy) {
                isHealthy.text = "Warning!"
                //isHealthy.setBackgroundColor(ContextCompat.getColor(this@RvAdapter,R.color.yellow))
                isHealthy.setBackgroundColor(Color.parseColor("#FFEB3B"))
            }
        }
    }
}