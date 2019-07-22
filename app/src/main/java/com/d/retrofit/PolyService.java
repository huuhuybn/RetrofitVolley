package com.d.retrofit;

import com.d.retrofit.model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PolyService {


    //http://asian.dotplays.com/wp-json/wp/v2/posts?category=18

    @GET("/wp-json/wp/v2/posts")
    Call<List<Post>> getPostOfCategory(@Query("category") String category);


}
