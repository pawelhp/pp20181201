package pl.pp.w8.inner_class;

import java.util.ArrayList;
import java.util.List;

public class House {

    private List<Apartament> apartamentList;
    private String houseName;

    public House(String houseName) {
        this.houseName = houseName;
        apartamentList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            apartamentList.add(new Apartament(30));
        }
    }

    public House() {
        apartamentList = new ArrayList<>();
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public void addApartment(Apartament a){
        apartamentList.add(a);
    }

    public class Apartament {
        int sizeInSquareM;

        public Apartament(int sizeInSquareM) {

            this.sizeInSquareM = sizeInSquareM;
        }

        @Override
        public String toString() {
            return "Apartament{" +
                    "sizeInSquareM=" + sizeInSquareM +
                    '}';
        }
        public void printNameOfHause(){
            System.out.println(House.this.houseName /* lub szybciej:   houseName */);
        }
    }
}
