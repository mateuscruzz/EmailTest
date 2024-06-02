package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private Integer mailboxCapacity = 500;
	private int defaultPasswordLenght = 10;
	private String alternateEmail;
	private String companySuffix = "company.com";
	
	//Construtor pra receber o primeiro e ultimo nome
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		//Chama o metodo perguntando o departamento 
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		//Chama o metodo que retorna uma senha aleatoria
		this.password = randomPassword(defaultPasswordLenght);
		System.out.println("Your password is: " + this.password);
		
		//Combina elementos pra gerar email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your email is: " + email);
	}
	
	
	// Perguntar o departamento
	
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting \n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int departmentChoice = in.nextInt();
		switch (departmentChoice) {
		case 1:
			return "sales";
		case 2:
			return "dev";
		case 3:
			return "accounting";
		default:
				return "";
		}
	}
	
	// Gerar uma senha aleatoria
	
	private String randomPassword(int lenght) { 
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[lenght];	
		for (int i = 0; i<lenght; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String (password);
	}
	
	// Definir a capacidade da caixa de email
	
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Definir o email alternativo
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// Mudar a senha
	
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + 
				"\nMAILBOX CAPACITY " + mailboxCapacity + "MB";
	}
}
