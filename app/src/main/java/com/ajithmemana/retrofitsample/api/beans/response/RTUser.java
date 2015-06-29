package com.ajithmemana.retrofitsample.api.beans.response;

/**
 * Created by ajith on 29/6/15.
 * <p/>
 * Response Model class, object/variable names must match the names and structure from server
 * in order for GSON to bind data
 */
public class RTUser {
    private int userId;
    private int id;
    private String title;
    private String body;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
