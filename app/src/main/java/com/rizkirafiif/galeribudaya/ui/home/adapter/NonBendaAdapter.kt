package com.rizkirafiif.galeribudaya.ui.home.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.rizkirafiif.galeribudaya.Data.Budaya
import com.rizkirafiif.galeribudaya.MainActivity
import com.rizkirafiif.galeribudaya.R
import com.rizkirafiif.galeribudaya.databinding.ItemVpContentHomeBinding
import com.rizkirafiif.galeribudaya.ui.detail.DetailFragment

class NonBendaAdapter(fragmentManager: FragmentManager):RecyclerView.Adapter<NonBendaAdapter.NonBendaViewHolder>() {
    var listBud = ArrayList<Budaya>()
    class NonBendaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
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
                    bundle.putString("position", data.id)
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NonBendaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_vp_content_home, parent, false)
        return NonBendaViewHolder(view)
    }

    override fun onBindViewHolder(holder: NonBendaViewHolder, position: Int) {
        holder.bind(listBud[position], position)
    }

    override fun getItemCount(): Int = this.listBud.size
}