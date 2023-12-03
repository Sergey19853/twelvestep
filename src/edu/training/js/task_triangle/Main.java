package edu.training.js.task_triangle;

public class Main {

	public static void main(String[] args) {

		  Point a = new Point(1,1);
		  Point b = new Point(5,5);
		  Point c = new Point(1,6);
		  	  
		  Triangle triangle = new Triangle(a, b, c);
		  System.out.println("Площадь: " + triangle.square());
		  System.out.println("Периметр: " + triangle.perimeter());
		  System.out.print("Пересечение меридиан: ");
		  triangle.meridianIntersection().print();
		
	}

}
