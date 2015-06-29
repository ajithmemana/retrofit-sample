package com.ajithmemana.retrofitsample.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ajithmemana.retrofitsample.R;
import com.ajithmemana.retrofitsample.api.RTGetUserApi;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void callApiOnButtonClick(View view){
        // Create an api object, call the getUser method
        RTGetUserApi getUserApi = new RTGetUserApi(this);
        getUserApi.getUserInfoFromServer();
    }
}
