package pl.pp.my_git_pp;

public class Car {
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

    public Car(String brant) {
        this.brant = brant;
    }
}
