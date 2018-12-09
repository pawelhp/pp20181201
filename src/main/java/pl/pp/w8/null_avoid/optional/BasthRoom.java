package pl.pp.w8.null_avoid.optional;

import java.util.Optional;

public class BasthRoom {

    public Optional<Sink> getSink() {
        return Optional.ofNullable(sink);
    }

    public void setSink(Sink sink) {
        this.sink = sink;
    }

    public BasthRoom(Sink sink) {
        this.sink = sink;
    }

    private Sink sink;
}
