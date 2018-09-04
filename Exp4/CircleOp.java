import java.util.*;
class Circle
{
	private double radius;
	Circle()
	{
		radius=0;
	}
	public Circle(double r) { 
		radius = r; 
	}
	public double getRadius() { 
		return radius; 
	}
	public double findCircumference() {
		return 2*Math.PI*radius;
	}
	public double findArea() {
		return radius*radius*Math.PI;
	}
}
class cylinder extends Circle
{
	private double length;
	cylinder()
	{
		super();
		length=0;
	}
	cylinder(double r,double l)
	{
		super(r);
		length=l;
	}
	public double findArea()
	{
		return super.findCircumference()*(length+getRadius());

	}
	public double findVolume()
	{
		return super.findArea()*length;
	}
}
public class CircleOp {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter length and radius of the cylinder");
		cylinder c=new cylinder(input.nextDouble(),input.nextDouble());
		System.out.println("Surface area = "+c.findArea()+" Volume = "+c.findVolume());
		input.close();
	}

}
