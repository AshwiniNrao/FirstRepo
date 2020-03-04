package javapractice;

import java.util.Scanner;

public class GradeDemo {
	public static void main(String[] args)
	{
		int marks;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the marks of the student\n");
		marks=input.nextInt();
		if(marks<25)
			System.out.println("The grade is F");
		else if(marks>=25 && marks<45)
			System.out.println("The grade is E");
		else if(marks>=45 && marks<50)
			System.out.println("The grade is D");
		else if(marks>=50 && marks<60)
			System.out.println("The grade is C");
		else if(marks>=60 && marks<80)
			System.out.println("The grade is B");
		else
			System.out.println("The grade is A");
}
}
