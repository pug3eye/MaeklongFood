package com.pug3eye.mvc_template.dao;

/**
 * Created by pug3eye on 14/09/2017.
 */

    import java.util.List;
    import com.google.gson.annotations.Expose;
    import com.google.gson.annotations.SerializedName;

public class FoodItemCollectionDao {
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("data")
    @Expose
    private List<FoodItemDao> data = null;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<FoodItemDao> getData() {
        return data;
    }

    public void setData(List<FoodItemDao> data) {
        this.data = data;
    }
}
