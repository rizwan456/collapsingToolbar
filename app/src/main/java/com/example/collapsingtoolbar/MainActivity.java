package com.example.collapsingtoolbar;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.collapsingtoolbar.databinding.MainActivityBinding;

public class MainActivity extends AppCompatActivity {

    MainActivityBinding mainActivityBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        mainActivityBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        setSupportActionBar(mainActivityBinding.toolbar);
    }
}
