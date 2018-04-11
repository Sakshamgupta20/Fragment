package com.example.saksham.fragment;


import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class First extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.activity_first, container, false);

        Log.i("A","on createview" );
        Button button=(Button)rootView.findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second sec=new second();
                MainActivity.manager.beginTransaction().replace(R.id.main,sec).commit();
            }
        });
    return rootView;
    }
    @Override

    public void onAttach(Activity activity) {
        super.onAttach(activity);

        Log.i("A","on attach" );

    }
    @Override

    public void onCreate( Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Log.i("A","on create" );

    }


    @Override

    public void onActivityCreated( Bundle savedInstanceState) {

        Log.i("A","on Activitycreated" );

        super.onActivityCreated(savedInstanceState);

    }

    @Override

    public void onStart() {

        Log.i("A","on Start" );

        super.onStart();

    }

    @Override

    public void onResume() {

        Log.i("A","on Resume" );

        super.onResume();

    }

    @Override

    public void onPause() {

        Log.i("A","on Pause" );

        super.onPause();

    }
    @Override

    public void onStop() {

        Log.i("A","on Stop" );

        super.onStop();

    }

    @Override

    public void onDestroy() {

        super.onDestroy();

        Log.i("A","on destroy" );

    }


    @Override

    public void onDestroyView() {

        super.onDestroyView();

        Log.i("A","on Destroyview" );

    }

    @Override

    public void onDetach() {

        super.onDetach();

        Log.i("A","on Detach" );

    }}
