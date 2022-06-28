package com.sandaliya.vaccinationguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class vaccines_poultry extends AppCompatActivity {

    LinearLayout toolbar;
    ImageView backBtn;

    ImageView agg;
    ImageView fowl;
    ImageView ib;
    ImageView ibd;
    ImageView mareks;
    ImageView newcastle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccines_poultry);

        toolbar=findViewById(R.id.toolbar);
        backBtn = toolbar.findViewById(R.id.back);
        backBtn.setVisibility(View.VISIBLE);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        agg=findViewById(R.id.agg_drop_poultry_img);
        agg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(vaccines_poultry.this,vaccines_poultry_eggDropSyndrome.class);
                startActivity(intent);
            }
        });

        fowl=findViewById(R.id.fowl_pox_img);
        fowl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(vaccines_poultry.this,vaccines_poultry_fowl.class);
                startActivity(intent);
            }
        });

        ib=findViewById(R.id.infectious_poultry_img);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(vaccines_poultry.this,vaccines_poultry_IB.class);
                startActivity(intent);
            }
        });

        ibd=findViewById(R.id.infectious_bron_poultry_img);
        ibd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(vaccines_poultry.this,vaccines_poultry_IBD.class);
                startActivity(intent);
            }
        });

        mareks=findViewById(R.id.mareks_poultry_img);
        mareks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(vaccines_poultry.this,vaccines_poultry_mareks.class);
                startActivity(intent);
            }
        });

        newcastle=findViewById(R.id.newcastle_poultry_img);
        newcastle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(vaccines_poultry.this,vaccines_poultry_newcastle.class);
                startActivity(intent);
            }
        });

    }
}