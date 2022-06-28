package com.sandaliya.vaccinationguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class vaccines_sheep_got extends AppCompatActivity {

    ImageView fm;
    ImageView peste;
    ImageView anthrax;
    ImageView haemo;
    ImageView goatpox;
    ImageView sheepPox;
    LinearLayout toolbar;
    ImageView backBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccines_sheep_got);

        toolbar=findViewById(R.id.toolbar);
        backBtn = toolbar.findViewById(R.id.back);
        backBtn.setVisibility(View.VISIBLE);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        fm=findViewById(R.id.foot_mouth_sheep_img);
        fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(vaccines_sheep_got.this,vaccines_sg_fm.class);
                startActivity(intent);
            }
        });

        peste=findViewById(R.id.peste_des_img);
        peste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(vaccines_sheep_got.this,vaccines_sg_peste.class);
                startActivity(intent);
            }
        });

        haemo=findViewById(R.id.haemo_img);
        haemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(vaccines_sheep_got.this,vaccines_sg_haemo.class);
                startActivity(intent);
            }
        });

        goatpox=findViewById(R.id.got_pox_img);
        goatpox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(vaccines_sheep_got.this,vaccines_sg_goatPox.class);
                startActivity(intent);
            }
        });

        sheepPox=findViewById(R.id.sheep_pox_img);
        sheepPox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(vaccines_sheep_got.this,vaccines_sg_sheepPox.class);
                startActivity(intent);
            }
        });

        anthrax=findViewById(R.id.anthrax_sheep_img);
        anthrax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(vaccines_sheep_got.this,vaccines_sg_anthrax.class);
                startActivity(intent);
            }
        });


    }
}