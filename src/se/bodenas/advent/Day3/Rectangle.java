package se.bodenas.advent.Day3;

public class Rectangle {
    private final String x;
    private final String y;
    private final String width;
    private final String length;

    public Rectangle(String x, String y, String width, String length) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.length = length;
    }

    public String getX() {
        return x;
    }

    public String getY() {
        return y;
    }

    public String getWidth() {
        return width;
    }

    public String getLength() {
        return length;
    }
}
