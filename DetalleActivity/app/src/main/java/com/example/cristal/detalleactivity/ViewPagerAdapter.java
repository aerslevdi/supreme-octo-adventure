package com.example.cristal.detalleactivity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentStatePagerAdapter{
    private List<Fragment> fragments = new ArrayList<>();

    private List <MovieDB> datos;

    public ViewPagerAdapter(FragmentManager fm,  List<MovieDB> datos) {
        super(fm);
        this.datos = datos;
        for (MovieDB movieDB : datos){
            DetalleFragment detalleView = DetalleFragment.fabrica(movieDB);
            fragments.add(detalleView);
        }
    }



    @Override
    public Fragment getItem(int position) {
        return this.fragments.get(position);
    }

    @Override
    public int getCount() {
        return this.fragments.size();
    }
}
