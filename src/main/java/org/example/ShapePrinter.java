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
    public String printArea(Shape shape){
        return shape.getArea;
    }
    public String printColour(Shape shape) {
        return shape.getColour;
    }

    public abstract String getName();
    public String print(Shape shape) {
        return shape.getName();
    }

}