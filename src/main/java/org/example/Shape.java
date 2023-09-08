package org.example;
public abstract class Shape {

    protected String getArea;
    protected String getColour;

    public Shape(String colour) {
    }
    protected abstract String getName();

    public static void main(String[] args) {
    Circle circle = new Circle("blue", 10);
    Triangle triangle = new Triangle("green",20);
    Square square = new Square("yellow", 15);
    Rhombus rhombus = new Rhombus("grey", 20,30);
    Rectangle rectangle = new Rectangle("black", 9,10);
    Oval oval = new Oval("brown", 13,14);


        System.out.println("name: " + circle.getName() + ", colour: " + circle.getColour() + ", area: " + circle.getArea() + " sm");
        System.out.println("name: " + triangle.getName() + ", colour: " + triangle.getColour() + ", area: " + triangle.getArea() + " sm");
        System.out.println("name: " + square.getName() + ", colour: " + square.getColour() + ", area: " + square.getArea() + " sm");
        System.out.println("name: " + rhombus.getName() + ", colour: " + rhombus.getColour() + ", area: " + rhombus.getArea() + " sm");
        System.out.println("name: " + rectangle.getName() + ", colour: " + rectangle.getColour() + ", area: " + rectangle.getArea() + " sm");
        System.out.println("name: " + oval.getName() + ", colour: " + oval.getColour() + ", area: " + oval.getArea() + " sm");


    }



    }


