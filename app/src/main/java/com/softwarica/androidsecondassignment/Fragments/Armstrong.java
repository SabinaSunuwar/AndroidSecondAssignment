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
public class Armstrong extends Fragment implements View.OnClickListener{

    private Button btnArmstrong;
    private EditText etNumber;
    private TextView tvResult;



    public Armstrong() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_armstrong, container, false);

        etNumber = view.findViewById(R.id.etNumber);
        btnArmstrong = view.findViewById(R.id.btnArmstrong);
        tvResult = view.findViewById(R.id.tvResult);


        btnArmstrong.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int c=0,a,temp;
        int number = Integer.parseInt(etNumber.getText().toString());

        temp=number;
        while(number>0)
        {
            a=number%10;
            number=number/10;
            c=c+(a*a*a);
        }

        if(temp==c)

            tvResult.setText("The number is Armstrong.");

        else
            tvResult.setText("The number is not Armstrong.");

    }
}

