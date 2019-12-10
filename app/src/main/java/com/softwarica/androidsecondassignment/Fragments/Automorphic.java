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
public class Automorphic extends Fragment implements View.OnClickListener {

    private Button btnAutomorphic;
    private EditText etNumber;
    private TextView tvResult;




    public Automorphic() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_automorphic, container, false);

        etNumber = view.findViewById(R.id.etNumber);
        btnAutomorphic = view.findViewById(R.id.btnAutomorphic);
        tvResult = view.findViewById(R.id.tvResult);


        btnAutomorphic.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int a,s,c=1;
        int number = Integer.parseInt(etNumber.getText().toString());

        a=number;

        s=number*number;

        while (number!=0)

        {

            c=c*10;

            number=number/10;

        }

        if(s%c==a)
            tvResult.setText("The number is Automorphic.");

        else
            tvResult.setText("The number is not Automorphic.");


    }
}
