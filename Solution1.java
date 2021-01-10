import java.util.Scanner;
class Circle
{
	double radius;
	double area()
	{
		return (Math.PI*radius*radius);
	}
	double perimeter()
	{
		return (2*Math.PI*radius);
	}
}
public class Solution1
{
	public static void  main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		Circle c=new Circle();
		System.out.println(" enter radius ");
		c.radius=s.nextDouble();
		if(c.radius<0)
		{
			System.out.println("please enter non zero positive integer");
		}
		else
		{
			System.out.println(" Area is "+c.area());
			System.out.println(" Perimeter is "+c.perimeter());
		}
	}
}