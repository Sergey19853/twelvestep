package edu.training.js.task_triangle;

public class Triangle {

	private Point a, b, c;
	
	public Triangle(Point a_, Point b_, Point c_) {
		
		a = a_;
		b = b_;
		c = c_;
		
	}
	
	public double square() {

		double ab = Point.coordinates(a, b);
		double bc = Point.coordinates(b, c);
		double ac = Point.coordinates(a, c);
		double p = (ab + bc + ac) / 2;
		return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
		
	}
	
	public double perimeter() {
		
		double ab = Point.coordinates(a, b);
		double bc = Point.coordinates(b, c);
		double ac = Point.coordinates(a, c);
		return ab + bc + ac;
		
	}
	
	public Point meridianIntersection() {
		
		return new Point((a.x + b.x + c.x) / 3, (a.y + b.y + c.y) / 3);
		
	}
	

	
}
