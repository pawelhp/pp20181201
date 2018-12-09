package pl.pp.w8.null_avoid;

public class Sink {
    private String label;

    public Sink(String label) {
        this.label = validateLabel(label);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = validateLabel(label);
    }

    private String validateLabel(String label) {
        if (label == null) {
            throw new IllegalArgumentException("label cannot be null");
        }
        return label;
    }
}
