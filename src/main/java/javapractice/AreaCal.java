package javapractice;
	public class AreaCal
	{
		double length,breadth,area;
		public AreaCal() //default constructor
		{
			length=breadth=0;
		}
		public AreaCal(double num) //single-parameter constructor
		{
			length=breadth=num;
		}
		public AreaCal(double num1,double num2) //double-parameter constructor
		{
			length=num1;
			breadth=num2;
		}
		public double CalArea(double len,double brth)
		{
			return area=len*brth;
		}
		public static void main(String[] args) {
			AreaCal a1=new AreaCal();
			System.out.println("area without parameter is "+a1.CalArea(a1.length,a1.breadth));
			AreaCal a2=new AreaCal(2);
			System.out.println("area with single  parameter is "+a2.CalArea(a2.length,a2.breadth));
			AreaCal a3=new AreaCal(2,4);
			System.out.println("area with two parameter is "+a3.CalArea(a3.length,a3.breadth));
		}

}
