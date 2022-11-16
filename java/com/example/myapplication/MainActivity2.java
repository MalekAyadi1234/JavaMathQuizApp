package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    public ImageView back;
    public Button continuee;
    public EditText user;
    String a="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        back = findViewById(R.id.imageView188);
        continuee = findViewById(R.id.button);
        user = findViewById(R.id.editTextTextPersonName11);

        View.OnClickListener l = new View.OnClickListener()
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
        back.setOnClickListener(l);


        View.OnClickListener e = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if (!user.getText().equals("")){
                    a = user.getText().toString();
                    //action to do
                    // Intent: Action from Activity to Activity(from page to page)
                    Intent i = new Intent(getApplicationContext(), CategoriesActivity.class).putExtra("usr",a);

                    startActivity(i);
                }
                else Toast.makeText(getApplicationContext(), "Enter username!",
                        Toast.LENGTH_LONG).show();


            }
        };
        continuee.setOnClickListener(e);

    }
}