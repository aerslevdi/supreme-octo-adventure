package com.example.cristal.detalleactivity;

import android.content.Intent;

import java.io.Serializable;

public class MovieDB implements Serializable {

    private String title;
    private Integer popularity;
    private String release_date;
    private Integer runtime;
    private String genres;
    private String overview;
    private Integer trailer;
    private Integer vote_count;
    private Integer id;
    private Integer poster_path;

    public MovieDB(String title, Integer popularity, String release_date, Integer runtime, String genres, String overview, Integer trailer, Integer vote_count, Integer id, Integer poster_path) {
        this.title = title;
        this.popularity = popularity;
        this.release_date = release_date;
        this.runtime = runtime;
        this.genres = genres;
        this.overview = overview;
        this.trailer = trailer;
        this.vote_count = vote_count;
        this.id = id;
        this.poster_path = poster_path;
    }

    public String getTitle() {
        return title;
    }

    public Integer getVote_count() {
        return vote_count;
    }

    public Integer getId() {
        return id;
    }

    public Integer getPoster_path() {
        return poster_path;
    }

    public String getGenres() {
        return genres;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public String getRelease_date() {
        return release_date;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public String getOverview() {
        return overview;
    }

    public Integer getTrailer() {
        return trailer;
    }

    @Override
    public String toString() {
        return "MovieDB{" +
                "title='" + title + '\'' +
                ", vote_count=" + vote_count +
                ", id=" + id +
                ", poster_path='" + poster_path + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return (this.id.equals(((MovieDB) obj).id));
    }
}
