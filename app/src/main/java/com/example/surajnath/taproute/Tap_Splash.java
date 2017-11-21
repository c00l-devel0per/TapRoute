package com.example.surajnath.taproute;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Tap_Splash extends AppCompatActivity {


    ImageView img1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tap__splash);

        img1 = (ImageView) findViewById(R.id.img1);

        Animation tab_anim = AnimationUtils.loadAnimation(Tap_Splash.this, R.anim.tab_splash_anim);
        img1.setAnimation(tab_anim);


        final Intent tabi_main = new Intent(Tap_Splash.this, Tap_main.class);
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(tabi_main);
                    finish();
                }

            }

        };
        timer.start();
    }
}
