package com.oops;

public class Circle {
	double radius;
	
	public Circle(double radii) {
		radius=radii;
	}
	public double getArea() {
		return 3.14 * radius * radius ;
	}
	public double getCircumference () {
		return 2 * 3.14 * radius;
	}
	public static void main (String [] args) {
		Circle obj = new Circle (6.1);
		System.out.println ("Area of circle: " + obj.getArea());
		System.out.println ("Circumference of circle: " + obj.getCircumference());
		
		
	}

}
