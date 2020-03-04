package javapractice;

import java.util.Scanner;

public class bonusDemo {

	public static void main(String[] args) {
		double salary;
		int YearExperience;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the salary");
		salary=input.nextDouble();
		System.out.println("enter the experience in number of years\n");
		YearExperience=input.nextInt();
		if(YearExperience>=5)
		{
			salary=salary+(0.05*salary);
			System.out.println("your salary with bonus is"+salary);
		}
		else
			System.out.println("your salary is"+salary);
	}

}
