package com.example.eco3s.view

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.eco3s.ContentsAdapter
import com.example.eco3s.R
import com.example.eco3s.databinding.FragmentCommentBinding


class CommentFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        inflater.inflate(R.layout.fragment_comment, container, false)
        val binding = FragmentCommentBinding.inflate(inflater, container, false)
        binding.fabAdd.setOnClickListener {
            val intent = Intent(requireContext(), WriteActivity::class.java)
            startActivity(intent)
        }
//        var adapter = ContentsAdapter()
//        binding.rvComment.adapter = adapter

        var adapter = ContentsAdapter()
        binding.rvComment.adapter = adapter



        return binding.root
    }



}