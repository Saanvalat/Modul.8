package org.example;

public class Rhombus extends Shape {
    private int sideLength;
     private int height;

    public Rhombus(String colour, int sideLength, int height) {
        super(colour);
        this.sideLength = sideLength;
        this.height = height;
    }

    @Override
    public String getName() {
        return "Rhombus";
    }

    @Override
    public int getArea() {
        return sideLength*height;
    }
}

