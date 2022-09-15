package com.example.eco3s.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.eco3s.R
import com.example.eco3s.databinding.ActivityMainBinding
import com.example.eco3s.view.AnimalFragment
import com.example.eco3s.view.CommentFragment
import com.google.android.material.bottomnavigation.BottomNavigationView


lateinit var animalFragment: AnimalFragment
lateinit var placeFragment: PlaceFragment
lateinit var commentFragment: CommentFragment
lateinit var profileFragment: ProfileFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        animalFragment = AnimalFragment()
        supportFragmentManager.beginTransaction().add(R.id.fragments_frame, animalFragment).commit()

        binding.bottomNavi.setOnNavigationItemSelectedListener(BottomNavItemSelectedListener)


    }

    private val BottomNavItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener{
        when(it.itemId){
            R.id.menu_home -> {
                animalFragment = AnimalFragment()
                supportFragmentManager.beginTransaction().replace(R.id.fragments_frame, animalFragment).commit()
            }
            R.id.menu_chat -> {
                placeFragment = PlaceFragment()
                supportFragmentManager.beginTransaction().replace(R.id.fragments_frame, placeFragment).commit()
            }
            R.id.menu_comment -> {
                commentFragment = CommentFragment()
                supportFragmentManager.beginTransaction().replace(R.id.fragments_frame, commentFragment).commit()
            }
            R.id.menu_profile -> {
                profileFragment = ProfileFragment()
                supportFragmentManager.beginTransaction().replace(R.id.fragments_frame, profileFragment).commit()
            }
        }
        true
    }
}