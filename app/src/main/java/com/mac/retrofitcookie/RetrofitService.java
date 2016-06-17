package com.mac.retrofitcookie;

import android.util.Log;

import com.google.gson.GsonBuilder;

import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Ihsanulhaq on 3/29/2016.
 */
public class RetrofitService {
    public final String authority = "mktgspreest.searshc.com";
    //PD environment
    public static final String BASE_URL = "https://fountit.com/";
    private FountAPIService restService;
    private ActivityUpdate activityUpdater;
    public RetrofitService(ActivityUpdate listener) {
        this.activityUpdater = listener;
        CustomCookieManager manager = new CustomCookieManager(activityUpdater);

        OkHttpClient client = new OkHttpClient.Builder()
                .cookieJar(new JavaNetCookieJar(manager))
                .build();

        //client.setCookieHandler(manager);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()))
                .build();
        this.restService = retrofit.create(FountAPIService.class);
    }

    public void getLogin() {
        Call<ResponseAPI> call = restService.loginUser("simplek_@hotmail.com", "denken16");
        call.enqueue(new Callback<ResponseAPI>() {
            @Override
            public void onResponse(Call<ResponseAPI> call, Response<ResponseAPI> response) {
                response.body().toString();
            }

            @Override
            public void onFailure(Call<ResponseAPI> call, Throwable t) {
                Log.e("TAG", t.getLocalizedMessage());
            }
        });

    }

    public interface ActivityUpdate{
        public void onUpdate(String s);
    }
}
