package emailapp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Employ name :");
		String firstname = sc.next();
		System.out.println("enter lastname:");
		String lastname = sc.next();
		email em1 = new email(firstname, lastname);
		// em1.setAlternateEmail("js@gmail.com");
		// System.out.println(em1.getAlternatEmail());
		System.out.println(em1.Showinfo());
	}

}
