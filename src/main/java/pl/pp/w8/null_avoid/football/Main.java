package pl.pp.w8.null_avoid.football;

import pl.com.maps.warszawa.java14.w8.null_avoid.optional.FootballClub;

import java.util.Optional;

// FoolballClub ->nie jest nulem Stadion -> Chairs ->Numberc
public class Main {

    private static void getChairNumber(FootballClub footballClub){
        Optional.ofNullable(footballClub)
                .map(footballClub1 -> footballClub.getStation())
                .map(station -> station.getChairs())
                .map(chairs -> chairs.getNumber())
                .map(number -> number)
                .ifPresent(integer -> System.out.println("number: " + integer));
    }

}
