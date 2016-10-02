package com.example.android.myfragments;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements coumicater{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("ahmed","oncreat activity called");

    }


    @Override
    public void makechange(String data) {
android.app.FragmentManager fragmentManager =getFragmentManager();
        fragment2 fragment2 = (com.example.android.myfragments.fragment2) fragmentManager.findFragmentById(R.id.fragment2);
        fragment2.chnage(data);
    }
}
