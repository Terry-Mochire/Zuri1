package org.example;

public class Program {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle circle2 = new Circle(2);
        Circle circle3 = new Circle(2, "blue");


        System.out.println("Circle 1: ");
        System.out.println("Area: " + c1.getArea());
        System.out.println("Circumference: " + c1.getCircumference());
        System.out.println("Description: " + c1.getDescription());
        System.out.println("Color: " + c1.getColor());
        System.out.println(" ");

        System.out.println("Circle 2: ");
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Circumference: " + circle2.getCircumference());
        System.out.println("Description: " + circle2.getDescription());
        System.out.println("Color: " + circle2.getColor());
        System.out.println(" ");

        System.out.println("Circle 3: ");
        System.out.println("Area: " + circle3.getArea());
        System.out.println("Circumference: " + circle3.getCircumference());
        System.out.println("Description: " + circle3.getDescription());
        System.out.println("Color: " + circle3.getColor());
    }
}
