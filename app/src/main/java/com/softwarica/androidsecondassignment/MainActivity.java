package com.softwarica.androidsecondassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.softwarica.androidsecondassignment.Fragments.AreaofCircle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnAreaofCircle, btnPalindrome, btnSimpleInterest, btnArmstrong,
            btnAutomorphic, btnSwapping;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAreaofCircle = findViewById(R.id.btnAreaofCircle);
        btnPalindrome = findViewById(R.id.btnPalindrome);
        btnSimpleInterest = findViewById(R.id.btnSimpleInterest);
        btnArmstrong = findViewById(R.id.btnArmstrong);
        btnAutomorphic = findViewById(R.id.btnAutomorphic);
        btnSwapping = findViewById(R.id.btnSwapping);

        btnAreaofCircle.setOnClickListener(this);
        btnPalindrome.setOnClickListener(this);
        btnSimpleInterest.setOnClickListener(this);
        btnArmstrong.setOnClickListener(this);
        btnAutomorphic.setOnClickListener(this);
        btnSwapping.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (v.getId()) {
            case R.id.btnAreaofCircle:

                AreaofCircle areaofCircle = new AreaofCircle();
                fragmentTransaction.replace(R.id.fragmentContainer,areaofCircle);
                fragmentTransaction.commit();
                break;
        }


    }
}
