package javapractice;



public class ProgrammingDemo {
	String pgm;
	public ProgrammingDemo()
	{
		pgm="programming languages";
		
	}
	public ProgrammingDemo(String value)
	{
		pgm=value;
		
	}
	public static void main(String[] args) 
	{
		ProgrammingDemo p1=new ProgrammingDemo();
		System.out.println("I love "+p1.pgm);
		System.out.println("*****************");
		ProgrammingDemo p2=new ProgrammingDemo("java");
		System.out.println("I love "+p2.pgm);
		}

}
