package com.company;

import java.util.ArrayList;

public class paint {
    private ArrayList<triangle> triangles;
    private ArrayList<circle> circles;
    private ArrayList<Rectangle> Rectangles;

    public paint(){
        triangles = new ArrayList<triangle>();
        circles=new ArrayList<circle>();
        Rectangles=new ArrayList<Rectangle>();
    }

    public void addCircle(circle Circle){
        circles.add(Circle);
    }

    public void addTriangle(triangle Triangle){
        triangles.add(Triangle);
    }
    public void addRectangle(Rectangle Rectangle){
        Rectangles.add(Rectangle);
    }

    public void printAll(){
        for (circle Circle: circles)
            System.out.println(Circle.toString());
        for (triangle Triangle: triangles)
            System.out.println(Triangle.toString());
        for (Rectangle Rectangle: Rectangles)
            System.out.println(Rectangle.toString());
    }

    public void drawAll(){
        for (circle Circle: circles)
            Circle.draw();
        for (triangle Triangle: triangles)
            Triangle.draw();
        for (Rectangle Rectangle: Rectangles)
            Rectangle.draw();
    }
}
