package com.example.myapplication.algebr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

public class SuccessActivity5 extends AppCompatActivity {
    public ImageView input1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success5);

        input1 = findViewById(R.id.imageView163);


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
        input1.setOnClickListener(e);


    }
}