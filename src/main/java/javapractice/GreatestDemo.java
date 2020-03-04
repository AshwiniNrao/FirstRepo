package javapractice;

import java.util.Scanner;

public class GreatestDemo {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner input=new Scanner(System.in);
		System.out.println("\nenter the first number\n ");
		num1=input.nextInt();
		System.out.println("\nenter the second number\n");
		num2=input.nextInt();
		if(num1>num2)
			System.out.println("first number is greater than second number\n");
		else
			System.out.println("second number is greater than first number\n");
	}

}
