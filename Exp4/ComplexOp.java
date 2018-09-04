import java.util.*;
class Complex
{
	private float real;
	private float imaginary;
	Complex() {
		real=0;
		imaginary=0;
	}
	Complex(float r, float i){
		this.real=r;
		this.imaginary=i;
	}
	void display(){
		System.out.println("CN = "+this.getReal()+" "+this.getImaginary()+"i");
	}
	boolean isReal(){
		if(real!=0 && imaginary==0)
			return true;
		else
			return false;

	}
	boolean isImag(){
		if(real==0 && imaginary!=0)
			return true;
		else
			return false;

	}
	final float getReal(){
		return this.real;
	}
	final float getImaginary(){
		return this.imaginary;
	}
	Complex product(Complex b)
	{
		Complex prod=new Complex();
		prod.real=this.real*b.real-(this.imaginary*b.imaginary);
		prod.imaginary=this.real*b.imaginary+this.imaginary*b.real;
		return prod;

	}
	Complex product(float real)
	{
		Complex prod=new Complex();
		prod.real=real*this.real;
		prod.imaginary=real*this.imaginary;
		return prod;
	}
	Complex product(double imag)
	{
		Complex prod=new Complex();
		prod.real=(float)((-1)*imag*this.imaginary);
		prod.imaginary=(float)(imag*this.real);
		return prod;
	}
	Complex add(Complex b)
	{
		return (new Complex(this.real+b.real,this.imaginary+b.imaginary));
	}
	Complex sub(Complex b)
	{
		return (new Complex(this.real-b.real,this.imaginary-b.imaginary));
	}
	Complex add(int a)
	{
		return(new Complex(this.real+a,this.imaginary));
	}
	Complex sub(int a)
	{
		return(new Complex(this.real-a,this.imaginary));
	}
	Complex sub(float a)
	{
		return(new Complex(a-this.real,(-1)*this.imaginary));
	}


}
public class ComplexOp {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter real and imaginary of complex 1");
		Complex a=new Complex(input.nextFloat(),input.nextFloat());
		System.out.println("Enter real and imaginary of complex 2");
		Complex b=new Complex(input.nextFloat(),input.nextFloat());
		int ch=-99;

		while(ch!=0)
		{
			System.out.println("1.Display\n2.Isreal\n3.Isimag\n4.a*b\n5.a*K\n6.a*iK\n7.a+b\n8.a-b\n9.a+K\n10.a-K\n11.K-a");
			ch=input.nextInt();
			if(ch==1)
			{
				a.display();
				b.display();
			}
			else if(ch==2)
			{
				if(a.isReal())
					System.out.println("a is real");

				if(b.isReal())
					System.out.println("b is real");

			}
			else if(ch==3)
			{
				if(a.isImag())
					System.out.println("a is imaginary");
				if(b.isImag())
					System.out.println("b is imaginary");
			}
			else if(ch==4)
			{
				a.product(b).display();
			}
			else if(ch==5)
			{
				System.out.println("Enter k");
				a.product(input.nextFloat()).display();
			}
			else if(ch==6)
			{
				System.out.println("Enter k");
				a.product(input.nextDouble()).display();
			}
			else if(ch==7)
			{
				a.add(b).display();
			}
			else if(ch==8)
			{
				a.sub(b).display();
			}
			else if(ch==9)
			{
				System.out.println("Enter k");
				a.add(input.nextInt()).display();
			}
			else if(ch==10)
			{
				System.out.println("Enter k");
				a.sub(input.nextInt());
			}
			else if(ch==11)
			{
				System.out.println("Enter k");
				a.sub(input.nextFloat());
			}
		}
		input.close();
	}

}
