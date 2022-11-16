package com.example.myapplication.algebr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.myapplication.R;

public class SuccessActivity3 extends AppCompatActivity {
    public ImageView input1;
    int newscore ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success3);
        Intent intent = getIntent();

        String id = intent.getStringExtra("usr");
        int score = intent.getIntExtra("score",newscore);

        input1 = findViewById(R.id.imageView159);


        View.OnClickListener e = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //action to do
                // Intent: Action from Activity to Activity(from page to page)
                Intent i = new Intent(getApplicationContext(), level4Alg.class).putExtra("usr",id).putExtra("score",score);
                startActivity(i);

            }
        };
        input1.setOnClickListener(e);


    }
}