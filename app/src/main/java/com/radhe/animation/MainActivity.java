package com.radhe.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button zoom,clockwise,fade,blink,move,slide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt = findViewById(R.id.txt2);

        zoom = (Button) findViewById(R.id.zoom);
        clockwise = (Button) findViewById(R.id.clockwise);
        fade = (Button) findViewById(R.id.fade);
        blink = (Button) findViewById(R.id.blink);
        move = (Button) findViewById(R.id.move);
        slide = (Button) findViewById(R.id.slide);

        Animation a1 = AnimationUtils.loadAnimation(this,R.anim.zoom);
        zoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.startAnimation(a1);
            }
        });
        Animation a2 = AnimationUtils.loadAnimation(this,R.anim.clockwise);
        clockwise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.startAnimation(a2);
            }
        });
        Animation a3 = AnimationUtils.loadAnimation(this,R.anim.fade);
        fade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.startAnimation(a3);
            }
        });
        Animation a4 = AnimationUtils.loadAnimation(this,R.anim.blink);
        blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.startAnimation(a4);
            }
        });
        Animation a5 = AnimationUtils.loadAnimation(this,R.anim.move);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.startAnimation(a5);
            }
        });
        Animation a6 = AnimationUtils.loadAnimation(this,R.anim.slide);
        slide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.startAnimation(a6);
            }
        });
    }
}