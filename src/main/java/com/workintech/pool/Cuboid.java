package com.workintech.pool;
import java.util.Locale;
public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height < 0 ? 0 : height;
    }
    public double getHeight() {
        return height;
    }



    public double getVolume() {
        return super.getArea() * this.getHeight();
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "height=" + height +
                '}';
    }
}
