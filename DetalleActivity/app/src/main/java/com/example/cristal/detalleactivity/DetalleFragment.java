package com.example.cristal.detalleactivity;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetalleFragment extends Fragment {

    public static final String KEY_MOVIEDB="movieDB";
    public static final String KEY_ACTOR = "actores";


    public DetalleFragment() {
        // Required empty public constructor
    }

    public static DetalleFragment fabrica(MovieDB movieDB){
        DetalleFragment fragment = new DetalleFragment();
        List<Cast> actor = new ArrayList<>();
        MovieDB dato = movieDB;

        Bundle bundle = new Bundle();

        bundle.putSerializable(DetalleFragment.KEY_MOVIEDB, dato);
        //TODO bundle.putParcelableArrayList(DetalleFragment.KEY_ACTOR, actor);
        fragment.setArguments(bundle);

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_detalle, container, false);
        Bundle bundle = getArguments();
        Object movieObj = bundle.getSerializable(KEY_MOVIEDB);
        MovieDB movieDB = (MovieDB)movieObj;
        //TODO  List<Cast> actores= bundle.getParcelableArrayList(KEY_ACTOR);

        TextView tituloView = view.findViewById(R.id.tituloPelicula);
        //Adapter actorAdapter = new Adapter(actores, this);
        TextView generoView = view.findViewById(R.id.genero);
        TextView duracionView = view.findViewById(R.id.duracion);
        TextView fechaView = view.findViewById(R.id.fecha);
        TextView scoreView = view.findViewById(R.id.scoreNumero);
        TextView metaView = view.findViewById(R.id.scoreMeta);
        TextView premiosView = view.findViewById(R.id.premiosNumero);
        RecyclerView recyclerView = view.findViewById(R.id.actoresRecycler);
        ImageView trailerView = view.findViewById(R.id.imagenVideo);

        tituloView.setText(movieDB.getTitle());
        //TODO String path = movieDB.getPoster_path();
        //Glide.with(this).load("http://image.tmdb.org/t/p/w185/"+movieDB.getPoster_path()).into(trailerView);

        generoView.setText(movieDB.getOverview());
        duracionView.setText(movieDB.getRuntime());
        fechaView.setText(movieDB.getRelease_date());

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        //recyclerView.setAdapter(actorAdapter);



        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }
}
