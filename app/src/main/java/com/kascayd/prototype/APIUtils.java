package com.kascayd.prototype;

import com.kascayd.prototype.retro.ServiceGenerator;

/**
 * Created by adityaruia on 02/09/17.
 */

public class APIUtils {

    private APIUtils() {}

    public static final String BASE_URL = "http://www.kascayd.co.uk:8080/ParkServices/v1/";

    public static APIService getAPIService() {

        return ServiceGenerator.getClient(BASE_URL).create(APIService.class);
    }
}
