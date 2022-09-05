package com.example.eco3s

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.eco3s.databinding.ActivityWriteBinding
import com.example.eco3s.databinding.FragmentCommentBinding

class MyAdapter : RecyclerView.Adapter<MyAdapter.ContentsViewHolder>(){
    class ContentsViewHolder(private val binding : ActivityWriteBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(contents: Contents){
            

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentsViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ContentsViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}