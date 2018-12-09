package pl.pp.w8.inner_class;

public class Vehicle {

    private String vehicleName;
    private  Wheel wheel;

    public Vehicle(String vehicleName, Wheel wheel) {
        this.vehicleName = vehicleName;
        this.wheel = wheel;
    }

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public static class Wheel {
        private int sizeInInches;

        public Wheel(int sizeInInches) {
            this.sizeInInches = sizeInInches;
        }

        @Override
        public String toString() {
            return "Wheel{" +
                    "sizeInInches=" + sizeInInches +
                    '}';
        }
    }
}
