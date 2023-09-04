package org.example;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(String colour, int width, int height) {
        super(colour);
        this.width = width;
        this.height = height;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public int getArea() {
        return width*height;
    }
}
