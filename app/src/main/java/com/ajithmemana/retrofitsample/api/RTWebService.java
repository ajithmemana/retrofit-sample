package com.ajithmemana.retrofitsample.api;

import com.ajithmemana.retrofitsample.api.beans.response.RTUser;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by ajith on 29/6/15.
 */
public interface RTWebService {

    // asynchronous api call, provide a callback
    // Annotate method with request type and relative url. Call back parameter will return result to caller
    @GET("/posts/1")
    void getUserDetails(Callback<RTUser> userCallback);


    //Synchronous call - example
    //Photo getUserPhoto(@Path("id") int id);


}
