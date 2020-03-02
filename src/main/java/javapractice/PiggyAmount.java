package javapractice;
public class PiggyAmount {
	int amount=50;
	public PiggyAmount() //default
	{
		
	}
	public PiggyAmount(int num) //parameter
	{
		amount=amount+num;
	}
	
	public static void main(String[] args)
	{
		PiggyAmount a1=new PiggyAmount();
		System.out.println("amount in piggybank is "+a1.amount);
		PiggyAmount a2=new PiggyAmount(100);
		System.out.println("new amount in piggybank is "+a2.amount);

	}
}
