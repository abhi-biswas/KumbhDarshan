package com.example.abhijeetbiswas.kumbhdarshan;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Places extends Fragment {

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view =inflater.inflate(R.layout.fragment_places, container, false);
        Fragment fragment=null;
        fragment = new places_stay();
        FragmentManager fm = getChildFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.view_places,fragment);
        ft.commit();
        Button bt1 = (Button)view.findViewById(R.id.button_places_stay);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1)
            {  Fragment fragment=null;
                fragment = new places_stay();
                FragmentManager  fm = getChildFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.view_places,fragment);
                ft.commit();
            }
        });
        Button bt2 = (Button)view.findViewById(R.id.button_places_attaraction);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1)
            {  Fragment fragment=null;
                fragment = new places_attraction();
                FragmentManager  fm = getChildFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.view_places,fragment);
                ft.commit();
            }
        });
        return view;

    }

}



