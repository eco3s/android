package com.example.eco3s

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.eco3s.databinding.ActivityWriteBinding

class WriteActivity : AppCompatActivity() {
    lateinit var binding : ActivityWriteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityWriteBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val contentList : List<Contents> = listOf(
            Contents(binding.imgAdd.toString(), binding.etTitle.text.toString(), binding.etContent.text.toString())

        )
    }
}