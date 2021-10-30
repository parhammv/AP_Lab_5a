package com.company;

import java.util.ArrayList;

public class Rectangle {
    private ArrayList<Integer> sides;

    public Rectangle(int side1, int side2, int side3, int side4) {
        sides = new ArrayList<Integer>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
        sides.add(side4);
    }

    public int calculatePerimeter() {
        int Perimeter = 0;
        for (int side : sides)
            Perimeter += side;
        return Perimeter;
    }

    public int calculateArea() {
        return this.sides.get(1) * this.sides.get(3);
    }

    public boolean Equals(Rectangle rectangle) {
        for (int i = 0; i < 4; i++)
            if (!rectangle.sides.contains(this.sides.get(i)))
                return false;
        return true;
    }

    public boolean isSquare(Rectangle rectangle) {
        for (int i = 0; i < 3; i++)
            if (rectangle.sides.get(i) != rectangle.sides.get(i + 1))
                return false;
        return true;
    }

    public String toString() {
        String Info = "Rectangle, ";
        for (int side : sides)
            Info += (String.valueOf(side) + " ");
        return Info;
    }

    public ArrayList<Integer> getSides() {
        return sides;
    }
    public void draw(){
        System.out.println("Rectangle, Perimeter: " + this.calculatePerimeter() + " Area: " + this.calculateArea());
    }

}
