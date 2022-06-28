package com.sandaliya.vaccinationguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Vaccines_cb extends AppCompatActivity {
    ImageView cb_fm;
    ImageView cb_hemo;
    ImageView cb_bq;
    ImageView cb_bruce;
    ImageView cb_anthrax;
    ImageView cb_rabies;
    LinearLayout toolbar;
    ImageView backBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccines_cb);

        toolbar=findViewById(R.id.toolbar);
        backBtn = toolbar.findViewById(R.id.back);
        backBtn.setVisibility(View.VISIBLE);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



        cb_fm=findViewById(R.id.foot_mouth_img);
        cb_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Vaccines_cb.this,vaccines_cb_fm.class);
                startActivity(intent);
            }
        });

        cb_hemo=findViewById(R.id.haemo_img);
        cb_hemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Vaccines_cb.this,vaccines_cb_hemor.class);
                startActivity(intent);
            }
        });

        cb_bq=findViewById(R.id.black_quarter_img);
        cb_bq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Vaccines_cb.this,vaccines_cb_bq.class);
                startActivity(intent);
            }
        });

        cb_bruce=findViewById(R.id.brucellosis_img);
        cb_bruce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Vaccines_cb.this,vaccines_cb_bruce.class);
                startActivity(intent);
            }
        });

        cb_anthrax=findViewById(R.id.anthrax_img);
        cb_anthrax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Vaccines_cb.this,vaccines_cb_anthrax.class);
                startActivity(intent);
            }
        });

        cb_rabies=findViewById(R.id.rabbies_img);
        cb_rabies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Vaccines_cb.this,vaccines_cb_rabies.class);
                startActivity(intent);
            }
        });
    }
}