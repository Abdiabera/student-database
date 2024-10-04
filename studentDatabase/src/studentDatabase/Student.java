package studentDatabase;

import java.util.Scanner;

public class Student {
	private String firstname;
	private  String lastname;
	private int gradeYear;
	private String studentId;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int costOfcourse = 600;
	private static int id = 1001;
	
	
	//constructor : promote enter users name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student firstname : ");
		this.firstname = in.nextLine();
		System.out.println("Enter Student lastname : ");
		this.lastname = in.nextLine();
		
		System.out.print("1 - Freshman \n2 - for Sophomore\n3  - for Junior\n4 -  for Senior\n Enter Student class level : ");
		this.gradeYear = in.nextInt();
		
		setStudentId();
		
		//System.out.println(firstname + " " + lastname + " " + gradeYear + " " + studentId);	
	}
	//generate Id 
	
	private void setStudentId() {
		//grade level + id 
		id++;
	this.studentId =  gradeYear + "" + id;
		 
	}
	//enrol in course
	
	public void enroll() {
		//get inside of loop, user hits 0
		do {
		System.out.print("Enter course to enroll (0 to quit):");
		Scanner  in = new Scanner(System.in);
		String course = in.nextLine();
		if (!course.equals("Q")) {
			courses = courses + "\n" + course;
			
			tuitionBalance = tuitionBalance + costOfcourse;
		}
		else { 
			break;}
		
		} while (1 != 0);
		
		//System.out.println("Enrolled in:" + courses);
		}
	
	//view balance
	public void viewBalance() {
		System.out.print("Your balance: is  $" + tuitionBalance);
	}
	//pay tution
	public void payTuition() {
		viewBalance();
		System.out.println("\nEnter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your Payment of: $" + payment);
		viewBalance();
	}
	//show status
	public String toString() {
		return "\nName: " + firstname + " " + lastname + "\nGrade level: " + gradeYear + "\nStudent Id: " + studentId + "\nCourses enrolled:" + courses + "\nBalance: $" + tuitionBalance;
	}

}
