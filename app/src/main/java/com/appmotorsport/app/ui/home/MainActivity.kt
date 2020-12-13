package com.appmotorsport.app.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.appmotorsport.app.R
import com.appmotorsport.app.databinding.ActivityMainBinding
import com.appmotorsport.app.ui.auth.AppsihAuth
import com.appmotorsport.app.ui.auth.AuthActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView( this, R.layout.activity_main)
        binding.buttonLogout.setOnClickListener {
            AppsihAuth.logout(this){
                startActivity(Intent(this, AuthActivity::class.java))
                finish()
            }
        }
    }
}