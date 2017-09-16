package com.pug3eye.mvc_template.manager.http;

import com.pug3eye.mvc_template.dao.PhotoItemCollectionDao;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by pug3eye on 13/09/2017.
 */

public interface ApiService {

    @GET("posts")
    Call<PhotoItemCollectionDao> loadPhotoList();

}
