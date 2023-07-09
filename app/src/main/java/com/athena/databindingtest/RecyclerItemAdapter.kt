package com.athena.databindingtest


import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.athena.databindingtest.data.AthenaItem
import com.athena.databindingtest.databinding.RecyclerItemBinding

class RecyclerItemAdapter(val context: Context, val items: List<AthenaItem>) : Adapter<RecyclerItemAdapter.VH>() {

    inner class VH(val binding: RecyclerItemBinding) : ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val binding: RecyclerItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.recycler_item,
            parent,
            false
        )
        return VH(binding)
    }

    override fun getItemCount(): Int {
        return items.size

    }


    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.binding.item = items[position]

        holder.binding.root.setOnClickListener {
            Toast.makeText(context, "${items[position]}", Toast.LENGTH_SHORT).show()
        }
    }


}