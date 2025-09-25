package com.example.dimsum;

public class Circle extends Shape {
    private float radius;
    public Circle(int x, int y, float radius) {
        super(x, y);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
