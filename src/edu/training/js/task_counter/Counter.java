package edu.training.js.task_counter;

import java.util.Random;

public class Counter {
	
    private int count;
    private int max;
    private int min;
    
    public Counter(){
    	
        count = 0;
        min = 0;
        max = 100;
        
    }
    
    public Counter(int min_, int max_){
    	
        min = min_;
        max = max_;
        Random random = new Random();
        count = random.nextInt(min, max);
        
    }
    
    public void increase(){
    	
    	count++;
    	if (count > max) {
    		count = min;	
    	}
          
    }
    
    public void decrease(){
    	
    	count--;
    	if (count < min) {
    		count = max;
    	}
    		     	
    }

	public int getCount() {
		return count;
	}
	
}
