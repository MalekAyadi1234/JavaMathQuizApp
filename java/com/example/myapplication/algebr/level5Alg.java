package com.example.myapplication.algebr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.myapplication.R;

public class level5Alg extends AppCompatActivity {


    public EditText input;
    public ImageView input1;
    public ImageView input2;
    public ImageView input3;
    public ImageView input4;
    public ImageView input5;
    public ImageView input6;
    public ImageView input7;
    public ImageView input8;
    public ImageView input9;
    public ImageView input10;
    public ImageView enter;
    public ImageView delete;

    String abc ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5_alg);

        input = findViewById(R.id.editTextTextPersonName5);
        input1 = findViewById(R.id.imageView73);
        input2 = findViewById(R.id.imageView78);
        input3 = findViewById(R.id.imageView76);
        input4 = findViewById(R.id.imageView79);
        input5 = findViewById(R.id.imageView68);
        input6 = findViewById(R.id.imageView80);
        input7 = findViewById(R.id.imageView74);
        input8 = findViewById(R.id.imageView72);
        input9 = findViewById(R.id.imageView69);
        input10 = findViewById(R.id.imageView75);
        enter = findViewById(R.id.imageView71);
        delete = findViewById(R.id.imageView177);

    }
}