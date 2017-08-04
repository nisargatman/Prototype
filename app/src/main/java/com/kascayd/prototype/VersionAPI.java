package com.kascayd.prototype;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Nisarg Mehta on 04/08/2017.
 */

public interface VersionAPI {
    @GET("/v1/version")
    public void getVersion(Callback<List<Version>> response);
}
