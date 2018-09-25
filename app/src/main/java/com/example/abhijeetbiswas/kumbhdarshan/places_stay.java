package com.example.abhijeetbiswas.kumbhdarshan;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link places_stay.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link places_stay#newInstance} factory method to
 * create an instance of this fragment.
 */
public class places_stay extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_places_stay, container, false);

        return view;
    }



}
