package com.example.cristal.detalleactivity;

import android.content.Intent;
import android.graphics.Movie;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MovieDetalleActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detalle);


        List<MovieDB> datos;
        MovieDBDAO daoMovies = new MovieDBDAO();
        datos = daoMovies.getMovies();


        ViewPager viewPager = findViewById(R.id.viewPager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), datos);
        viewPager.setAdapter(adapter);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();



    }
}
