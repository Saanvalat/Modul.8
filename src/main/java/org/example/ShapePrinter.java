package org.example;

public abstract class ShapePrinter extends Shape {

    private String colour;

    public ShapePrinter(String colour) {
        super(colour);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    abstract public int getArea();


    public abstract String getName();

}
