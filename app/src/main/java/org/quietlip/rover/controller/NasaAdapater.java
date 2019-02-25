package org.quietlip.rover.controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.quietlip.rover.R;
import org.quietlip.rover.model.Photos;
import org.quietlip.rover.view.NasaViewHolder;

import java.util.List;

public class NasaAdapater extends RecyclerView.Adapter<NasaViewHolder> {
    private List<Photos> photosList;

    public NasaAdapater(List<Photos> photosList) {
        this.photosList = photosList;
    }

    @NonNull
    @Override
    public NasaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        return new NasaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NasaViewHolder nasaViewHolder, int i) {
    nasaViewHolder.onBind(photosList.get(i));
    }

    @Override
    public int getItemCount() {
        return photosList.size();
    }
}
