package com.mac.retrofitcookie;


import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface FountAPIService {
// Routes
// This file defines all application routes (Higher priority routes first)
// ~~~~

    ///user/login (parameter: email, password)
    @Headers("Cache-Control: max-age=640000")
    @FormUrlEncoded
    @POST("lifestyle/user/login")
    Call<ResponseAPI> loginUser(@Field("email") String email, @Field("password") String password);
}