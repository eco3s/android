package com.example.eco3s.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.eco3s.data.Contents
import com.example.eco3s.databinding.ActivityWriteBinding

class WriteActivity : AppCompatActivity() {
    lateinit var binding : ActivityWriteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityWriteBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val title : String = binding.etTitle.toString()
        val contents : String = binding.etContent.toString()
        var contentsList = Contents(tv_title = title, tv_contents = contents, img_contents = null.toString())


        binding.btnWrite.setOnClickListener {
            val intent = Intent(this, CommentFragment::class.java)
            startActivity(intent)
            finish()
        }
    }
}


