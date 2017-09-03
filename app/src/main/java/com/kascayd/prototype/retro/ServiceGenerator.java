package com.kascayd.prototype.retro;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by adityaruia on 01/09/17.
 */

public class ServiceGenerator {

    //private static final String BASE_URL = "http://www.kascayd.co.uk:8080/ParkServices/v1/";


    private static Retrofit retrofit = null;

    public static Retrofit getClient(String baseUrl) {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
