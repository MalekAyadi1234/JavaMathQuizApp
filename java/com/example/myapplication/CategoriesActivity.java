package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class CategoriesActivity extends AppCompatActivity {

    public ImageView alge;
    public ImageView arith;
    public ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        alge = findViewById(R.id.imageView12);
        arith = findViewById(R.id.imageView13);
        back = findViewById(R.id.imageView11);
        Intent intent = getIntent();
        String id = intent.getStringExtra("usr");
        //Toast.makeText(getApplicationContext(), id,
          //      Toast.LENGTH_LONG).show();

        View.OnClickListener l = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //action to do
                // Intent: Action from Activity to Activity(from page to page)
                Intent i = new Intent(getApplicationContext(), LevelsActivity.class).putExtra("usr",id);
                startActivity(i);

            }
        };
        alge.setOnClickListener(l);

        View.OnClickListener e = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //action to do
                // Intent: Action from Activity to Activity(from page to page)
                Intent i = new Intent(getApplicationContext(), LevelsArithActivity.class).putExtra("usr",id);
                startActivity(i);

            }
        };
        arith.setOnClickListener(e);

        View.OnClickListener d = new View.OnClickListener()
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
        back.setOnClickListener(d);

    }
}