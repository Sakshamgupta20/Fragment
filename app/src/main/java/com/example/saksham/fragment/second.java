package com.example.saksham.fragment;


import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class second extends Fragment {
TextView tv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.activity_second, container, false);

        tv=(TextView)rootView.findViewById(R.id.gettext);
        Bundle bundle=getArguments();

        String message=bundle.getString("key");

        tv.setText(message);
        Button button=(Button)rootView.findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                First sec=new First();
                MainActivity.manager.beginTransaction().replace(R.id.main,sec).commit();
            }
        });
        return rootView;
    }
}
