package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.myapplication.algebr.level1Alg;
import com.example.myapplication.algebr.level2Alg;
import com.example.myapplication.algebr.level3Alg;
import com.example.myapplication.algebr.level4Alg;
import com.example.myapplication.algebr.level5Alg;
import com.example.myapplication.arithmatic.level1Arith;
import com.example.myapplication.arithmatic.level2Arith;
import com.example.myapplication.arithmatic.level3Arith;
import com.example.myapplication.arithmatic.level4Arith;
import com.example.myapplication.arithmatic.level5Arith;

public class LevelsArithActivity extends AppCompatActivity {

    public ImageView back;
    public ImageView one;
    public ImageView two;
    public ImageView three;
    public ImageView four;
    public ImageView five;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels_arith);
        Intent intent = getIntent();
        String id = intent.getStringExtra("usr");

        //Toast.makeText(getApplicationContext(), id,
               // Toast.LENGTH_LONG).show();

        back = findViewById(R.id.imageView146);
        one = findViewById(R.id.imageView149);
        two = findViewById(R.id.imageView151);
        three = findViewById(R.id.imageView147);
        four = findViewById(R.id.imageView148);
        five = findViewById(R.id.imageView150);

        View.OnClickListener e = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //action to do
                // Intent: Action from Activity to Activity(from page to page)
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);

            }
        };
        back.setOnClickListener(e);


        View.OnClickListener f = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //action to do
                // Intent: Action from Activity to Activity(from page to page)
                Intent i = new Intent(getApplicationContext(), level1Arith.class).putExtra("usr",id);
                startActivity(i);

            }
        };
        one.setOnClickListener(f);


        View.OnClickListener g = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //action to do
                // Intent: Action from Activity to Activity(from page to page)
               // Intent i = new Intent(getApplicationContext(), level2Arith.class);
                //startActivity(i);
                Toast.makeText(getApplicationContext(), "You must begin with the first level!",
                        Toast.LENGTH_LONG).show();

            }
        };
        two.setOnClickListener(g);

        View.OnClickListener h = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //action to do
                // Intent: Action from Activity to Activity(from page to page)
              //  Intent i = new Intent(getApplicationContext(), level3Arith.class);
                //startActivity(i);
                Toast.makeText(getApplicationContext(), "You must begin with the first level!",
                        Toast.LENGTH_LONG).show();

            }
        };
        three.setOnClickListener(h);

        View.OnClickListener j = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //action to do
                // Intent: Action from Activity to Activity(from page to page)
               // Intent i = new Intent(getApplicationContext(), level4Arith.class);
                //startActivity(i);
                Toast.makeText(getApplicationContext(), "You must begin with the first level!",
                        Toast.LENGTH_LONG).show();

            }
        };
        four.setOnClickListener(j);

        View.OnClickListener k = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //action to do
                // Intent: Action from Activity to Activity(from page to page)
              //  Intent i = new Intent(getApplicationContext(), level5Arith.class);
                //startActivity(i);
                Toast.makeText(getApplicationContext(), "You must begin with the first level!",
                        Toast.LENGTH_LONG).show();

            }
        };
        five.setOnClickListener(k);



    }
}