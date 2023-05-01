package com.example.entryform.retrofit;

import com.google.gson.Gson;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService {
    private Retrofit retrofit;
    public RetrofitService(){
        initializeRetrofit();
    }
    private  String ip = "192.168.132";
    private  String pn = "9000";


    private void initializeRetrofit() {
    retrofit = new Retrofit.Builder()
            .baseUrl("http://"+ip+":"+pn)
            .addConverterFactory(GsonConverterFactory.create(new Gson()))
            .build();
    }

    public Retrofit getRetrofit(){
        return  retrofit;
    }

}
