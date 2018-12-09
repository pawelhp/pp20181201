package pl.pp.w8.null_avoid.football;

import pl.com.maps.warszawa.java14.w8.null_avoid.optional.Numberc;

public class Chairs {

    private Numberc number;

    @Override
    public String toString() {
        return "Chairs{" +
                "number=" + number +
                '}';
    }

    public Numberc getNumber() {
        return number;
    }



    public void setNumber(Numberc number) {
        this.number = number;
    }

    public Chairs(Numberc number) {
        this.number = number;
    }
}
