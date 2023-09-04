package org.example;

public class Triangle extends Shape {
     private final int side;

    public Triangle(String colour, int side) {
        super(colour);
        this.side = side;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public int getArea() {
        return (side*side)/2;
    }
}
