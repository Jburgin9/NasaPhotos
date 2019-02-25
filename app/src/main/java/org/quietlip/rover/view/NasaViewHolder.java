package org.quietlip.rover.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.quietlip.rover.R;
import org.quietlip.rover.model.Photos;

public class NasaViewHolder extends RecyclerView.ViewHolder {
    private ImageView image;
    private TextView date;

    public NasaViewHolder(@NonNull View itemView) {
        super(itemView);

        image = itemView.findViewById(R.id.nasa_image_view);
        date = itemView.findViewById(R.id.date_text_view);
        
    }

    public void onBind(Photos p){
        date.setText(p.getEarth_date());
        Picasso.get()
                .load(p.getImg_src())
                .into(image);
    }
}
