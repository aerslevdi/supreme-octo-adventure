package com.example.cristal.detalleactivity;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.AdapterViewHolder>{

    private List<Cast> casts;

    public Adapter(List<Cast> casts) {
        this.casts = casts;
    }

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.card_actor, parent, false);
        AdapterViewHolder actorViewHolder = new AdapterViewHolder(view);
        return actorViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder holder, int position) {
        Cast cast = casts.get(position);
        holder.cargar(cast);

    }

    @Override
    public int getItemCount() {
        return casts.size();
    }

    class AdapterViewHolder extends RecyclerView.ViewHolder {


        private TextView nombreActor;
        private ImageView imagenPerfil;

        public AdapterViewHolder(final View itemView) {
            super(itemView);
            nombreActor = itemView.findViewById(R.id.actorNombre);
            imagenPerfil = itemView.findViewById(R.id.imageActor);


        }
        public void cargar (Cast cast){
            nombreActor.setText(cast.getName());
            imagenPerfil.setImageResource(cast.getProfile_path());

            //TODO String path = cast.getProfile_path();
            //Glide.with(itemView.getContext()).load("http://image.tmdb.org/t/p/w185/"+path).into(imagen);

        }
    }

}
