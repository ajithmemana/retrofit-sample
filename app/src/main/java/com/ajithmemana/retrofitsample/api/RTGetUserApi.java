package com.ajithmemana.retrofitsample.api;

import android.content.Context;
import android.widget.Toast;

import com.ajithmemana.retrofitsample.api.beans.response.RTUser;
import com.ajithmemana.retrofitsample.app.RTConstants;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by ajith on 29/6/15.
 * API class, all communications and error handling with retrofit happens here.
 * Retrofit returns success and failures via Callback
 */
public class RTGetUserApi implements Callback<RTUser>{

    RTWebService webService;
    // Response object to hold data
    RTUser userDetails;
    // Context - for showing toast(testing)
    Context mContext;

    public RTGetUserApi(Context context) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(RTConstants.END_POINT)
                .build();
        webService = restAdapter.create(RTWebService.class);
        mContext = context;
    }

    public void getUserInfoFromServer(){
        webService.getUserDetails(this);
    }

    @Override
    public void success(RTUser rtUser, Response response) {
        // Retrofit returns data here
        userDetails = rtUser;
        Toast.makeText(mContext, "Success: "+userDetails.getTitle() , Toast.LENGTH_SHORT).show();

    }

    @Override
    public void failure(RetrofitError error) {
        Toast.makeText(mContext, "Failed" , Toast.LENGTH_SHORT).show();

    }
}
