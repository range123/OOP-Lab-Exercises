import java.util.*;
class Box
{
	private float length;
	private float breadth;
	private float height;
	
	Box()
	{
		this.length=0;
		this.breadth=0;
		this.height=0;
		
	}
	Box(float a,float b,float c)
	{
		this.length=a;
		this.breadth=b;
		this.height=c;
	}
	public float get_length()
	{
		return this.length;
	}
	public float get_breadth()
	{
		return this.breadth;
	}
	public float get_height()
	{
		return this.height;
	}
	public float volume()
	{
		return this.breadth*this.length*this.height;
	}
	public float Surface_area()
	{
		return 2*(this.length*this.breadth+this.breadth*this.height+this.height*this.length);
	}
	public boolean volequal(Box b)
	{
		if(this.volume()==b.volume())
			return true;
		else
			return false;
	}
	public boolean saequal(Box b)
	{
		if(this.Surface_area()==b.Surface_area())
			return true;
		else
			return false;
	}
	public void display()
	{
		System.out.println("length = "+this.length);
		System.out.println("breadth = "+this.breadth);
		System.out.println("height = "+this.height);
		System.out.println("volume = "+this.volume());
		System.out.println("surface area = "+this.Surface_area());
	}
	
}
public class BoxCheck {
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the dimensions of the box1");
		Box b1=new Box(input.nextFloat(),input.nextFloat(),input.nextFloat());
		System.out.println("Enter the dimensions of the box2");
		Box b2=new Box(input.nextFloat(),input.nextFloat(),input.nextFloat());
		if(b1.volequal(b2))
			System.out.println("Both boxes have equal volume");
		else
			System.out.println("Both boxes have different volume");
		if(b1.saequal(b2))
			System.out.println("Both boxes have equal surface area");
		else
			System.out.println("Both boxes have different surface area");
		if(b1.equals(b2))
			System.out.println("Both boxes have same dimension");
		else
			System.out.println("Both boxes have different dimensions");
		System.out.println("\n\tBOX 1");
		b1.display();
		System.out.println("\n\tBOX `2");
		b2.display();
		
		//System.out.println("The volume of the box= "+b.volume());
		//System.out.println("The surface area of the box= "+b.Surface_area());
		input.close();
	}

}