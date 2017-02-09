package com.bwei.newstitlehanleixin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Oliver","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Oliver","onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Oliver","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Oliver","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Oliver","onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Oliver","onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Oliver","onDestroy");
    }
}
