package com.sandaliya.vaccinationguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class manufact extends AppCompatActivity {
    LinearLayout toolbar;
    ImageView backBtn;

    TextView fmd;
    TextView hs;
    TextView black;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manufact);

        toolbar=findViewById(R.id.toolbar);
        backBtn = toolbar.findViewById(R.id.back);
        backBtn.setVisibility(View.VISIBLE);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        fmd=findViewById(R.id.fmd);
        fmd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(manufact.this,manufact_fmd.class);
                startActivity(intent);
            }
        });

        hs=findViewById(R.id.hs);
        hs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(manufact.this,manufact_hs.class);
                startActivity(intent);
            }
        });

        black=findViewById(R.id.blk);
        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(manufact.this,manufact_black_quarter.class);
                startActivity(intent);
            }
        });
    }
}