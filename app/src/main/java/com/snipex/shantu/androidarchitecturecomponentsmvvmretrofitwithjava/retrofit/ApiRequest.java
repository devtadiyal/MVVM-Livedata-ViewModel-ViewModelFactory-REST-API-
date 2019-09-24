package com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.retrofit;

import com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.response.ArticleResponse;
import com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.response.SignupResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiRequest {

    @GET("v2/everything/")
    Call<ArticleResponse> getMovieArticles(
            @Query("q") String query,
            @Query("apikey") String apiKey
    );

    @GET("wc/v3/customers/{id}")
    Call<SignupResponse> userdetails(@Path("id") String id,
                                     @Query("consumer_key") String key,
                                     @Query("consumer_secret") String secret);

}
