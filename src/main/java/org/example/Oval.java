package org.example;

public class Oval extends Shape {
    private int a;
    private int b;

    public Oval(String colour, int a, int b) {
        super(colour);
        this.a = a;
        this.b = b;
    }

    @Override
    public String getName() {
        return "Oval";
    }

    @Override
    public int getArea() {
        return (int) (a*b*Math.PI);
    }
}
