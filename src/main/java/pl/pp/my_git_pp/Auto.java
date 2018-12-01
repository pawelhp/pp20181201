package pl.pp.my_git_pp;

public class Auto {
    private String brant;
    private String model;
    public String getBrant() {
        return brant;
    }

    public void setBrant(String brant) {
        this.brant = brant;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Auto(String brant) {
        this.brant = brant;
    }

    public Auto(String brant, String model) {
        this.brant = brant;
        this.model = model;
    }
}
