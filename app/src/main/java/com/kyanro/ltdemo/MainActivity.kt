package com.kyanro.ltdemo

import android.annotation.SuppressLint
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import com.kyanro.ltdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        val myData = MyData()

        myData.setHoge("Data")
        myData.setFuga("Binding!")

        binding.helloText.text = myData.getHoge() + " " + myData.getFuga()
    }
}
