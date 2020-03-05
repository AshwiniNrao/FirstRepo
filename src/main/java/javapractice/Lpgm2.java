package javapractice;

public class Lpgm2 {

	public static void main(String[] args) 
	{
	System.out.println("the required pattern is\n");
	for(int i=1;i<=5;i++)
	{
	for(int j=1;j<=5-i;j++)
	 
	{
	System.out.print(" ");
	}
	 
	for(int j=1;j<=i*2-1;j++)
	 
	{
	System.out.print("*");
	}
	System.out.println();
	 
	} 
	for(int i=4;i>0;i--)
	{
	for(int j=1;j<=5-i;j++)
	 
	{
	System.out.print(" ");
	}
	for(int j=1;j<=i*2-1;j++)
	 
	{
	System.out.print("*");
	}
	System.out.println();
	}
	 
	}
	
}
