package emailapp;

import java.util.Scanner;

public class email {
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private String alternatemail;
	private int mailboxCapacity = 500;
	private int defaultPasswordlength = 10;
	private String email;
	private String companySuffix = "Gokulam.com";

	// constructor to receive the first and last name
	public email(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println("Email Created:" + this.firstname + "" + this.lastname);

		// call method asking for the department return the department
		this.department = setDepartment();
		System.out.println("Department : " + this.department);

		// call a method that return a random password
		this.password = randompassword(defaultPasswordlength);
		System.out.println("your password is:" + this.password);

		// combine element to generate email
		email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + companySuffix;
		System.out.println("your email is : " + email);

	}

	// Ask department
	private String setDepartment() {
		System.out.println(
				"Department Codes: \n1 sales \n2 develoment \n3 Accounting \n4 none \nEnter the Department Code :");
		Scanner sc = new Scanner(System.in);
		int departmentchoice = sc.nextInt();
		if (departmentchoice == 1) {
			return "sales";
		} else if (departmentchoice == 2) {
			return "develoment";
		} else if (departmentchoice == 3) {
			return "Accounting";
		} else {
			return "";
		}

	}

	// Generate a random password
	private String randompassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rant = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rant);
			// System.out.println(rand);
			// system.out.println(passwordSet.charAt(rant));
		}
		return new String(password);
	}

	// set mail capacity
	public void setMailboxCapacity(int capcity) {
		this.mailboxCapacity = capcity;
	}

	// set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternatemail = altEmail;
	}

	// change passwords
	public void changePassword(String password) {
		this.password = password;
	}

	public int getMailboxCapaccity() {
		return mailboxCapacity;
	}

	public String getAlternatEmail() {
		return alternatemail;
	}

	public String getpassword() {
		return password;
	}

	public String Showinfo() {
		return "Display Name: " + firstname + " " + lastname + "\nCompany Email: " + email + "\nMailbox Capacity:"
				+ mailboxCapacity + "mb";
	}

}
