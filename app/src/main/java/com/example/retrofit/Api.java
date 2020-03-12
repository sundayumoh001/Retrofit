package com.example.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Belal on 10/2/2017.
 */

public interface Api {

//    String BASE_URL = "https://simplifiedcoding.net/demos/";
    String BASE_URL = "https://raw.githubusercontent.com/Nsikaktopdown/Recipe/master/";
//    @GET("marvel")
    @GET("Recipe.json")

    Call<List<Hero>> getHeroes();
}