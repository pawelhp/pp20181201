package pl.pp.w8.null_avoid.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Country> countryes = Arrays.asList(
                new Country("Poland",40_000_000,312,10000000),
                new Country("Russia",200000,600,200),
                new Country("China",300000,900,5010000),
                new Country("Holland",123444,123,33),
                new Country("Spain",20,1,1)
        );

        genericFilter(countryes,country -> country.getAveragePayChech()>300       );
        List<Country> countries =genericFilter(countryes,country -> country.getNumberOfPeople()>20 );
        countries.forEach(country -> System.out.println(country));
    }

    /* strumienie którym płyną obiekty */
    static List<Country> ninimalPeople(List<Country> countries, long minimalPeopleNumber){
        return countries.stream()
                .filter(country -> country.getNumberOfPeople() > minimalPeopleNumber)
                .collect(Collectors.toList());
    }


    static List<Country> genericFilter(List<Country> countries, Predicate<Country> predicate){
        return countries.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }


    public List<Country> getListMAnyPeople(List<Country> list,double minimalpeople){
        List<Country> result = new ArrayList<>();
        for(Country c : list){
            if(c.getNumberOfPeople()> minimalpeople){
                result.add(c);
            }
        }
        return result;

    }
}
