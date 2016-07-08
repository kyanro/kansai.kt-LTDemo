package com.kyanro.ltdemo;

import android.annotation.SuppressLint;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.kyanro.ltdemo.databinding.ActivityMainBinding;

import lombok.Getter;
import lombok.Setter;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        MyData myData = new MyData();

        myData.setHoge("Data");
        myData.setFuga("Binding!");

        binding.helloText.setText(myData.getHoge() + " " + myData.getFuga());
    }

    static class MyData {
        @Getter
        @Setter
        private String hoge;
        @Getter
        @Setter
        private String fuga;
    }
}
