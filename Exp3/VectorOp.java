import java.util.*;
import java.lang.Math;
class vector
{
	private float x;
	private float y;
	
	vector(){
		this.x=0;
		this.y=0;
	}
	vector(float a,float b){
		this.x=a;
		this.y=b;
	}
	public void setval(float a,float b)
	{
		this.x=a;
		this.y=b;
	}
	public vector plus(vector a)
	{
		vector s=new vector();
		s.x=this.x+a.x;
		s.y=this.y+a.y;
		return s;
	}
	
	public vector minus(vector a)
	{
		vector s=new vector();
		s.x=this.x-a.x;
		s.y=this.y-a.y;
		return s;
	}
	public double magnitude()
	{
		return Math.sqrt(Math.pow(this.x, 2)+Math.pow(this.y, 2));
		
	}
	public float dotprod(vector a)
	{
		return (this.x*a.x + this.y*a.y);
	}
	public void display()
	{
		System.out.println(this.x+" i  "+this.y+" j ");
	}
	public boolean isperpendicular(vector a)
	{
		if(this.dotprod(a)==0)
			return true;
		else
			return false;
			
	}
	public boolean isparallel(vector a)
	{
		float r1=this.x/a.x;
		float r2=this.y/a.y;
		if(r1==r2)
			return true;
		else
			return false;
	}
}
class triangle
{
	private vector a,b,c;
	triangle(vector x,vector y,vector z)
	{
		this.a=x;
		this.b=y;
		this.c=z;
	}
	triangle()
	{
		this.a.setval(0,0);
		this.b.setval(0,0);
		this.c.setval(0,0);
	}
	public boolean isequilateral()
	{
		if(this.a.magnitude()==this.b.magnitude() && this.b.magnitude()==this.c.magnitude())
			return true;
		else
			return false;
	}
	public boolean isrighttri()
	{
		double m1=this.a.magnitude();
		double m2=this.b.magnitude();
		double m3=this.c.magnitude();
		double max;
		if(m1>=m2 && m1>=m3)
		{
			max=m1;
			if((Math.pow(max,2)==Math.pow(m2,2)+Math.pow(m3,2)))
				return true;
			else
				return false;
		}
		else if(m2>=m1 && m2>=m3)
		{
			max=m2;
			if((Math.pow(max,2)==Math.pow(m1,2)+Math.pow(m3,2)))
				return true;
			else
				return false;
		}
		else
		{
			max=m3;
			if((Math.pow(max,2)==Math.pow(m2,2)+Math.pow(m1,2)))
				return true;
			else
				return false;
		}
		
		
		
	}
	public boolean isisoceles()
	{
		double m1=this.a.magnitude();
		double m2=this.b.magnitude();
		double m3=this.c.magnitude();
		if(m1==m2 && !this.isequilateral())
			return true;
		else if(m1==m3 && !this.isequilateral())
			return true;
		else if(m2==m3 && !this.isequilateral())
			return true;
		else
			return false;
	}
	public boolean isscalene()
	{
		double m1=this.a.magnitude();
		double m2=this.b.magnitude();
		double m3=this.c.magnitude();
		if(m1!=m2 && m2!=m3)
			return true;
		else
			return false;
	}
}
class rectangle
{
	private vector a,b,c,d;
	rectangle()
	{
		vector z=new vector();
		this.a=this.b=this.c=this.d=z;
	}
	rectangle(vector a,vector b,vector c,vector d)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	public boolean isrectangle()
	{
		double m1=this.a.magnitude();
		double m2=this.b.magnitude();
		double m3=this.c.magnitude();
		double m4=this.d.magnitude();
		if(m1==m2 && m3==m4 && m2==m3)
			return true;
		else if(m1==m2 && m3==m4)
			return true;
		else if(m1==m3 && m2==m4)
			return true;
		else if(m1==m4 && m2==m3)
			return true;
		else
			return false;
		
	}
}
public class VectorOp {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter values for vector 1");
		vector a=new vector(input.nextFloat(),input.nextFloat());
		System.out.println("Enter values for vector 2");
		vector b=new vector(input.nextFloat(),input.nextFloat());
		System.out.print("A + B = ");
		a.plus(b).display();
		System.out.print("A - B = ");
		a.minus(b).display();
		System.out.println("|A| = "+a.magnitude()+"\t|B| = "+b.magnitude());
		System.out.println("A . B = "+a.dotprod(b));
		if(a.isparallel(b))
			System.out.println("\nA is parallel to B");
		else
			System.out.println("\nA is not parallel to B");
		if(a.isperpendicular(b))
			System.out.println("A is perpendicular to B");
		else
			System.out.println("A is not perpendicular to B");
		System.out.println("\n\tTRIANGLE");
		System.out.println("Enter the vector notation of side 1");
		vector s1=new vector(input.nextFloat(),input.nextFloat());
		System.out.println("Enter the vector notation of side 2");
		vector s2=new vector(input.nextFloat(),input.nextFloat());
		System.out.println("Enter the vector notation of side 3");
		vector s3=new vector(input.nextFloat(),input.nextFloat());
		triangle t=new triangle(s1,s2,s3);
		if(t.isequilateral())
			System.out.println("The triangle is equilateral");
		else if(t.isisoceles())
			System.out.println("The triangle is isoceles");
		else if(t.isrighttri())
			System.out.println("The triangle is right angled");
		else if(t.isscalene()){
			System.out.println("The triangle is scalene");
		}
		System.out.println("\n\tRECTANGLE");
		System.out.println("Enter the vector notation of side 1");
		vector z=new vector(input.nextFloat(),input.nextFloat());
		System.out.println("Enter the vector notation of side 2");
		vector y=new vector(input.nextFloat(),input.nextFloat());
		System.out.println("Enter the vector notation of side 3");
		vector x=new vector(input.nextFloat(),input.nextFloat());
		System.out.println("Enter the vector notation of side 4");
		vector w=new vector(input.nextFloat(),input.nextFloat());
		rectangle r=new rectangle(z,y,x,w);
		if(r.isrectangle())
			System.out.println("It is a valid rectangle");
		else
			System.out.println("It is an inavalid rectangle");
		input.close();
		
	}

}
