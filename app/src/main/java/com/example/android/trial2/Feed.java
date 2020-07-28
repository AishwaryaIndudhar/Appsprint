package com.example.android.trial2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class Feed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feed);
       TextView reshare=(TextView)findViewById(R.id.reshare);
    final TextView rtext = (TextView)findViewById(R.id.reshareText);
        reshare.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            rtext.setTextColor(Color.parseColor("#39D836"));
        }
    });
    TextView star=(TextView)findViewById(R.id.star);
    final TextView stext = (TextView)findViewById(R.id.starText);
        star.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            stext.setTextColor(Color.parseColor("#D6C213"));

        }
    });

    TextView bookm=(TextView)findViewById(R.id.bookm);
    final TextView bookmtext = (TextView)findViewById(R.id.bookmText);
        bookm.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            bookmtext.setText("Marked");

        }
    });

    TextView more = (TextView)findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent moreIntent = new Intent(Feed.this,Feedtest.class);
            startActivity(moreIntent);
        }
    });

    FrameLayout pic = (FrameLayout)findViewById(R.id.frame);
        pic.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent picIntent=new Intent(Feed.this,Artistprofile.class);
            startActivity(picIntent);
        }
    });

}

    public void display(View v){
        //ImageView img= (ImageView)findViewById(R.id.scrollimg);

                Intent imgIntent=new Intent(Feed.this,Image.class);
                imgIntent.putExtra("id",R.drawable.d);
                startActivity(imgIntent);
            }
    public void display2(View v){
        //ImageView img= (ImageView)findViewById(R.id.scrollimg);

        Intent imgIntent=new Intent(Feed.this,Image.class);
        imgIntent.putExtra("id",R.drawable.art);
        startActivity(imgIntent);
    }
    public void display3(View v){
        //ImageView img= (ImageView)findViewById(R.id.scrollimg);

        Intent imgIntent=new Intent(Feed.this,Image.class);
        imgIntent.putExtra("id",R.drawable.exp);
        startActivity(imgIntent);
    }
//    public void display2(View v){
//        //ImageView img= (ImageView)findViewById(R.id.scrollimg);
//
//        Intent imIntent=new Intent(Feed.this,Image2.class);
//        startActivity(imIntent);
//    }

}