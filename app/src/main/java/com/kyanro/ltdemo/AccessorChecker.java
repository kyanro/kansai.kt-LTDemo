package com.kyanro.ltdemo;

import android.util.Log;

/**
 * Created by ppp on 2016/07/08.
 */
public class AccessorChecker {
    public static void checkAccessor() {
        MyData myData = new MyData();
        myData.setFuga("bbb");
        Log.d("mylog", myData.getFuga());
    }
}
