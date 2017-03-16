package com.example.mlebeau.td1;


/**
 * Created by mlebeau on 14/03/2017.
 */

public class Position {
    private double lat;
    private double lng;

    public Position(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }
}
