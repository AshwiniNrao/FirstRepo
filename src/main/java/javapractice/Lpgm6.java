package javapractice;

import java.util.Scanner;

public class Lpgm6 {

	public static void main(String[] args) {
		int n,num,fact=1;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number\n");
		num=input.nextInt();
		n=num;
		if(num==0)
			fact=1;
		else
		{
		for(int i=1;i<=num;i++)
			fact=fact*i;
		
	}
		System.out.println("factorial of "+n+"="+fact);
	}
}


