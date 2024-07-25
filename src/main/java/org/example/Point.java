package org.example;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public double distance() {
        return sqrt(pow(x, 2) + pow(y, 2));
    }

    public double distance(Point point) {
        if (point == null) {
            System.out.println("point object is null");
            return 0;
        } else {
            return sqrt(pow((x - point.x), 2) + pow((y - point.y), 2));
        }
    }

    public double distance(int x, int y) {
        return sqrt(pow((this.x - x), 2) + pow((this.y - y), 2));
    }


}
