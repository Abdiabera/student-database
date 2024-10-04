package emailapp;


import java.util.Scanner;

public class Email {
	
	private String firstname;
	private String lastname;
	String password;
	String department;
	private String email;
	private int defaultpasswordLenght = 10;
	private int mailboxCapacity = 500;
	private String altenativeEmail;
	private String companySUffix = "gmail.com";
	
	
	public static void main (String [] args) {
		
	}
	
	//constructor for last name and firstname 
	
	public Email(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		
		System.out.println("Email created: " + this.firstname + " " + this.lastname);
		//we are calling methods to department 
		this.department = setdepartment();
		System.out.println("Department " + this.department);
		
		//call method for random password  and returnss a random passoword
		
		this.password = randomPass (defaultpasswordLenght);
		System.out.println("YourPassword is :" + this.password);
		
		email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "." + companySUffix;
		System.out.print("Your email is : " + email);
		
		
	}
	//ask for department 
			private String setdepartment() {
				System.out.println("New Worker:" + firstname + ". Department codes\n1 for Sale\n2 for Department\n3 for Account\n0 for none\n enter department code:");	
				Scanner in =  new Scanner(System.in);
				int departmentchoice = in.nextInt();
				 if (departmentchoice == 1) {return "sales";}
				else if (departmentchoice == 2) {return "development";}
				else if (departmentchoice == 3) {return "accounting";}
				else { return  " ";}
				
				
			}
				
			
	//ask for generate a random password
			private String randomPass(int lenght) {
				String passwordset = "ABCDEFGHKLMNOPQRSTUVWXYZ1234567890#!$!~():";
				char[] password = new char[lenght];
				for (int i = 0; i <lenght; i++) {
					int rand = (int) (Math.random() *  passwordset.length());
					password[i] = passwordset.charAt(rand);
					
				}
				
				return new String (password);
				
			}
	 
	//set the mail box capacity 
			public void setMailCapacity (int capacity) {
				this.mailboxCapacity = capacity;
			}
			
	//set alternate email
			public void setAlternateEmail(String altEmail) {
			this.altenativeEmail = altEmail;
	
			}
			// change the password
			public void changePasword(String password) {
				this.password = password;
			}
			
			public int getMailboxCapacity() { return mailboxCapacity; }
			public String getAlternateEmail() { return altenativeEmail;}
			
			public String getPassword() {return password;}
			public String showInfo() {
				return "\nDisplay Name : " + firstname + "" + lastname + "\nCompany Email " + email + "\nMailbox capacity " + mailboxCapacity + "mb";
			}


}
