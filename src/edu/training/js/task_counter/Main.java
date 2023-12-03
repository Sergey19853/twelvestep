package edu.training.js.task_counter;

public class Main {

	public static void main(String[] args) {
		
		Counter counter = new Counter(5, 10);
		System.out.println("начальное значение: " + counter.getCount());
		
		counter.increase();
		System.out.println("увеличеное: " + counter.getCount());


		counter.decrease();
		System.out.println("уменьшенное : " + counter.getCount());

	}

}
