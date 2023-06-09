package com.example.shapeshifterhomework3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView animatedImageView = findViewById(R.id.animatedImageView);
        AnimatedVectorDrawable animation = (AnimatedVectorDrawable) animatedImageView.getDrawable();

        animatedImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                animation.start();
            }
        });
    }

}