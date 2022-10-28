package org.example;

public class Circle {
    double Radius;
    String color;

    public Circle() {
        this.Radius = 1.0;
        this.color = "red";
    }

    public Circle(double Radius) {
        this.Radius = Radius;
        this.color = "red";
    }

    public Circle(double Radius, String color) {
        this.Radius = Radius;
        this.color = color;
    }

    public double getArea() {
        return (float) (Math.PI * this.Radius * this.Radius);
    }

    public double getCircumference() {
        return (float) (2 * Math.PI * this.Radius);
    }

    public String getDescription(){
        return "Radius: " + this.Radius + " Color: " + this.color;
    }

    public String getColor() {
        return this.color;
    }

}
