package tech.toughput.mobiledzikir;

import android.app.ProgressDialog;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TimeFormatException;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import tech.toughput.mobiledzikir.api.ApiService;
import tech.toughput.mobiledzikir.api.ApiUrl;
import tech.toughput.mobiledzikir.model.ModelJadwal;

public class JadwalSholatActivity extends AppCompatActivity {

    private TextView tv_Lokasi_value, tv_Subuh_value, tv_Syuruq_value, tv_Dzuhur_value, tv_Ashar_value, tv_Magrib_value, tv_Isya_value, tanggalnya;
    private FloatingActionButton btn_refresh;
    private ProgressDialog ProgressDialog;
    private TextClock jamnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal_sholat);

        jamnya = findViewById(R.id.jamnya);
        String currentTime = new SimpleDateFormat("HH:mm").format(new Date());
        jamnya.setText(currentTime);

        tanggalnya = findViewById(R.id.tanggalnya);
        String currentDate = new SimpleDateFormat("EEE, d MMM yyyy").format(new Date());
        tanggalnya.setText(currentDate);

        tv_Lokasi_value = findViewById(R.id.tv_Lokasi_value);
        tv_Subuh_value = findViewById(R.id.tv_Subuh_value);
        tv_Syuruq_value = findViewById(R.id.tv_Syuruq_value);
        tv_Dzuhur_value = findViewById(R.id.tv_Dzuhur_value);
        tv_Ashar_value = findViewById(R.id.tv_Ashar_value);
        tv_Magrib_value = findViewById(R.id.tv_Magrib_value);
        tv_Isya_value = findViewById(R.id.tv_Isya_value);

        btn_refresh = findViewById(R.id.btn_refresh);

        getJadwal();

        btn_refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getJadwal();
            }
        });
    }

//    public boolean onOptionsItemSelected(MenuItem item){
//        int id = item.getItemId();
//        if (id == android.R.id.home){
//            finish();
//        }
//        return super.onOptionsItemSelected(item);
//    }

    private void getJadwal(){
        ProgressDialog = new ProgressDialog(JadwalSholatActivity.this);
        ProgressDialog.setMessage("Wait for a moment...");
        ProgressDialog.show();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiUrl.URL_ROOT_HTTP)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService apiService = retrofit.create(ApiService.class);
        Call<ModelJadwal> call = apiService.getJadwal();

        call.enqueue(new Callback<ModelJadwal>() {
            @Override
            public void onResponse(Call<ModelJadwal> call, Response<ModelJadwal> response) {

                ProgressDialog.dismiss();

                if (response.isSuccessful()) {
                    tv_Lokasi_value.setText(response.body().getState());
                    tv_Subuh_value.setText(response.body().getItems().get(0).getFajr());
                    tv_Syuruq_value.setText(response.body().getItems().get(0).getShurooq());
                    tv_Dzuhur_value.setText(response.body().getItems().get(0).getDhuhr());
                    tv_Ashar_value.setText(response.body().getItems().get(0).getAsr());
                    tv_Magrib_value.setText(response.body().getItems().get(0).getMaghrib());
                    tv_Isya_value.setText(response.body().getItems().get(0).getIsha());
//                }else{
//
//                }
                }
            }

            @Override
            public void onFailure(Call<ModelJadwal> call, Throwable t) {
                ProgressDialog.dismiss();
                Toast.makeText(JadwalSholatActivity.this, "Maaf, Cek Koneksi Kamu Lagi Ya", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
