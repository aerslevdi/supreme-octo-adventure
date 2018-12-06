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
    private AdapterListener adapterListener;

    public Adapter(List<Cast> casts, AdapterListener adapterListener) {
        this.casts = casts;
        this.adapterListener = adapterListener;
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

        private ImageView imagen;
        private TextView nombre;

        public ActorViewHolder(final View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.actorNombre);
            imagen = itemView.findViewById(R.id.imageActor);


        }
        public void cargar (Cast cast){
            nombre.setText(cast.getName());
            //TODO String path = cast.getProfile_path();
            //Glide.with(itemView.getContext()).load("http://image.tmdb.org/t/p/w185/"+path).into(imagen);

        }
    }

    public interface AdapterListener {
        void recibir();
    }

}
