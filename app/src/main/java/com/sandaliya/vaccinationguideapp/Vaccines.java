package com.sandaliya.vaccinationguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Vaccines extends AppCompatActivity {
    ImageView cattle_baffalo;
    ImageView sheep_got;
    ImageView poultry;
    ImageView horses;
    ImageView camel;
    ImageView pigs;
    LinearLayout toolbar;
    ImageView backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccines);


        toolbar=findViewById(R.id.toolbar);
        backBtn = toolbar.findViewById(R.id.back);
        backBtn.setVisibility(View.VISIBLE);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        cattle_baffalo=findViewById(R.id.cattle_img);
        cattle_baffalo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Vaccines.this,Vaccines_cb.class);
                startActivity(intent);
            }
        });

        sheep_got=findViewById(R.id.sheep_img);
        sheep_got.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Vaccines.this,vaccines_sheep_got.class);
                startActivity(intent);
            }
        });

        poultry=findViewById(R.id.poultry_img);
        poultry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Vaccines.this,vaccines_poultry.class);
                startActivity(intent);
            }
        });

        horses=findViewById(R.id.horses_img);
        horses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Vaccines.this,vaccines_horses.class);
                startActivity(intent);
            }
        });

        camel=findViewById(R.id.camel_img);
        camel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Vaccines.this,vaccines_camel.class);
                startActivity(intent);
            }
        });

        pigs=findViewById(R.id.pig_img);
        pigs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Vaccines.this,vaccines_pigs.class);
                startActivity(intent);
            }
        });


    }
}