package javapractice;

import java.util.Scanner;

public class Pgm9 {

	public static void main(String[] args) {
		float Percentage;
		float ClassesHeld;
		float ClassesAttended;
		String Reason;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number of classes held\n");
		ClassesHeld=input.nextFloat();
		System.out.println("enter the number of classes attended\n");
		ClassesAttended=input.nextFloat();
		Percentage=(ClassesAttended/ClassesHeld)*100;
		System.out.println("attendance percentage="+Percentage);
		if(Percentage<75)
		{
			System.out.println("Not eligible to take the exam\n");
			System.out.println("Any medical reason? y/n?\n");
			Reason=input.next();
			if(Reason.equalsIgnoreCase("y"))
				System.out.println("Student has medical reason");
			else
				System.out.println("Student has no medical reason");
		}
		else
			System.out.println("Eligible to take the exam\n");

	}

}
