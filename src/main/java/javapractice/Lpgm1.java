package javapractice;

import java.util.Scanner;

public class Lpgm1 {

	public static void main(String[] args) {
		float sum=0, num;
		float average=0;
		Scanner input=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			System.out.println("enter the number "+(i+1));
			num=input.nextFloat();
			sum=sum+num;
		}
		System.out.println("the sum of the numbers is:"+sum);
		average=sum/10;
		System.out.println("The average of the numbers is:"+average);
	}

}
