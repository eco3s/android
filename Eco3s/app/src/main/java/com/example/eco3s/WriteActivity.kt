package com.example.eco3s

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.eco3s.databinding.ActivityWriteBinding

class WriteActivity : AppCompatActivity() {
    lateinit var binding : ActivityWriteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityWriteBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val title : String = binding.etTitle.toString()
        val contents : String = binding.etContent.toString()


        binding.btnWrite.setOnClickListener {
            intent.putExtra("Title", title)
            intent.putExtra("Contents", contents)
        }
    }
}


