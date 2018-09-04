package ellip;
import java.util.Scanner;
abstract class Shape{

	double area()
	{ 
		return 0;
	}
	double volume()
	{
		return 0;
	}
	abstract void printShapeName();
	abstract void print();
}
class point extends Shape
{
	private double x,y;
	point(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	point()
	{
		this.x=0;
		this.y=0;
	}
	double getx()
	{
		return x;
	}
	double gety()
	{
		return y;
	}
	@Override
	void printShapeName()
	{
		System.out.println("POINT\t");

	}
	@Override
	void print()
	{
		System.out.println("[" + x + "," + y +"]");

	}
}
class ellipse extends point
{
	private double major,minor;//major axis and minor axis
	ellipse(double x,double y,double a,double b)
	{
		super(x,y);
		this.major=a;
		this.minor=b;

	}
	ellipse()
	{
		super();
		this.major=0;
		this.minor=0;
	}
	double getmaj()
	{
		return major;
	}
	double getmin()
	{
		return minor;
	}
	@Override
	void printShapeName()
	{
		System.out.println("ELLIPSE\t");

	}
	@Override
	void print()
	{
		System.out.println("[" + super.getx() + "," + super.gety() +"]"+" Major axis length = "+this.major+" Minor axis length = "+this.minor);

	}
	double area()
	{
		return Math.PI*major*minor;
	}
}
class circle extends ellipse
{
	//private double radius;
	circle()
	{
		super();
		//this.radius=0;
	}
	circle(double x,double y,double r)
	{
		super(x,y,r,r);
		//radius=r;
	}
	@Override
	void printShapeName()
	{
		System.out.println("CIRCLE\t");

	}
	@Override
	void print()
	{
		super.print();
		//System.out.println("[" + super.getx() + "," + super.gety() +"]"+" Radius = "+this.radius);

	}
	double area()
	{
		return super.area();
	}
	double getradius()
	{
		return super.getmaj();
	}
}
class cylinder extends circle
{
	private double height;
	cylinder()
	{
		super();
		this.height=0;
	}
	cylinder(double x,double y,double r,double h)
	{
		super(x,y,r);
		this.height=h;
	}
	@Override
	void printShapeName()
	{
		System.out.println("CYLINDER\t");

	}
	@Override
	void print()
	{
		System.out.println("[" + super.getx() + "," + super.gety() +"]"+" Radius = "+super.getradius()+" Height = "+this.height);

	}
	@Override
	double area()
	{
		return 2*Math.PI*getradius()*(height+getradius());
	}
	double volume()
	{
		return Math.PI*getradius()*getradius()*height;
	}
}
public class ShapeOp2 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		Shape obj;
		System.out.println("1.Point\n2.Ellipse\n3.Circle\n4.Cylinder");
		int ch=input.nextInt();
		if(ch==1)
		{
			System.out.println("Enter x,y of the point");
			obj=new point(input.nextDouble(),input.nextDouble());
			obj.printShapeName();
			obj.print();
		}
		else if(ch==2)
		{
			System.out.println("Enter x,y,major axis  and minor axis length");
			obj=new ellipse(input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble());
			obj.printShapeName();
			obj.print();
			System.out.println("Area = "+obj.area());
			
		}
		else if(ch==3)
		{
			System.out.println("Enter x,y and radius of the circle ");
			obj=new circle(input.nextDouble(),input.nextDouble(),input.nextDouble());
			obj.printShapeName();
			obj.print();
			System.out.println("Area = "+obj.area());
		}
		else if(ch==4)
		{
			System.out.println("Enter x,y,radius and height of the cylinder ");
			obj=new cylinder(input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble());
			obj.printShapeName();
			obj.print();
			System.out.println("Area = "+obj.area());
			System.out.println("Volume= "+obj.volume());
			
		}
		input.close();

	}

}