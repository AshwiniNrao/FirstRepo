package javapractice;

import java.util.Scanner;

public class Pgm6 {

	public static void main(String[] args) {
		int age1;
		int age2;
		int age3;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the age of first person\n");
		age1=input.nextInt();
		System.out.println("enter the age of second person\n");
		age2=input.nextInt();
		System.out.println("enter the age of third person\n");
		age3=input.nextInt();
		if(age1>age2 && age1>age3)
			System.out.println("first person is older\n");
		else if(age2>age1 && age2>age3)
				System.out.println("second person is older\n");
		else
						System.out.println("third person is older\n");
		}
				
		}
		
