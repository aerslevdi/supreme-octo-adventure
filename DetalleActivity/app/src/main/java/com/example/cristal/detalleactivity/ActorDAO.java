package com.example.cristal.detalleactivity;

import java.util.ArrayList;
import java.util.List;

public class ActorDAO {
    public List<Cast> getActores() {
        List<Cast> actores = new ArrayList<>();
        actores.add(new Cast("Robert Downey Jr",1, R.drawable.robertdowneyjr));
        actores.add(new Cast("Chris Hemsworth",2, R.drawable.chrishemsworth));
        actores.add(new Cast("Mark Ruffalo", 3,R.drawable.markruffalo));
        actores.add(new Cast("Chris Evans", 4,R.drawable.chrisevans));
        actores.add(new Cast("Scarlett Johansson",5, R.drawable.scarlettjohansson));
        actores.add(new Cast("Don Cheadle",6, R.drawable.doncheadle));
        actores.add(new Cast("Benedict Cumberbatch", 7,R.drawable.benedictcumberbatch));
        actores.add(new Cast("Tom Holland", 8,R.drawable.tomholland));
        actores.add(new Cast("Chadwick Boseman",9, R.drawable.chadwickboseman));
        actores.add(new Cast("Zoe Zaldana", 10,R.drawable.zoezaldana));
        actores.add(new Cast("Karen Gillan",11, R.drawable.karengillian));
        actores.add(new Cast("Tom Hiddleston",12, R.drawable.tomhiddleston));
        actores.add(new Cast("Paul Bettany",13, R.drawable.paulbettany));
        actores.add(new Cast("Elizabeth Olsen",14, R.drawable.elisabetholsen));
        actores.add(new Cast("Anthony Mackie", 15, R.drawable.robertdowneyjr));
        actores.add(new Cast("Sebastian Stan",16, R.drawable.sebastianstan));
        actores.add(new Cast("Idris Elba", 17, R.drawable.idriselba));
        actores.add(new Cast("Danai Gurira",18, R.drawable.danaigurira));
        actores.add(new Cast("Peter Dinklage",19, R.drawable.peterdinklage));
        actores.add(new Cast("Benedict Wong",20, R.drawable.benedictwong));
        return actores;


    }


}
