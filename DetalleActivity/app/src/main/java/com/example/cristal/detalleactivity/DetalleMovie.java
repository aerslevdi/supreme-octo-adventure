package com.example.cristal.detalleactivity;

import java.util.List;

public class DetalleMovie {

    private MovieDB movieDB;
    private List<Cast> cast;

    public DetalleMovie(MovieDB movieDB, List<Cast> cast) {
        this.movieDB = movieDB;
        this.cast = cast;
    }

    public MovieDB getMovieDB() {
        return movieDB;
    }

    public List<Cast> getCast() {
        return cast;
    }

    @Override
    public String toString() {
        return "DetalleMovie{" +
                "movieDB=" + movieDB +
                ", cast=" + cast +
                '}';
    }
}
