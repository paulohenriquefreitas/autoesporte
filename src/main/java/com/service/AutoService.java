package com.service;

import com.model.AutoEsporte;

import retrofit.http.GET;

public interface AutoService {
        @GET("/feed")
        AutoEsporte get();
}
