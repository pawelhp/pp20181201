package pl.pp.w8.null_avoid;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Sink sink = new Sink("KOLO");
        House houseWithOutBR = new House(null);
        House houseWithBRNoSink = new House(new BasthRoom(null));
        House houseWithBRWithSink = new House(new BasthRoom(new Sink("cos tam")));

        displayVaaryVaryNaive(houseWithOutBR /* houseWithBRWithSink*/);
    }

    private static void printMapFlatMap(House house) {
        /*opakowujemy pudełeczko może być null i dlatego nie dajemy of a dajemy ofNull*/
        Optional.ofNullable(house)
                .map(house1 -> house1.getBasthRoom())
                .map(basthRoom3 -> basthRoom3.getSink())
                .map(sink -> sink.getLabel())
                .ifPresent(s -> System.out.println(s));
        /*
         * map zwróci
         * flaatmap  - dajemy jesli metoda mapująca zwraca optional
         * */

    }


    /**
     * będą nule to wywali się
     *
     */
    private static void displayVaaryVaryNaive(House house){
        String label = house.getBasthRoom().getSink().getLabel();

        System.out.println(label);


    }

    private static void displayVaaryVaryNullCheck(House house){
        if(house !=null){
            BasthRoom basthRoom = house.getBasthRoom();
            if(basthRoom !=null){
                Sink sink = basthRoom.getSink();
                if(sink != null){
                    System.out.println("label: " + sink.getLabel());
                }
            }

        }else{
            System.out.println("");
        }

        System.out.println(house.getBasthRoom().getSink().getLabel());


    }





}
