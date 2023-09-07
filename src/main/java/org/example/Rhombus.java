package org.example;

public class Rhombus extends ShapePrinter {
    private final int sideLength;
     private final int height;

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

