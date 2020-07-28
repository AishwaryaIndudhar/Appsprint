package com.example.android.trial2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
public class Image2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image);
        ImageView mainn = (ImageView)findViewById(R.id.ursulaimg);

        mainn.setImageResource(R.drawable.art);

    }
}
