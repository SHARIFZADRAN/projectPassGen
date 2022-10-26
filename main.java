package generate;

import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enther the Length of your Passowrd between 8 to 128:");

		int length1 = sc.nextInt();
		System.out.println(pwdGenerator(length1));
		
		System.out.println("Do you want to Generate next Password 1 or 2\n");
		int s = sc.nextInt();
		if (s==1) {
			System.out.println("Enther the Length of your Passowrd between 8 to 128:");

			int length2 = sc.nextInt();
			System.out.println(pwdGenerator(length2));
			
		}
		else {
			System.out.println("Thank you");
		}
	}

	public static char[] pwdGenerator(int length) {

		String lowerCase = "abcdefghijklmnopqurstuvwxyz";
		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String num = "0123456789";
		String Symbol = "!@#$%^&*";
		
		String combination = lowerCase+upperCase+num+Symbol;
		// int arrayLength = 8;
		
		Scanner sc2 = new Scanner(System.in);
		Random rand = new Random();
		char[] Password = new char[length];

		System.out.println("Capital Letter Password choose: 1 ");

		System.out.println("Lower Case Password choose:  2 ");

		System.out.println("Number Password choose: 3 ");

		System.out.println("Spcial Character Password choose:  4 ");
		
		System.out.println("Secret Password choice 5\n");

		int choice = sc2.nextInt();

		System.out.println("You have selected your choice: " + choice);

		if (choice == 1) {

			for (int i = 0; i < length; i++) {
				Password[i] = upperCase.charAt(rand.nextInt(upperCase.length()));
			}
			return Password;

		}

		if (choice == 2) {

			for (int i = 0; i < length; i++) {
				Password[i] = lowerCase.charAt(rand.nextInt(lowerCase.length()));
			}
			return Password;

		}

		if (choice == 3) {

			for (int i = 0; i < length; i++) {
				Password[i] = num.charAt(rand.nextInt(num.length()));
			}
			return Password;

		}

		if (choice == 4) {

			for (int i = 0; i < length; i++) {
				Password[i] = Symbol.charAt(rand.nextInt(Symbol.length()));
			}
			return Password;

		}
		
		if (choice == 5) {

			for (int i = 0; i < length; i++) {
				Password[i] = combination.charAt(rand.nextInt(combination.length()));
			}
			return Password;

		}
		return Password;
	
	
	}
	
}
	

		