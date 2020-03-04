package javapractice;

import java.util.Scanner;

public class Pgm7 {

	public static void main(String[] args) {
		int num;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		num=input.nextInt();
		num=Math.abs(num);
		System.out.println("absolute value of the number is "+num);

	}

}
