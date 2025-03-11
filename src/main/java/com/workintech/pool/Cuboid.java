package com.workintech.pool;

public class Cuboid extends Rectangle {
    private double height;

    // Constructor (width, length, height)
    public Cuboid(double width, double length, double height) {
        // Rectangle sınıfını çağırıyoruz
        super(width, length);

        // height 0'dan küçükse 0 olarak set edilmesi sağlanacak
        this.height = (height < 0) ? 0 : height;
    }

    // getHeight methodu
    public double getHeight() {
        return height;
    }

    // getVolume methodu (Volume = Area * height)
    public double getVolume() {
        return getArea() * height;
    }
}
