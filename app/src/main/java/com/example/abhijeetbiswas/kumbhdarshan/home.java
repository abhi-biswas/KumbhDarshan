package com.example.abhijeetbiswas.kumbhdarshan;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class home extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view =inflater.inflate(R.layout.fragment_home, container, false);
        Fragment fragment=null;
        fragment = new home_sc();
        FragmentManager fm = getChildFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.view_home,fragment);
        ft.commit();
        Button bt1 = (Button)view.findViewById(R.id.button_home_sc);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1)
            {  Fragment fragment=null;
                fragment = new home_sc();
                FragmentManager  fm = getChildFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.view_home,fragment);
                ft.commit();
            }
        });
        Button bt2 = (Button)view.findViewById(R.id.button_home_tem);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1)
            {  Fragment fragment=null;
                fragment = new home_sc();
                FragmentManager  fm = getChildFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.view_home,fragment);
                ft.commit();
            }
        });

        return view;
    }


}
