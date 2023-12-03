package edu.training.js.task_student;

public class Student {

	 private String name;
	 private String initials;
	 private int groupNumber;
	 private int grades[];
	 private int progress;
	 
	 public Student(String name_, String initials_, int groupNumber_) {
		 
		  name = name_;
		  initials = initials_;
		  groupNumber = groupNumber_;
		  progress = 0;
		  grades = new int[5];
		  
	 }
	 
	 public boolean addGrade(int grade) {
		 
		  if (progress >= 5) {
		   return false;
		  }
		  grades[progress] = grade;
		  progress++;
		  return true;
		  
	}
	 
	 public boolean excellentStudents() {
		
		 for (int i = 0; i < progress; ++i) {
			 if (grades[i] != 9 && grades[i] != 10) {
				 return false;		 
			 }	 		 
		 }
		 return true;
		 
	 }
		 
	 void printStudent() {
		 			 
		 System.out.print(name + " " + initials);
		 System.out.print(" Группа: " + Integer.toString(groupNumber) + " Успеваемость: ");
		 for (int i = 0; i < progress; ++i) {
			 System.out.print(Integer.toString(grades[i]) + " ");	 
		 }
		  
		 System.out.println();
		  
	}
	 
}
