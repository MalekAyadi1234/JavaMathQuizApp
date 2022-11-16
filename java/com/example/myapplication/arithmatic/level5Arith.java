package com.example.myapplication.arithmatic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.myapplication.R;

public class level5Arith extends AppCompatActivity {

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
        setContentView(R.layout.activity_level5_arith);
        input = findViewById(R.id.editTextTextPersonName10);
        input1 = findViewById(R.id.imageView138);
        input2 = findViewById(R.id.imageView143);
        input3 = findViewById(R.id.imageView141);
        input4 = findViewById(R.id.imageView144);
        input5 = findViewById(R.id.imageView133);
        input6 = findViewById(R.id.imageView145);
        input7 = findViewById(R.id.imageView139);
        input8 = findViewById(R.id.imageView137);
        input9 = findViewById(R.id.imageView134);
        input10 = findViewById(R.id.imageView140);
        enter = findViewById(R.id.imageView136);
        delete = findViewById(R.id.imageView182);

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
                if(abc.equals("30")){

                    Intent i = new Intent(getApplicationContext(), SuccessArithActivity5.class);
                    startActivity(i);


                }
                else Toast.makeText(getApplicationContext(), "Try Again!",
                        Toast.LENGTH_LONG).show();

            }
        };
        input1.setOnClickListener(l);


    }
}