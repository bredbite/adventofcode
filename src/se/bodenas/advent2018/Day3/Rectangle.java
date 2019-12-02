package se.bodenas.advent2018.Day3;

public class Rectangle {
    private final int x;
    private final int y;
    private final int width;
    private final int height;

    public Rectangle(String x, String y, String width, String height) {
        this.x = Integer.valueOf(x);
        this.y = Integer.valueOf(y);
        this.width = Integer.valueOf(width);
        this.height = Integer.valueOf(height);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
