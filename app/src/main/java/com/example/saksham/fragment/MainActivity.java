package com.example.saksham.fragment;


import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements First.communi {
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
    public void data(String text) {
        second sec=new second();
        Bundle bundle=new Bundle();
        bundle.putString("key",text);
        sec.setArguments(bundle);
        MainActivity.manager.beginTransaction().replace(R.id.main,sec).commit();
    }
}
