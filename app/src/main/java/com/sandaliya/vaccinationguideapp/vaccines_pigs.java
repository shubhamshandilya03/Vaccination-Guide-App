package com.sandaliya.vaccinationguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class vaccines_pigs extends AppCompatActivity {
    ImageView fm;
    ImageView classical;
    ImageView porcine;
    LinearLayout toolbar;
    ImageView backBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccines_pigs);

        toolbar=findViewById(R.id.toolbar);
        backBtn = toolbar.findViewById(R.id.back);
        backBtn.setVisibility(View.VISIBLE);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        fm=findViewById(R.id.foot_pigs_img);
        fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(vaccines_pigs.this,vaccines_pig_fm.class);
                startActivity(intent);
            }
        });

        classical=findViewById(R.id.classical_swine_pigs_img);
        classical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(vaccines_pigs.this,vaccines_pig_csf.class);
                startActivity(intent);
            }
        });

        porcine=findViewById(R.id.porcine_pigs_img);
        porcine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(vaccines_pigs.this,vaccines_pig_pci.class);
                startActivity(intent);
            }
        });

    }
}