package com.example.myapplication.arithmatic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

public class ScoreArithMainActivity extends AppCompatActivity {
    public TextView input1;
    public TextView input2;
    public Button home;

    int newscore ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_arith_main);
        Intent intent = getIntent();
        String id = intent.getStringExtra("usr");
        int score = intent.getIntExtra("score",newscore);
       // Toast.makeText(getApplicationContext(), id,
             //   Toast.LENGTH_LONG).show();

        input1 = findViewById(R.id.textView33);
        input2 = findViewById(R.id.textView35);
        home = findViewById(R.id.button2);


        input1.setText(id);
        input2.setText(String.valueOf(score));

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
        home.setOnClickListener(e);

    }
}