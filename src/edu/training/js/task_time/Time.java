package edu.training.js.task_time;

public class Time {

	private int hour, minute, second;
	 
	public Time(int hour_, int minute_, int second_) {
		 
		setHour(hour_);
		setMinute(minute_);
		setSecond(second_);
	  
	}
	 	 
	public void setHour(int hour_) {
		 
		if (hour_ < 0 || hour_ > 23) {
			hour = 0;	
		}
		else {
			hour = hour_;	
		}
	  
	}
	 
	public void setMinute(int minute_) {
		 
		if (minute_ < 0 || minute_ > 59) {
			minute = 0;
		}		
		else {
			minute = minute_;	
		}
	  
	}
	 
	 public void setSecond(int second_) {
		 
		 if (second_ < 0 || second_ > 59) {
			 second = 0; 
		 }
		 else {
			 second = second_; 
		 }
	  
	 }
	 
	 
	 public void print() {
	  System.out.println(hour + ":" + minute + ":" + second);
	 } 
	     	
}
