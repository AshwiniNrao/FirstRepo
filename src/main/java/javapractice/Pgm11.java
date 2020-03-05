package javapractice;

import java.util.Scanner;

public class Pgm11 {

	public static void main(String[] args) {
		char alpha;
		boolean ch;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the character");
		alpha=input.next().charAt(0);
		ch=Character.isLowerCase(alpha);
		if(ch)
			System.out.println("character entered is lowercase");
		else
			System.out.println("character entered is uppercase");
	}
	 
}