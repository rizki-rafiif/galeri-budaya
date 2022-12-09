package com.rizkirafiif.galeribudaya.ui.browse

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import androidx.recyclerview.widget.RecyclerView
import com.rizkirafiif.galeribudaya.Data.Budaya
import com.rizkirafiif.galeribudaya.MainActivity
import com.rizkirafiif.galeribudaya.R
import com.rizkirafiif.galeribudaya.databinding.ItemBrowseABinding

class BrowseAdapter(fragmentManager: FragmentManager):
    RecyclerView.Adapter<BrowseAdapter.BrowseViewHolder>() {
    var listBudaya = ArrayList<Budaya>()

    class BrowseViewHolder(view: View) : RecyclerView.ViewHolder(view){
        private val binding = ItemBrowseABinding.bind(view)

        fun bind(budaya:Budaya){
            with(binding){
                tvItemBrowse.text = budaya.daerah
                itemView.setOnClickListener {
                    val bundle = Bundle()
                    bundle.putString("daerah", budaya.daerah)
                    val fragBrowse = BrowsedFragment()
                    fragBrowse.arguments = bundle

                    val bin = itemView.context

                    (bin as MainActivity).runOnUiThread {
                        bin.supportFragmentManager.commit {
                            replace(R.id.fragment_container_view, fragBrowse)
                            setReorderingAllowed(true)
                            addToBackStack(null)
                        }
                    }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BrowseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_browse_a, parent, false)
        return BrowseViewHolder(view)
    }

    override fun onBindViewHolder(holder: BrowseViewHolder, position: Int) {
        holder.bind(listBudaya[position])
    }

    override fun getItemCount(): Int = this.listBudaya.size
}