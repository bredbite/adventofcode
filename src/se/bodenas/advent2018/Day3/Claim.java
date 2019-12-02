package se.bodenas.advent2018.Day3;

public class Claim {
    private final String id;
    private final Rectangle rectangle;

    public Claim(String id, Rectangle rectangle) {

        this.id = id;
        this.rectangle = rectangle;
    }

    public String getId() {
        return id;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }
}
