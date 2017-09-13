package com.pug3eye.mvc_template.manager;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pug3eye.mvc_template.manager.http.ApiService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by nuuneoi on 11/16/2014.
 */
public class HttpManager {

    private static HttpManager instance;

    public static HttpManager getInstance() {
        if (instance == null)
            instance = new HttpManager();
        return instance;
    }

    private Context mContext;
    private ApiService service;

    private HttpManager() {
        mContext = Contextor.getInstance().getContext();

                    // solve : 2017-09-13T11:17:45-04:00 format
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://nuuneoi.com/courses/500px/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        service = retrofit.create(ApiService.class);

//
//        /************************
//         *  Food Apis
//         ***********************/
//        // test Food Apis
//        Retrofit retrofit1 = new Retrofit.Builder()
//                .baseUrl("http://192.168.1.49:3000/api/v1/posts/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        service = retrofit1.create(ApiService.class);
    }

    public ApiService getService() {
        return service;
    }
}
