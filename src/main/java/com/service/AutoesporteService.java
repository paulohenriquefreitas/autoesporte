package com.service;

import com.model.AutoEsporte;

import retrofit.RestAdapter;

public class AutoesporteService {
	
	public AutoEsporte find() {
		RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("https://feedapp.herokuapp.com")
                .setLogLevel(RestAdapter.LogLevel.FULL).build();
		AutoService service = restAdapter
                .create(AutoService.class);
		return  service.get();
	}
}
