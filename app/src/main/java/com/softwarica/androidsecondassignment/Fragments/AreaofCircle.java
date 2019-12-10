package com.softwarica.androidsecondassignment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.softwarica.androidsecondassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AreaofCircle extends Fragment implements View.OnClickListener {

    private Button btnAreaofCircle;
    private EditText etRadius;
    private TextView tvResult;


    public AreaofCircle() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_areaof_circle, container, false);

        etRadius = view.findViewById(R.id.etRadius);
        btnAreaofCircle = view.findViewById(R.id.btnAreaofCircle);
        tvResult = view.findViewById(R.id.tvResult);

        btnAreaofCircle.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        float radius = Integer.parseInt(etRadius.getText().toString());
        float area = 3.14f * radius * radius;

        tvResult.setText("Area of Circle is " + area);

    }
}
