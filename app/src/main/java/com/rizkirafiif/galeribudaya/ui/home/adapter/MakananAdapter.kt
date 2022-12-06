package com.rizkirafiif.galeribudaya.ui.home.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.rizkirafiif.galeribudaya.Data.Budaya
import com.rizkirafiif.galeribudaya.R
import com.rizkirafiif.galeribudaya.databinding.ItemVpContentHomeBinding

class MakananAdapter(private val listMakanan : List<Budaya>)
    : RecyclerView.Adapter<MakananAdapter.MakananViewHolder>() {

    class MakananViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val binding = ItemVpContentHomeBinding.bind(itemView)
        fun bind(data:Budaya, position: Int){
            with(binding){
                tvTitleContent.text = data.nama
                tvShortDescContent.text = data.deskripsi
                Glide.with(itemView.context)
                    .load(data.gambar1)
                    .apply(RequestOptions.centerCropTransform())
                    .into(ivContent)
            }
            itemView.setOnClickListener {
                // navigation
                // fragment transaction using id
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MakananViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_vp_content_home, parent, false)
        return MakananViewHolder(view)
    }

    override fun onBindViewHolder(holder: MakananViewHolder, position: Int) {
        //val data = listMakanan[position]
        holder.bind(listMakanan[position], position)
    }

    // method to bridging data
    companion object {
        const val EXTRA_MYDATA = "extra_mydata"
    }

    override fun getItemCount(): Int = this.listMakanan.size
}