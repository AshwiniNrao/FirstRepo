package javapractice;



public class StudentDemo {
	String SName;
	public StudentDemo()//default constructor
	{
		SName="unknown";
	}

	public StudentDemo(String name) //Parameterized constructor
	{
		SName=name;
	}

		
		public static void main(String[] args) {
			StudentDemo s1=new StudentDemo("Ashwini");
			StudentDemo s2=new StudentDemo();
			System.out.println("the first student name is "+s1.SName);
			System.out.println("the second student name is "+s2.SName);
			

		}

}
