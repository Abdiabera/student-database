package studentDatabase;

import java.util.Scanner;

public class StudentdatabseApp {

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.enroll();
		stu1.payTuition();
		System.out.print(stu1.toString());
		/*
		Student stu2 = new Student();
		stu2.enroll();
		stu2.payTuition();
		System.out.print(stu2.toString());
		
		Student stu3 = new Student();
		stu3.enroll();
		stu3.payTuition();
		System.out.print(stu3.toString());
		
		*/
		
		
		//ask how many  new students
		System.out.print("\nEnter number of new Students to eroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		//Create n number of new Student
		for (int n = 0 ; n < numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].toString());
			
		}
		//System.out.println(students[0].toString());
		//System.out.println(students[1].toString());
		//System.out.println(students[2].toString());

		for (int n = 0 ; n < numOfStudents; n++) {
			System.out.println(students[n].toString());
		}

	}

}
