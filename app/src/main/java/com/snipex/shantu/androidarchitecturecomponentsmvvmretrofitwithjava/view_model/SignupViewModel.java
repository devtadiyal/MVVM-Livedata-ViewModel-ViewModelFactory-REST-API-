package com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.view_model;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;
import com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.repository.SignupRepository;
import com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.response.SignupResponse;

public class SignupViewModel extends AndroidViewModel {

    private SignupRepository signupRepository;
    private LiveData<SignupResponse> signupResponseLiveData;



    public SignupViewModel(@NonNull Application application,String id,
                           String key,
                           String secret) {
        super(application);

        signupRepository = new SignupRepository();
        this.signupResponseLiveData = signupRepository.getSignup(id,
                key,
                secret);
    }

    public LiveData<SignupResponse> getSignupResponseLiveData() {
        return signupResponseLiveData;
    }


}

