package com.kyanro.ltdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.kyanro.ltdemo.databinding.ActivityMainBinding;

public class SubActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        Container container = new Container();

        // setter getter が1つずつある///////
        container.data = "SubActivity!";
        binding.body.setText(container.data);
        /////////////////////////////////////
    }
}
