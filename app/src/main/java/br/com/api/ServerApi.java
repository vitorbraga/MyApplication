package br.com.api;

import java.util.ArrayList;

import br.com.model.Checkin;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Header;

public interface ServerApi {

    @GET("/getHistory/")
    void getHistory(@Header("Content-Type") String contentType, Callback<ArrayList<Checkin>> response);


}
