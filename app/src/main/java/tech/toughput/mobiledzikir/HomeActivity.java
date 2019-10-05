package tech.toughput.mobiledzikir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton btndoaniat, btndzikir, btnjadwal, btnkiblat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btndoaniat = findViewById(R.id.btn_doaniat);
        btndoaniat.setOnClickListener(this);

        btndzikir = findViewById(R.id.btn_dzikir);
        btndzikir.setOnClickListener(this);

        btnjadwal = findViewById(R.id.btn_jadwal);
        btnjadwal.setOnClickListener(this);

        btnkiblat = findViewById(R.id.btn_kiblat);
        btnkiblat.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_doaniat:
                Intent pndhdoaniat = new Intent(HomeActivity.this, DoaActivity.class);
                startActivity(pndhdoaniat);
                break;
            case R.id.btn_dzikir:
                Intent pndhdzikir = new Intent(HomeActivity.this, SplashS.class);
                startActivity(pndhdzikir);
                break;
            case R.id.btn_jadwal:
                Intent pndhjadwal = new Intent(HomeActivity.this, JadwalSholatActivity.class);
                startActivity(pndhjadwal);
                break;
            case R.id.btn_kiblat:
                Intent pndhkiblat = new Intent(HomeActivity.this, qibladirection.class);
                startActivity(pndhkiblat);
                break;
        }
    }
}
