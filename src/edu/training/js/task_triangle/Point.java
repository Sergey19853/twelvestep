package edu.training.js.task_triangle;

public class Point {

	public double x, y;
	
	public Point(double x_, double y_) {
		x = x_;
		y = y_;
	}
	
	public static double coordinates(Point a, Point b) {
		double dx = a.x - b.x;
		double dy = a.y - b.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
	
	public void print() {
		System.out.println("x: " + x + ", y: " + y);
	}
		
}
