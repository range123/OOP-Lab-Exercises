import java.util.Scanner;
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
		vector(vector copy)
		{
			this.x=copy.x;
			this.y=copy.y;
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
		public float product(vector a)
		{
			return (this.x*a.x + this.y*a.y);
		}
		public void display()
		{
			System.out.println(this.x+" i  "+this.y+" j ");
		}
		public boolean isperpendicular(vector a)
		{
			if(this.product(a)==0)
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
		public vector product(float scalar)
		{
			return new vector(this.x*scalar,this.y*scalar);
		}
}
class threedimvector extends vector
{
	private float z;
	threedimvector()
	{
		super();
		this.z=0;
	}
	threedimvector(float x,float y,float z)
	{
		super(x,y);
		this.z=z;
	}
	
}
public class VectorOverload {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Vector 1");
		vector a=new vector(input.nextFloat(),input.nextFloat());
		System.out.println("Enter Vector 2");
		vector b=new vector(input.nextFloat(),input.nextFloat());
		int ch=-99;
		while(ch!=0)
		{
			System.out.println("1.Display\n2.a+b\n3.a-b\n4.a.b\n5.a.k\n6.Magnitude\n7.IsParallel\n8.Isperpendicular");
			ch=input.nextInt();
			if(ch==1)
			{
				a.display();
				b.display();
			}
			else if(ch==2)
			{

				System.out.println("a + b = "+a.plus(b));

			}
			else if(ch==3)
			{
				System.out.println("a + b = "+a.minus(b));
			}
			else if(ch==4)
			{
				System.out.println("a . b = "+a.product(b));
				
			}
			else if(ch==5)
			{
				System.out.println("Enter k");
				System.out.println("a + k = "+a.product(input.nextFloat()));
			}
			else if(ch==6)
			{
				System.out.println("Mag(a) = "+a.magnitude()+" Mag(b) = "+b.magnitude());

			}
			else if(ch==7)
			{
				if(a.isparallel(b))
					System.out.println("\nA is parallel to B");
				else
					System.out.println("\nA is not parallel to B");
			}
			else if(ch==8)
			{
				if(a.isperpendicular(b))
					System.out.println("A is perpendicular to B");
				else
					System.out.println("A is not perpendicular to B");
					
			}

		}
		input.close();
		
	}

}

