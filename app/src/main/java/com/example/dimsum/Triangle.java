package com.example.dimsum;

public class Triangle extends Shape{
    private int base;
    private int height;
    public Triangle (int x, int y, int base, int height) {
        super(x, y);
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
