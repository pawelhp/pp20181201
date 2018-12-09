package pl.pp.w8.lambda;

import pl.com.maps.warszawa.java14.interface_exaple.Flyble;

public class Main {

    public static void main(String[] args) {
        Flyble bird = new Bird();
        Flayble plan = new Flayble() {
            @Override
            public void fly() {
                System.out.println("jestem samolotem");
            }
        };

        Flayble bullet = () -> System.out.println("se jestem bullet");

        Moveable moveable = new Moveable() {
            @Override
            public void run() {
                System.out.println("cokolwiek");
            }
        };

        Moveable moveable11 = () -> System.out.println("śmos");
        Swimable swimable1 = (distance,speed) -> System.out.println("ccccccc: " + distance);
        swimable1.swim(10,20);

        FormulaConverter converter = celsius ->  (celsius * 9.0/5.0 ) + 32.00; /* retur nie jest potrzebny*/
        double x = converter.fromCelToFah (12.0);

        Mylambda  mylambda = n -> {
            String bufor ="";
            for(int i = 0; i< n ; i++) {
                bufor = bufor.concat("smos!");
            }
            //Object eee= getClass();
            return bufor;

        };

        FlyableCleaner cleaner = new FlyableCleaner();

       cleaner.clean(() -> {});


        System.out.println(mylambda.test(5) );
//
//        TestSwimable testSwimable = new TestSwimable();
//        testSwimable.go((2,2.3) -> System.out.println("") );
    }




}
