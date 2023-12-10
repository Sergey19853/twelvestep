package edu.training.js.task_time;

public class Main {

	public static void main(String[] args) {
		
		Time time = new Time(10, 25, 56);

		time.print();

		time.setHour(9);
		time.setMinute(22);
		time.setSecond(50);

		time.print();
		

		time.addHours(25);
		time.addMinutes(61);
		time.addSeconds(91);
		
		time.print();
		
	}

}
