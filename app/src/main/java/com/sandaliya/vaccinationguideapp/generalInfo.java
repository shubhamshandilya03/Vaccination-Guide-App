package com.sandaliya.vaccinationguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class generalInfo extends AppCompatActivity {
    TextView vac;
    TextView types;
    TextView adv;
    TextView cause;
    TextView imp;
    LinearLayout toolbar;
    ImageView backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_info);

        toolbar=findViewById(R.id.toolbar);
        backBtn = toolbar.findViewById(R.id.back);
        backBtn.setVisibility(View.VISIBLE);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        vac=findViewById(R.id.vaccine_gn);
        vac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(generalInfo.this,gi_vaccine.class);
                startActivity(intent);
            }
        });

        types=findViewById(R.id.type_vaccine);
        types.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(generalInfo.this,gi_types_vaccine.class);
                startActivity(intent);
            }
        });

        cause=findViewById(R.id.vaccine_failure);
        cause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(generalInfo.this,gi_cause_fail.class);
                startActivity(intent);
            }
        });

        imp=findViewById(R.id.Imp_points_vaccination);
        imp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(generalInfo.this,gi_imp_vaccination.class);
                startActivity(intent);
            }
        });

        adv=findViewById(R.id.adv_vaccine);
        adv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(generalInfo.this,gi_advantages_vaccine.class);
                startActivity(intent);
            }
        });
    }
}