package com.example.cristal.detalleactivity;


import android.content.Context;
import android.content.Intent;
import android.graphics.Movie;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.ms.square.android.expandabletextview.ExpandableTextView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetalleFragment extends Fragment{

    public static final String KEY_MOVIEDB="movieDB";
    private ArrayList<MovieDB> favoritos;


    public DetalleFragment() {
        // Required empty public constructor
    }

    public static DetalleFragment fabrica(MovieDB movieDB){
        DetalleFragment fragment = new DetalleFragment();
        MovieDB dato = movieDB;

        Bundle bundle = new Bundle();

        bundle.putSerializable(DetalleFragment.KEY_MOVIEDB, dato);
        fragment.setArguments(bundle);

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_detalle, container, false);
        Toolbar toolbar = view.findViewById(R.id.toolbar);
        Bundle bundle = getArguments();
        FloatingActionButton fab = view.findViewById(R.id.fabButton);
        Object movieObj = bundle.getSerializable(KEY_MOVIEDB);
        final MovieDB movieDB = (MovieDB)movieObj;
        ActorDAO actorDAO = new ActorDAO();
        List<Cast> actores = new ArrayList<>(actorDAO.getActores());




        TextView tituloView = view.findViewById(R.id.tituloPelicula);
        Adapter actorAdapter = new Adapter(actores);
        TextView duracionView = view.findViewById(R.id.duracion);
        TextView fechaView = view.findViewById(R.id.fecha);
        TextView scoreView = view.findViewById(R.id.scoreNumero);
        TextView metaView = view.findViewById(R.id.scoreMeta);
        RecyclerView recyclerView = view.findViewById(R.id.actoresRecycler);
        ImageView trailerView = view.findViewById(R.id.imagenVideo);
        TextView shareMovie = view.findViewById(R.id.share);
        ImageView favList = view.findViewById(R.id.favoritosLista);
        TextView plot = view.findViewById(R.id.plot);
        shareMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos un share de tipo ACTION_SENT
                Intent share = new Intent(android.content.Intent.ACTION_SEND);

                //Indicamos que voy a compartir texto
                share.setType("text/plain");

                //Le agrego un título
                share.putExtra(Intent.EXTRA_SUBJECT, "Compartir en WhatsApp");
                //Le agrego el texto a compartir (Puede ser un link tambien)
                share.putExtra(Intent.EXTRA_TEXT, "Te recomiendo"+ movieDB.getTitle() + "/n Enviado desde PHIM");

                //Hacemos un start para que comparta el contenido.
                startActivity(Intent.createChooser(share, "Share link!"));
            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (favoritos == null){
                    favoritos = new ArrayList<>();
                    favoritos.add(movieDB);
                }else {
                    favoritos.add(movieDB);
                }
                Snackbar.make(view, "La pelicula ha sido agregada a tu lista", Snackbar.LENGTH_LONG).setAction("Undo", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        favoritos.remove(movieDB);
                    }
                }).show();
            }
        });
        favList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        tituloView.setText(movieDB.getTitle());
        //TODO String path = movieDB.getPoster_path();
        //Glide.with(this).load("http://image.tmdb.org/t/p/w185/"+movieDB.getPoster_path()).into(trailerView);


        duracionView.setText(movieDB.getRuntime().toString());
        fechaView.setText(movieDB.getRelease_date());
        scoreView.setText(movieDB.getPopularity().toString());
        metaView.setText(movieDB.getVote_count().toString());
        trailerView.setImageResource(movieDB.getTrailer());
        plot.setText(movieDB.getOverview());
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(actorAdapter);



        return view;
    }




    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }
}
