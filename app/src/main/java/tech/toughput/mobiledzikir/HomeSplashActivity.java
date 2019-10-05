package tech.toughput.mobiledzikir;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class HomeSplashActivity extends AppCompatActivity {



    private ImageView logoapp;
    private  static  int splashTimeOut = 6100;
    private Animation logoanimation;
    private MediaPlayer splashaudio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_splash);

        logoapp = (ImageView)findViewById(R.id.logoapp);

        splashaudio = MediaPlayer.create(this,R.raw.bismillah);
        splashaudio.start();

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent i = new Intent(HomeSplashActivity.this, HomeActivity.class);
                startActivity(i);
                finish();
                }
            },splashTimeOut);

        logoanimation = AnimationUtils.loadAnimation(this,R.anim.logoanimation);
        logoapp.startAnimation(logoanimation);

    }

    @Override
    protected void onPause() {
        super.onPause();
        splashaudio.release();
        finish();
    }
}
