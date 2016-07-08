package com.kyanro.ltdemo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import lombok.Getter;
import lombok.Setter;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView hello = (TextView) findViewById(R.id.hello_text);

        MyData myData = new MyData();

        myData.setHoge("Hello");
        myData.setFuga("World");

        hello.setText(myData.getHoge() + " " + myData.getFuga());
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
