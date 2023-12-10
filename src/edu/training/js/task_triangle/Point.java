package edu.training.js.task_triangle;

public class Point {

	private double x;
	private double y;
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public Point(double x_, double y_) {
		x = x_;
		y = y_;
	}
	
	public double distance(Point b) {
		
		double dx = this.x - b.getX();
		double dy = this.y - b.getY();

		return Math.sqrt(dx * dx + dy * dy);
	}
	
	public void print() {
		System.out.println("x: " + x + ", y: " + y);
	}
		
}
