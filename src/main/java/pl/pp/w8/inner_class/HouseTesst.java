package pl.pp.w8.inner_class;

public class HouseTesst {
    public static void main(String[] args) {
        House house = new House("Nowa rezydencja dla JWC");

        House betterHouse1 = new House();
        betterHouse1.setHouseName("java home");
        House.Apartament bb = betterHouse1.new Apartament(22);

        House betterHouse2 = new House();
        betterHouse2.setHouseName("C# home ");

        House.Apartament freindApartment = betterHouse2.new Apartament(44);

        bb.printNameOfHause();
        freindApartment.printNameOfHause();


    }
}
