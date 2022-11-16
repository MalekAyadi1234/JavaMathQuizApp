package com.example.myapplication.algebr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.arithmatic.SuccessArithActivity1;

public class level1Alg extends AppCompatActivity {

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
    int score = 2;
    String abc ="";
    int counter=0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1_alg);
     //   input.setText(abc);
        Intent intent = getIntent();
        String id = intent.getStringExtra("usr");

//imageView153
        input = findViewById(R.id.editTextTextPersonName);
        input1 = findViewById(R.id.imageView28);
        input2 = findViewById(R.id.imageView18);
        input3 = findViewById(R.id.imageView19);
        input4 = findViewById(R.id.imageView20);
        input5 = findViewById(R.id.imageView21);
        input6 = findViewById(R.id.imageView22);
        input7 = findViewById(R.id.imageView24);
        input8 = findViewById(R.id.imageView25);
        input9 = findViewById(R.id.imageView26);
        input10 = findViewById(R.id.imageView27);
        enter = findViewById(R.id.imageView23);
        delete = findViewById(R.id.imageView153);

        View.OnClickListener w = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abc="";
                input.setText(abc);


            }
        };
        delete.setOnClickListener(w);



        View.OnClickListener a = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               abc+="1";
                input.setText(abc);


            }
        };
        input2.setOnClickListener(a);

        View.OnClickListener b = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abc+="2";
                input.setText(abc);

            }
        };
        input3.setOnClickListener(b);

        View.OnClickListener c = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abc+="3";
                input.setText(abc);

            }
        };
        input4.setOnClickListener(c);

        View.OnClickListener d = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abc+="4";
                input.setText(abc);

            }
        };
        input5.setOnClickListener(d);

        View.OnClickListener e = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abc+="5";
                input.setText(abc);

            }
        };
        input6.setOnClickListener(e);

        View.OnClickListener f = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abc+="6";
                input.setText(abc);

            }
        };
        input7.setOnClickListener(f);

        View.OnClickListener h = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abc+="7";
                input.setText(abc);

            }
        };
        input8.setOnClickListener(h);

        View.OnClickListener j = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abc+="8";
                input.setText(abc);

            }
        };
        input9.setOnClickListener(j);

        View.OnClickListener o = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abc+="9";
                input.setText(abc);

            }
        };
        input10.setOnClickListener(o);

        View.OnClickListener p = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abc+="0";
                input.setText(abc);

            }
        };
        enter.setOnClickListener(p);



//BUTTON
        View.OnClickListener l = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(abc.equals("5")){
                    if (counter == 0){
                        Intent i = new Intent(getApplicationContext(), SuccessActivity1.class).putExtra("usr",id).putExtra("score",2);
                        startActivity(i);
                        Toast.makeText(getApplicationContext(), "+2",
                                Toast.LENGTH_LONG).show();
                    }else if (counter == 1){
                        Intent i = new Intent(getApplicationContext(), SuccessActivity1.class).putExtra("usr",id).putExtra("score",1);
                        startActivity(i);
                        Toast.makeText(getApplicationContext(), "+1",
                                Toast.LENGTH_LONG).show();
                    }




                }
                else {
                    Toast.makeText(getApplicationContext(), "Try again!",
                            Toast.LENGTH_LONG).show();
                    counter = 1;
                }


            }
        };
        input1.setOnClickListener(l);
    }
}