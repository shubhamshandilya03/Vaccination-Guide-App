package com.sandaliya.vaccinationguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class vaccines_horses extends AppCompatActivity {
    ImageView equine;
    ImageView equine_influenza;
    ImageView tetanus;
    ImageView rabies;
    LinearLayout toolbar;
    ImageView backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccines_horses);

        toolbar=findViewById(R.id.toolbar);
        backBtn = toolbar.findViewById(R.id.back);
        backBtn.setVisibility(View.VISIBLE);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        equine =findViewById(R.id.equine_horses_img);
        equine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(vaccines_horses.this,vaccines_horses_equine.class);
                startActivity((intent));
            }
        });

        equine_influenza =findViewById(R.id.equine_influenza_horses_img);
        equine_influenza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(vaccines_horses.this,vaccines_horses_equine_influenza.class);
                startActivity((intent));
            }
        });

        tetanus =findViewById(R.id.tetanus_horses_img);
        tetanus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(vaccines_horses.this,vaccines_horses_tetanus.class);
                startActivity((intent));
            }
        });

        rabies =findViewById(R.id.rabies_horses_img);
        rabies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(vaccines_horses.this,vaccines_horses_Rabies.class);
                startActivity((intent));
            }
        });
    }
}