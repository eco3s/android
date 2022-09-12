package com.example.eco3s

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.eco3s.databinding.ItemAddRvBinding

class ContentsAdapter : RecyclerView.Adapter<Holder>() {

    val listData = mutableListOf<Contents>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemAddRvBinding.inflate(LayoutInflater.from(parent.context),
        parent, false)

        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val contents = listData[position]
        holder.setContents(contents)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

}

class Holder(val binding: ItemAddRvBinding) : RecyclerView.ViewHolder(binding.root) {
    fun setContents(contents: Contents) {
        binding.tvTitleName.text = contents.tv_title
    }
}