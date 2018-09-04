import java.util.*;
public class FractionOp {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter fraction 1");
		Fraction a=new Fraction(input.nextInt(),input.nextInt());
		System.out.println("Enter fraction 2");
		Fraction b=new Fraction(input.nextInt(),input.nextInt());
		int ch=-99;
		while(ch!=0)
		{
			System.out.println("1.Display\n2.IsZero\n3.IsOne\n4.IsInt\n5.Floor\n6.Ceiling\n7.Compare fraction\n8.Compare int\n9.a+b\n10.a+K");
			ch=input.nextInt();
			if(ch==1)
			{
				a.display();
				b.display();
			}
			else if(ch==2)
			{
				if(a.isZero())
					System.out.println("a is Zero");
				else
					System.out.println("a is not Zero");

				if(b.isZero())
					System.out.println("b is Zero");
				else
					System.out.println("b is not Zero");

			}
			else if(ch==3)
			{
				if(a.IsOne())
					System.out.println("a is 1");
				else
					System.out.println("a is not 1");
				if(b.IsOne())
					System.out.println("b is 1");
				else
					System.out.println("b is not 1");
			}
			else if(ch==4)
			{
				if(a.isInt())
					System.out.println("a is int");
				else
					System.out.println("a is not int");
				if(b.isInt())
					System.out.println("b is int");
				else
					System.out.println("b is not int");
				
			}
			else if(ch==5)
			{
				System.out.println(" Floor a = "+a.floor());
				System.out.println(" Floor b = "+b.floor());
			}
			else if(ch==6)
			{
				System.out.println(" Ceiling a = "+a.ceiling());
				System.out.println(" Floor b = "+b.ceiling());

			}
			else if(ch==7)
			{
				if(a.isequal(b))
					System.out.println("a is equal to b");
				else
					System.out.println("a is not equal to b");
			}
			else if(ch==8)
			{
				System.out.println("Enter integer to compare");
				if(a.isequal(input.nextInt()))
					System.out.println("a is equal to k");
				else
					System.out.println("a is not equal to k");
					
			}
			else if(ch==9)
			{
				System.out.println("a + b = ");
				a.add(b).display();
			}
			else if(ch==10)
			{
				System.out.println("Enter k");
				System.out.println("a + k = ");
				a.add(input.nextInt()).display();
			}

		}
		input.close();
	}

	}


