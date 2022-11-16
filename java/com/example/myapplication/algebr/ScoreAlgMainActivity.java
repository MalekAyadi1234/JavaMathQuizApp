package com.example.myapplication.algebr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

public class ScoreAlgMainActivity extends AppCompatActivity {
    public TextView input1;
    public TextView input2;
    public Button home;

    int newscore ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_alg_main);
        Intent intent = getIntent();
        String id = intent.getStringExtra("usr");
        int score = intent.getIntExtra("score",newscore);

        input1 = findViewById(R.id.textView40);
        input2 = findViewById(R.id.textView42);
        home = findViewById(R.id.button3);


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