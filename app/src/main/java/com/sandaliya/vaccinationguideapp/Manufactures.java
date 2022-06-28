package com.sandaliya.vaccinationguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Manufactures extends AppCompatActivity {
    ImageView manu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manufactures);
        manu=findViewById(R.id.manufacturees_img);
        manu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Manufactures.this,manufact.class);
                startActivity(intent);
            }
        });
    }
}