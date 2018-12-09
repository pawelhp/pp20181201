package pl.pp.w8.inner_class;

import static pl.com.maps.warszawa.java14.w8.inner_class.Vehicle.Wheel;

public class TestW8 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("vicycle", new Wheel(17));
      Wheel wheel = new Wheel(4);

      House house = new House();

    }
}
