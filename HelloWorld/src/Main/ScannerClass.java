package Main;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("What is your name?");
			String name = scanner.nextLine();
			
			System.out.println("How old are you?");
			int age = scanner.nextInt();
			
			System.out.println("What is your favorite color?");
			scanner.nextLine();
			String color = scanner.nextLine();
			
			System.out.println("Hello "+name);
			System.out.println("You are "+age+" years old");
			System.out.println("You like the "+color+" color");
	}
}
