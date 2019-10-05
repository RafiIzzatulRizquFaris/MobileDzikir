package tech.toughput.mobiledzikir;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SplashS extends AppCompatActivity {

    TextView textView1, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_s);

        textView1 = findViewById(R.id.tvSplash1);
        textView2 = findViewById(R.id.tvSplash2);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashS.this, fragmentCont.class));
                finish();
            }
        }, 2500L);
    }
}
