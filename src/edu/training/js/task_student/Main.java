package edu.training.js.task_student;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		int n = 10;
		Student student[] = new Student[n];
	  
		student[0] = new Student("Иванов", "И.И.", 1);
		student[1] = new Student("Петров", "П.П.", 1);
		student[2] = new Student("Сидоров", "С.С.", 1);
		student[3] = new Student("Пупкин", "Н.Н.", 1);
		student[4] = new Student("Иванов", "Т.Т.", 1);
		student[5] = new Student("Петров", "А.А.", 2);
		student[6] = new Student("Сидоров", "Т.Н.", 2);
		student[7] = new Student("Пупкин", "Я.Я.", 2);
		student[8] = new Student("Шишкин", "В.В.", 2);
		student[9] = new Student("Шашкин", "Ц.Ц.", 2);
	  
		Random random = new Random();
		for (int i = 0; i < n; ++i) {
			student[i].addGrade(random.nextInt(3) + 8);
			student[i].addGrade(random.nextInt(3) + 8);
			student[i].addGrade(random.nextInt(3) + 8);
			student[i].addGrade(random.nextInt(3) + 8);
			student[i].addGrade(random.nextInt(3) + 8);
		}
	  
		System.out.println("студенты: ");
		for (int i = 0; i < n; ++i) {
			student[i].printStudent();
		}
	  
		System.out.println("отличники: ");
		for (int i = 0; i < n; ++i) {
			if (student[i].excellentStudents())
				student[i].printStudent();
		}

	}

}
