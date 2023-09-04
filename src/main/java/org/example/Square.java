package org.example;

public class Square extends Shape {
    private int side;

    public Square(String colour, int side) {
        super(colour);
        this.side = side;
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public int getArea() {
        return side*side;
    }
}
