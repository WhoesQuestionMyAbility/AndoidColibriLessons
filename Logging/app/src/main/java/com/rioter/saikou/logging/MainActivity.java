package com.rioter.saikou.logging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "DEV";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onInfoLog(View v){
        Log.i(TAG, "Info level");
    }

    public void onWarnLog(View v){
        Log.w(TAG, "Warn level");
    }

    public void onErrorLog(View v){
        Log.e(TAG, "Error level");
    }

    public void onDebugLog(View v){
        Log.d(TAG, "Debug level");
        Log.v(TAG, "Verbose level");
        Log.wtf(TAG, "WTF level");
    }

}
