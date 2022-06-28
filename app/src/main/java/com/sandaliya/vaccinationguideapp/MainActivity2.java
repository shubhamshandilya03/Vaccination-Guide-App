package com.sandaliya.vaccinationguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    ImageView about;
    ImageView genInfo;
    ImageView vaccines;
    ImageView vChart;
    ImageView manFact;
    LinearLayout toolbar;
    ImageView backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        toolbar=findViewById(R.id.toolbar);
        backBtn = toolbar.findViewById(R.id.back);
        backBtn.setVisibility(View.VISIBLE);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        about=findViewById(R.id.about_img);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,About.class);
                startActivity(intent);
            }
        });
        genInfo=findViewById(R.id.gen_info_img);
        genInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,generalInfo.class);
                startActivity(intent);
            }
        });
        vaccines =findViewById(R.id.vaccines_img);
        vaccines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,Vaccines.class);
                startActivity(intent);
            }
        });
        vChart=findViewById(R.id.vaccination_chart_img);
        vChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,VaccineChart.class);
                startActivity(intent);
            }
        });
        manFact=findViewById(R.id.manufacturees_img);
        manFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,manufact.class);
                startActivity(intent);
            }
        });
    }
}