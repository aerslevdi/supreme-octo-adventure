package com.example.cristal.detalleactivity;

import java.util.ArrayList;
import java.util.List;

public class MovieDBDAO {

    public List<MovieDB> getMovies() {

        List<MovieDB> movieDBS = new ArrayList<>();
        movieDBS.add(new MovieDB("Finding Nemo", 5, "2003",100, "Animation", "After his son is captured in the Great Barrier Reef and taken to Sydney, a timid clownfish sets out on a journey to bring him home.", R.drawable.findingnemo, 5,1,   R.drawable.movie1infantiles  ));
        movieDBS.add(new MovieDB("High School Musical", 5,  "20-01-2006", 98, "Musical","A popular high school athlete and an academically gifted girl get roles in the school musical and develop a friendship that threatens East High's social order.", R.drawable.hsmtrailer, 2,7, R.drawable.movie2infantiles ));
        movieDBS.add(new MovieDB("Maleficent",5,  "20-01-2006", 98, "Musical","A popular high school athlete and an academically gifted girl get roles in the school musical and develop a friendship that threatens East High's social order.",R.drawable.maleficenttrailer ,3,7, R.drawable.movie3infantiles));
        movieDBS.add(new MovieDB("Los Increibles 2",5,  "20-01-2006", 98, "Musical","A popular high school athlete and an academically gifted girl get roles in the school musical and develop a friendship that threatens East High's social order.", R.drawable.incrediblestwo,4,7, R.drawable.movie4infantiles));
        movieDBS.add(new MovieDB("Los Increibles",5,  "20-01-2006", 98, "Musical","A popular high school athlete and an academically gifted girl get roles in the school musical and develop a friendship that threatens East High's social order.", R.drawable.incrediblestrailer,5,7, R.drawable.movie5infantiles));

        return movieDBS;
    }
}
