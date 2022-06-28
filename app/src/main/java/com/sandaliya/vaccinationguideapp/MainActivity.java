package com.sandaliya.vaccinationguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
//    ActivityMainBinding binding;
    private Button button;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);
       button=(Button)findViewById(R.id.explore);
         button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(MainActivity.this,MainActivity2.class);
               startActivity(intent);
           }
       });
    }
}