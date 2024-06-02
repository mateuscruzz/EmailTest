package emailapp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter the second name: ");
		String secondName = sc.nextLine();
		
		Email em1 = new Email(firstName, secondName);
		System.out.println(em1.showInfo());
		
		sc.close();
	}

}
