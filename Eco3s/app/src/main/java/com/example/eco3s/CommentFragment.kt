package com.example.sangtaegye

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.eco3s.R
import com.example.eco3s.databinding.FragmentCommentBinding


class CommentFragment : Fragment() {

    lateinit var binding : FragmentCommentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        inflater.inflate(R.layout.fragment_comment, container, false)
        binding = FragmentCommentBinding.inflate(layoutInflater)


        return inflater.inflate(R.layout.fragment_place, container, false)
    }

}