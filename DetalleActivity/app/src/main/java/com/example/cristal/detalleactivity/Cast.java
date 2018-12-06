package com.example.cristal.detalleactivity;

import java.io.Serializable;

public class Cast implements Serializable{

    private String name;
    private Integer id;
    private Integer profile_path;

    public Cast(String name, Integer id, Integer profile_path) {
        this.name = name;
        this.id = id;
        this.profile_path = profile_path;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getProfile_path() {
        return profile_path;
    }
}
