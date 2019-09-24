package com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.response.ArticleResponse;
import com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.response.SignupResponse;
import com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.retrofit.ApiRequest;
import com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.retrofit.RetrofitRequest;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignupRepository {
    private static final String TAG = SignupRepository.class.getSimpleName();
    private ApiRequest apiRequest;

    public SignupRepository() {
        apiRequest = RetrofitRequest.getRetrofitInstance2().create(ApiRequest.class);
    }

    public LiveData<SignupResponse> getSignup(String id, String key, String secret) {
        final MutableLiveData<SignupResponse> data = new MutableLiveData<>();
        apiRequest.userdetails(id, key, secret)
                .enqueue(new Callback<SignupResponse>() {


                    @Override
                    public void onResponse(Call<SignupResponse> call, Response<SignupResponse> response) {
                        Log.d(TAG, "onResponse response:: " + response);


                        if (response.body() != null) {
                            data.setValue(response.body());

                            Log.d(TAG, "articles total result:: " + response.body().getFirst_name());
                            Log.d(TAG, "articles size:: " + response.body().getEmail());
                            Log.d(TAG, "articles title pos 0:: " + response.body().getLast_name());
                        }
                    }

                    @Override
                    public void onFailure(Call<SignupResponse> call, Throwable t) {
                        data.setValue(null);
                    }
                });
        return data;
    }

}
