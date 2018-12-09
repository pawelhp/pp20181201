package pl.pp.w8.null_avoid;

public class House {
    private BasthRoom basthRoom;
    public House(BasthRoom basthRoom){
        this.basthRoom = basthRoom;
    }

    @Override
    public String toString() {
        return "House {" +
                "basthRoom=" + basthRoom +
                '}';
    }

    public BasthRoom getBasthRoom() {
        return basthRoom;
    }

    public void setBasthRoom(BasthRoom basthRoom) {
        this.basthRoom = basthRoom;
    }

}
