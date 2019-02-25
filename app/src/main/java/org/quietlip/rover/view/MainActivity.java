package org.quietlip.rover.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.quietlip.rover.R;
import org.quietlip.rover.controller.NasaAdapater;
import org.quietlip.rover.model.NasaPhotos;
import org.quietlip.rover.network.NasaService;
import org.quietlip.rover.network.RetrofitSingleton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);

        RetrofitSingleton.getInstance().create(NasaService.class).getPhotos().enqueue(new Callback<NasaPhotos>() {
            @Override
            public void onResponse(Call<NasaPhotos> call, Response<NasaPhotos> response) {
                recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
                recyclerView.setAdapter(new NasaAdapater(response.body().getPhotos()));
            }

            @Override
            public void onFailure(Call<NasaPhotos> call, Throwable t) {

            }
        });
    }
}
