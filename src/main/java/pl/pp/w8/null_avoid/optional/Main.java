package pl.pp.w8.null_avoid.optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Sink sink = new Sink("KOLO");
        House houseWithOutBR = new House(null);
        House houseWithBRNoSink = new House(new BasthRoom(null));
        House houseWithBRWithSink = new House(new BasthRoom(new Sink("cos tam")));


        // nigdy tak nie piszemy!!!!! - bo null
        Optional<String> cosTam0;

        // a tak
        Optional<String> cosTam = Optional.empty();

        Optional<String> stringForSure = Optional.of("Cos tam 1");

        if (stringForSure.isPresent())
            System.out.println(stringForSure.get());

        String cosNull = null;
        Optional<String> absentString = Optional.ofNullable(null);


        absentString.ifPresent(x -> System.out.println(x));

    }

    private static void printMapFlatMap(House house) {
        Optional.ofNullable(house)
                .flatMap(house1 -> house1.getBasthRoom())
                .flatMap(basthRoom -> basthRoom.getSink())
                .map(sink -> sink.getLabel()) /* nie ma flatmapa bo gellqabel zwraca zwykłego stringa a nie pudełka*/
                .ifPresent(s -> System.out.println(s));
/*
* map zwróci
* flaatmap  - dajemy jesli metoda mapująca zwraca optional
* */

    }


    private static void printLabelWithLambda1(House house) {
        Optional.ofNullable(house)
                .ifPresent(house1 -> house1.getBasthRoom()
                        .ifPresent(basthRoom1 -> basthRoom1.getSink()
                                .ifPresent(sink -> System.out.println(sink.getLabel()))));

    }


    private static void printLableSlowwMode(House house) {
        String label = "empty";
        Optional<House> maybyHouse = Optional.ofNullable(house);
        if (maybyHouse.isPresent()) {
            Optional<BasthRoom> maybeBasthRoom = maybyHouse.get().getBasthRoom();
            if (maybeBasthRoom.isPresent()) {
                Optional<Sink> maybeSink = maybeBasthRoom.get().getSink();
                if (maybeSink.isPresent()) {
                    label = "";
                }
            }
        }
    }


}
