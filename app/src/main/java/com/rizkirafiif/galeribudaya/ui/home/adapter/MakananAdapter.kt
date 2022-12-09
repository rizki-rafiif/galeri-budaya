package com.rizkirafiif.galeribudaya.ui.home.adapter

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.rizkirafiif.galeribudaya.Data.Budaya
import com.rizkirafiif.galeribudaya.Data.Communicator
import com.rizkirafiif.galeribudaya.MainActivity
import com.rizkirafiif.galeribudaya.R
import com.rizkirafiif.galeribudaya.databinding.ItemVpContentHomeBinding
import com.rizkirafiif.galeribudaya.ui.detail.DetailFragment
import com.rizkirafiif.galeribudaya.ui.home.HomeFragment
import com.rizkirafiif.galeribudaya.ui.home.HomeFragmentDirections
import com.rizkirafiif.galeribudaya.ui.home.kategori.MakananFragment
import com.rizkirafiif.galeribudaya.ui.home.kategori.MakananFragmentDirections

class MakananAdapter(context: Context)
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
                    .apply(RequestOptions.overrideOf(120, 160))
                    .apply(RequestOptions.centerCropTransform())
                    .into(ivContent)
                itemView.setOnClickListener {
                    val bundle = Bundle()
                    val pos = position.toString()
                    bundle.putString("position", pos)
                    val fragDetail = DetailFragment()
                    fragDetail.arguments = bundle

                    val bin = itemView.context

                    (bin as MainActivity).runOnUiThread {
                        bin.supportFragmentManager.commit {
                            replace(R.id.fragment_container_view, fragDetail)
                            setReorderingAllowed(true)
                            addToBackStack(null)
                        }
                    }
                }
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