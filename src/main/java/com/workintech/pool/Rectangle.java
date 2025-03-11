package com.workintech.pool;

public class Rectangle {
    private double width;
    private double length;

    // Constructor
    public Rectangle(double width, double length) {
        // 0'dan küçükse 0 olarak set edilsin
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    // getWidth methodu
    public double getWidth() {
        return width;
    }

    // getLength methodu
    public double getLength() {
        return length;
    }

    // getArea methodu (Area = width * length)
    public double getArea() {
        return width * length;
    }
}
