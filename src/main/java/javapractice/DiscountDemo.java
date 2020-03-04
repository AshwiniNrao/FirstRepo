package javapractice;

import java.util.Scanner;

public class DiscountDemo {

	public static void main(String[] args) {
		float NumOfUnit;
		float Total;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number of units to be purchased\n");
		NumOfUnit=input.nextFloat();
		Total=100*NumOfUnit;
		if(Total>1000)
		{
			Total=(float) (Total-(0.01*Total));
			System.out.println("the total cost with discount is "+Total);
			
		}
		else
			System.out.println("the total cost is "+Total);

	}

}
