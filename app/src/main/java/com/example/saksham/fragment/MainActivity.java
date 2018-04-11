package com.example.saksham.fragment;


import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
   static FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager =getSupportFragmentManager();
        First first=new First();
        manager.beginTransaction().add(R.id.main,first).commit();
    }
}
