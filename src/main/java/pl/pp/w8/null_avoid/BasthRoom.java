package pl.pp.w8.null_avoid;

public class BasthRoom {

    public Sink getSink() {
        return sink;
    }

    public void setSink(Sink sink) {
        this.sink = sink;
    }

    public BasthRoom(Sink sink) {
        this.sink = sink;
    }

    private Sink sink;
}
