package edu.training.js.task_triangle;

public class Triangle {

    private Point a;
    private Point b;
    private Point c;
	
	public Triangle(Point a_, Point b_, Point c_) {
		
		a = a_;
		b = b_;
		c = c_;
		
	}
	
	public double square() {

        double ab = a.distance(b);
        double bc = b.distance(c);
        double ac = c.distance(a);
        
        double p = (ab + bc + ac) / 2;
        
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));

	}
	
	public double perimeter() {
		
        double ab = a.distance(b);
        double bc = b.distance(c);
        double ac = c.distance(a);
        
        return ab + bc + ac;
		
	}
	
	public Point meridianIntersection() {
		
        double x = (a.getX() + b.getX() + c.getX()) / 3;
        double y = (a.getY() + b.getY() + c.getY()) / 3;
        
        return new Point(x, y);
		
	}
	

	
}
