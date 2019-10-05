package tech.toughput.mobiledzikir.api;

import retrofit2.Call;
import retrofit2.http.GET;
import tech.toughput.mobiledzikir.model.ModelJadwal;

/**
 * Created by ASUS-X454Y on 20/04/2019.
 */

public interface ApiService {
    @GET("jakarta.json")
    Call<ModelJadwal> getJadwal();
}
