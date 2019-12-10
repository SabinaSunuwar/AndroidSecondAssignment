package com.softwarica.androidsecondassignment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.softwarica.androidsecondassignment.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleInterest extends Fragment implements View.OnClickListener {

    private Button btnSimpleInterest;
    private EditText etPrincipal, etTime, etRate;


    public SimpleInterest() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple_interest, container, false);

        etPrincipal = view.findViewById(R.id.etPrincipal);
        etTime = view.findViewById(R.id.etTime);
        etRate = view.findViewById(R.id.etRate);
        btnSimpleInterest = view.findViewById(R.id.btnSimpleInterest);

        btnSimpleInterest.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        float principal = Integer.parseInt(etPrincipal.getText().toString());
        float time = Integer.parseInt(etTime.getText().toString());
        float rate = Integer.parseInt(etRate.getText().toString());
        float simpleinterest = ((principal * time * rate) / 100);

        Toast.makeText(getActivity(),"Simple Interest" + simpleinterest, Toast.LENGTH_SHORT).show();

    }
}
