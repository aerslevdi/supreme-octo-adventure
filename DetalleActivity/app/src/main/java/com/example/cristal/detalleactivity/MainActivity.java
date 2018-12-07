package com.example.cristal.detalleactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        final MovieDB movieDB = new MovieDB("Finding Nemo", 5, "2003",100, "Animation", "After his son is captured in the Great Barrier Reef and taken to Sydney, a timid clownfish sets out on a journey to bring him home.", R.drawable.findingnemo, 5,1,   R.drawable.movie1infantiles);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MovieDetalleActivity.class);
                Bundle bundle = new Bundle();

                bundle.putSerializable(DetalleFragment.KEY_MOVIEDB, movieDB);
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });
    }



}
