package com.example.dimsum;

public class Star extends Shape {

    private int radius;
    private int nPoints;

    public Star(int x, int y, int r, int n) {
        super(x,y);
        self.radius = r;
        self.nPoints = n;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getnPoints() {
        return nPoints;
    }

    public void setnPoints(int nPoints) {
        this.nPoints = nPoints;
    }
}
