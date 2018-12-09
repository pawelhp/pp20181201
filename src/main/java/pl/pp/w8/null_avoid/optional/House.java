package pl.pp.w8.null_avoid.optional;

import java.util.Optional;

public class House {
    private BasthRoom basthRoom;
    public House(BasthRoom basthRoom){
        this.basthRoom = basthRoom;
    }

    @Override
    public String toString() {
        return "House{" +
                "basthRoom=" + basthRoom +
                '}';
    }

    public Optional<BasthRoom> getBasthRoom() {
        return Optional.ofNullable( basthRoom);
    }

    public void setBasthRoom(BasthRoom basthRoom) {
        this.basthRoom = basthRoom;
    }

}
