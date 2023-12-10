package edu.training.js.task_time;

public class Time {

	private int hour;
	private int minute;
	private int second;
	 
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
	 
    public void addHours(int hour_) {
    	
        int newHour = hour + hour_;
        if (newHour >= 0 && newHour < 24) {
            hour = newHour;
        } else {
            hour = newHour % 24;
        }
        
    }

    public void addMinutes(int minute_) {
    	
        int newMinute = minute + minute_;
        int extraHours = newMinute / 60;
        if (newMinute >= 0 && newMinute < 60) {
            minute = newMinute;
        } else {
            minute = newMinute % 60;
            addHours(extraHours);
        }
        
    }

    public void addSeconds(int second_) {
    	
        int newSecond = second + second_;
        int extraMinutes = newSecond / 60;
        if (newSecond >= 0 && newSecond < 60) {
            second = newSecond;
        } else {
            second = newSecond % 60;
            addMinutes(extraMinutes);
        }
        
    }
	 
	 public void print() {
	  System.out.println(hour + ":" + minute + ":" + second);
	 } 
	     	
}
