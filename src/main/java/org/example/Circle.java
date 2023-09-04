package org.example;

public class Circle extends Shape {
    private final int radius;


    public Circle(String colour, int radius) {
        super(colour);
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public int getArea() {
        return (int) (Math.PI*Math.pow(radius, 2));
    }


}
