package com.example.dimsum;

public class Rectangle extends Shape {
    private float length;
    private float width;

    public Rectangle(int x, int y, float length, float width) {
        super(x, y);
        this.length = length;  // initialize Rectangle fieldsgit
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    // Example of extending behavior
    public float getArea() {
        return length * width;
    }

    public float getPerimeter() {
        return 2 * (length + width);
    }
}
