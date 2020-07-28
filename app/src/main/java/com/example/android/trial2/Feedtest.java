package com.example.android.trial2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class Feedtest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedtest);

        FrameLayout pic = (FrameLayout)findViewById(R.id.frame);
        pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picIntent=new Intent(Feedtest.this,Profile.class);
                startActivity(picIntent);
            }
        });

        ArrayList<MyImage> words = new ArrayList<MyImage>();
        words.add(new MyImage(R.drawable.d,R.drawable.exp,R.drawable.art));
        words.add(new MyImage(R.drawable.d,R.drawable.exp,R.drawable.art));
        words.add(new MyImage(R.drawable.d,R.drawable.exp,R.drawable.art));
        words.add(new MyImage(R.drawable.d,R.drawable.exp,R.drawable.art));
        words.add(new MyImage(R.drawable.d,R.drawable.exp,R.drawable.art));
        words.add(new MyImage(R.drawable.d,R.drawable.exp,R.drawable.art));
        words.add(new MyImage(R.drawable.d,R.drawable.exp,R.drawable.art));


        ImageAdapter itemsAdapter =
                new ImageAdapter(this, words);

       ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


    }
    public void display(View v){
        //ImageView img= (ImageView)findViewById(R.id.scrollimg);

        Intent imgIntent=new Intent(Feedtest.this,Image.class);
        imgIntent.putExtra("id",R.drawable.d);
        startActivity(imgIntent);
    }
    public void display2(View v){
        //ImageView img= (ImageView)findViewById(R.id.scrollimg);

        Intent imgIntent=new Intent(Feedtest.this,Image.class);
        imgIntent.putExtra("id",R.drawable.art);
        startActivity(imgIntent);
    }
    public void display3(View v){
        //ImageView img= (ImageView)findViewById(R.id.scrollimg);

        Intent imgIntent=new Intent(Feedtest.this,Image.class);
        imgIntent.putExtra("id",R.drawable.exp);
        startActivity(imgIntent);
    }

    }

