package com.pug3eye.mvc_template.manager.http;

import com.pug3eye.mvc_template.dao.FoodItemCollectionDao;
import com.pug3eye.mvc_template.dao.PhotoItemCollectionDao;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by pug3eye on 13/09/2017.
 */

public interface ApiService {

    @POST("list")
    Call<PhotoItemCollectionDao> loadPhotoList();

    // test Food APIs
    @POST("posts")
    Call<FoodItemCollectionDao> loadFoodList();
}
