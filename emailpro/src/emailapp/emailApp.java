package emailapp;

import java.util.Scanner;

public class emailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email eml = new Email ("Abdi","Abera");
		eml.showInfo();
		
		//Scanner em1 = new Scanner(System.in);
		
		//System.out.print("Please enter:" + "" + firstname);
		
		eml.setAlternateEmail("ab@gmail.com");
		//System.out.println("\nALternative email is :" + em1.getAlternateEmail());
		
		//System.out.println (em1.showInfo());

	}
	
}
