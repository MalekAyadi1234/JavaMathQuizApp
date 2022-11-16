package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public ImageView play;
    public ImageView levels;
    public ImageView restart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = findViewById(R.id.imageView2);
        levels = findViewById(R.id.imageView3);
        restart = findViewById(R.id.imageView4);

        View.OnClickListener l = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //action to do
                // Intent: Action from Activity to Activity(from page to page)
                Intent i = new Intent(getApplicationContext(), CategoriesActivity.class);
                startActivity(i);

            }
        };
        levels.setOnClickListener(l);



        View.OnClickListener e = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //action to do
                // Intent: Action from Activity to Activity(from page to page)
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(i);

            }
        };
        play.setOnClickListener(e);



    }
}