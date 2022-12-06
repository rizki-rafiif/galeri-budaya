package com.rizkirafiif.galeribudaya.ui.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.rizkirafiif.galeribudaya.Data.Budaya
import com.rizkirafiif.galeribudaya.R
import com.rizkirafiif.galeribudaya.databinding.ItemVpContentHomeBinding
import com.rizkirafiif.galeribudaya.ui.home.kategori.MakananFragmentDirections

class MakananAdapter(context: Context?)
    : RecyclerView.Adapter<MakananAdapter.MakananViewHolder>() {

    var listMakanan = ArrayList<Budaya>()

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
                val id = Budaya(position, null, null, null, null,
                    null, null, null, null, null, null)
                val action = MakananFragmentDirections.actionMakananToDetail(id)
                itemView.findNavController().navigate(action)
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


    override fun getItemCount(): Int = this.listMakanan.size
}