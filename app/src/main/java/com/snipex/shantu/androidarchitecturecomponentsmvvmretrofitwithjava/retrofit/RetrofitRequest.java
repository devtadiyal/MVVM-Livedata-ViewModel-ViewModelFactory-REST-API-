package com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitRequest {

    private static Retrofit retrofit;
    private static Retrofit retrofit2;
    private static final String BASE_URL = "https://newsapi.org/";
    public static final String BASE_URL2 =
            "https://development-review.net/ecommerce/wp-json/";

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static Retrofit getRetrofitInstance2() {
        if (retrofit2 == null) {
            retrofit2 = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL2)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit2;
    }
}
