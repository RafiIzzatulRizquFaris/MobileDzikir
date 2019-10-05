package tech.toughput.mobiledzikir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DoaActivity extends AppCompatActivity implements View.OnClickListener{

    Button niatpuasa, bukapuasa, doasolattarwih, witir1, witir2, itikafsunah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa);

        niatpuasa = findViewById(R.id.button1);
        niatpuasa.setOnClickListener(this);

        bukapuasa = findViewById(R.id.button2);
        bukapuasa.setOnClickListener(this);

        doasolattarwih = findViewById(R.id.button3);
        doasolattarwih.setOnClickListener(this);

        witir1 = findViewById(R.id.button4);
        witir1.setOnClickListener(this);

        witir2 = findViewById(R.id.button5);
        witir2.setOnClickListener(this);

        itikafsunah = findViewById(R.id.button6);
        itikafsunah.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.button1:
                Intent pindah1 = new Intent(DoaActivity.this, NiatPuasaActivity.class);
                startActivity(pindah1);
                break;

            case R.id.button2:
                Intent pindah2 = new Intent(DoaActivity.this, BukaPuasaActivity.class);
                startActivity(pindah2);
                break;

            case R.id.button3:
                Intent pindah3 = new Intent(DoaActivity.this, SolatTarawihActivity.class);
                startActivity(pindah3);
                break;

            case R.id.button4:
                Intent pindah4 = new Intent(DoaActivity.this, Witir1Activity.class);
                startActivity(pindah4);
                break;
//
//
            case R.id.button5:
                Intent pindah6 = new Intent(DoaActivity.this, ItikafSunahActivity.class);
                startActivity(pindah6);
                break;


            case R.id.button6:
                Intent pindah8 = new Intent(DoaActivity.this, MalamLailatulActivity.class);
                startActivity(pindah8);
                break;
        }
    }
}
