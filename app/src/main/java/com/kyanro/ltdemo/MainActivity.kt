package com.kyanro.ltdemo

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.kyanro.ltdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.body.setOnClickListener {
            val intent: Intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }

        val container = Container()

        // setter getter が1つずつある////
        container.data = "MainActivity!"
        binding.body.text = container.data
        //////////////////////////////////
    }
}
