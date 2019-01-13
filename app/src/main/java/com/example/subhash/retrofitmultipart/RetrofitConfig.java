package com.example.subhash.retrofitmultipart;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConfig {


        public static String BASE_URL = "http://192.168.0.103/";

        public static Retrofit getRetrofit() {

            return new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

}
