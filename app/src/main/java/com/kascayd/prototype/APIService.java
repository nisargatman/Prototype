package com.kascayd.prototype;

import com.kascayd.prototype.retro.ParkRequest;
import com.kascayd.prototype.retro.ParkResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;


/**
 * Created by Nisarg Mehta on 04/08/2017.
 */

public interface APIService {
    @GET("version")
    public void getVersion(Callback<List<Version>> response);

    @Headers("Content-Type: application/json")
    @POST("park/check")
    Call<ParkResponse> savePost(@Body ParkRequest body);
}