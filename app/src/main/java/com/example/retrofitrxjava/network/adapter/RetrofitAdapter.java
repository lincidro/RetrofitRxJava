package com.example.retrofitrxjava.network.adapter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitAdapter {

    public static Gson gson;
    public static Retrofit retrofit;
    public static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    public static synchronized Retrofit getInstance() {

        if(retrofit == null) {
            if(gson == null) {
                gson = new GsonBuilder().setLenient().create();
            }
        }

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        return retrofit;
    }
}
