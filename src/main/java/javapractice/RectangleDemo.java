package javapractice;

import java.util.Scanner;

public class RectangleDemo {

	public static void main(String[] args) {
		int length;
		int breadth;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the length\n");
		length=input.nextInt();
		System.out.println("enter the breadth\n");
		breadth=input.nextInt();
		if(length==breadth)
			System.out.println("its a square");
		else
			System.out.println("its not a square");
		}

}
