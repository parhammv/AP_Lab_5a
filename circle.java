package com.company;

public class circle {
    private int radius;
    public circle(int Radius){
        radius=Radius;
    }
    public int getRadius(){
        return radius;
    }
    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }
    public double calculateArea(){
        return Math.PI*Math.pow(radius,2);
    }
    public void draw(){
        System.out.println("circle, Perimeter: " + this.calculatePerimeter() + " Area: " + this.calculateArea());
    }
    public boolean Equals(circle Circle){
        return this.getRadius()== Circle.getRadius();
    }
    public String toString(){
        return "circle, "+String.valueOf(radius);
    }
}
