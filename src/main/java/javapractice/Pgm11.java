package javapractice;

import java.util.Scanner;

public class Pgm11 {

	public static void main(String[] args) {
		char alpha;
		Scanner input=new Scanner(System.in);
		alpha=input.next().charAt(0);
		if((int)alpha>=65 && (int)alpha<=90)
			System.out.println("character entered is uppercase\n");
		else if ((int)alpha>=97 && (int)alpha<=122)
			System.out.println("character entered is lowercase\n");
		else
			System.out.println("character entered is not an alphabet\n");

	}

}
