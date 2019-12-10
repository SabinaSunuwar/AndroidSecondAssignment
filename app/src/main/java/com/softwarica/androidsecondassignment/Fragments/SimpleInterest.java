package com.softwarica.androidsecondassignment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.softwarica.androidsecondassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleInterest extends Fragment {


    public SimpleInterest() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_simple_interest, container, false);
    }

}
