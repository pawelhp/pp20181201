package pl.pp.w8.null_avoid.optional;

public class FootballClub {
    private Station station;

    @Override
    public String toString() {
        return "FootballClub{" +
                "station=" + station +
                '}';
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public FootballClub(Station station) {
        this.station = station;
    }
}
