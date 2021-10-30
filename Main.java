package com.company;

public class Main {

    public static void main(String[] args) {
	triangle triangle1 = new triangle(3,4,5);
	triangle triangle2 = new triangle(4,4,5);
	int Perimeter1=triangle1.calculatePerimeter();
	double Area1 = triangle1.calculateArea();
	System.out.println(Perimeter1);
	System.out.println(Area1);
	System.out.println(triangle1.Equals(triangle2));
	System.out.println(triangle1.toString());
	triangle1.draw();

	circle circle1 = new circle(1);
	circle circle2 = new circle(2);
	System.out.println(circle1.calculatePerimeter());
	System.out.println(circle1.calculateArea());
	System.out.println(circle1.Equals(circle2));
	System.out.println(circle1.toString());

	Rectangle rectangle1 = new Rectangle(3,4,3,4);

	paint Paint = new paint();

	Paint.addCircle(circle1);
	Paint.addCircle(circle2);
	Paint.addRectangle(rectangle1);
	Paint.addTriangle(triangle1);
	Paint.addTriangle(triangle2);

	Paint.drawAll();
	Paint.printAll();
    }
}
