package com.example.saksham.fragment;


import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
   static FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("B","on create Activity" );
        manager =getSupportFragmentManager();
        First first=new First();
        manager.beginTransaction().add(R.id.main,first).commit();

    }

    @Override

    protected void onStart() {

        super.onStart();

        Log.i("B","on start Activity" );

    }

    @Override

    protected void onResume() {

        super.onResume();

        Log.i("B","on resume Activity" );

    }


    @Override

    protected void onPause() {

        super.onPause();

        Log.i("B","on pause Activity" );

    }

    @Override

    protected void onStop() {

        super.onStop();

        Log.i("B","on stop Activity" );

    }

    @Override

    protected void onDestroy() {

        super.onDestroy();

        Log.i("B","on destroy Activity" );

    }}
