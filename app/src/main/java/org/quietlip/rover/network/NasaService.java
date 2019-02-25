package org.quietlip.rover.network;

import org.quietlip.rover.model.NasaPhotos;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NasaService {
@GET("mars-photos/api/v1/rovers/curiosity/photos?sol=1&api_key=DEMO_KEY")
Call<NasaPhotos> getPhotos();
}
