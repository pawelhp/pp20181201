package pl.pp.w8.null_avoid.stream;

public class Country {
    private String name;
    private long numberOfPeople;
    private double area;
    private double averagePayChech;

    public Country(String name, long numberOfPeople, double area, double averagePayChech) {
        this.name = name;
        this.numberOfPeople = numberOfPeople;
        this.area = area;
        this.averagePayChech = averagePayChech;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", numberOfPeople=" + numberOfPeople +
                ", area=" + area +
                ", averagePayChech=" + averagePayChech +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(long numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getAveragePayChech() {
        return averagePayChech;
    }

    public void setAveragePayChech(double averagePayChech) {
        this.averagePayChech = averagePayChech;
    }
}
