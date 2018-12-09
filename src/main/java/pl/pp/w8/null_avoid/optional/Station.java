package pl.pp.w8.null_avoid.optional;

import pl.com.maps.warszawa.java14.w8.null_avoid.football.Chairs;

public class Station {

    private Chairs chairs;

    @Override
    public String toString() {
        return "Station{" +
                "chairs=" + chairs +
                '}';
    }

    public Chairs getChairs() {
        return chairs;
    }

    public void setChairs(Chairs chairs) {
        this.chairs = chairs;
    }

    public Station(Chairs chairs) {
        this.chairs = chairs;
    }
}
