package com.company;
import java.util.ArrayList;

public class triangle {
    private ArrayList<Integer> sides;
    public triangle(int side1, int side2, int side3){
        sides = new ArrayList<Integer>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
    }
    public int calculatePerimeter(){
        int Perimeter = 0;
        for(int side: sides)
            Perimeter += side;
        return Perimeter;
    }
    public double calculateArea(){
        double P = 0;
        for(int side: sides)
            P += (side/2.0);
        double Area = Math.sqrt(P);
        for(int side: sides)
            Area*=Math.sqrt(P-side);
        return Area;
    }
    public void draw(){
        System.out.println("Triangle, Perimeter: " + this.calculatePerimeter() + " Area: " + this.calculateArea());
    }
    public boolean Equals(triangle Triangle) {
        for (int i = 0; i < 3; i++)
            if (!Triangle.sides.contains(this.sides.get(i)))
                return false;
        return true;
    }
    public String toString(){
        String Info = "Triangle, ";
        for (int side: sides)
            Info += (String.valueOf(side) + " ");
        return Info;
    }
    public ArrayList<Integer> getSides(){
        return sides;
    }
}
