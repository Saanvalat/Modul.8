package org.example;

public class Oval extends ShapePrinter {
    private final int a;
    private final int b;

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
