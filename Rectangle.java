package com.oops;

public class Rectangle {
	int length;
	int breadth;
	public Rectangle() {
		int length=0;
		int breadth=0;
		
	}
	public Rectangle(int len,int b) {
		length=len;
		breadth=b;
		
	}
	public int Area () {
		return length * breadth;
		
	}
	public static void main (String [] args) {
		Rectangle obj= new Rectangle(10,20);
		int rectangle= obj.Area();
		System.out.println(rectangle);
		
	}

}
