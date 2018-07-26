package com.example.gof.retrofitlearn;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostApi {
    String BASE_URL = "https://jsonplaceholder.typicode.com/";
    @GET("posts")
    Call<List<Post>> getPosts();
}
