import java.util.Scanner;
public class helloworld {
	public static int fib(int n)
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//int n=Integer.parseInt(args[0]);
		System.out.println("Enter n");
		int n=input.nextInt();
		for(int i=0;i<n;i++)
			System.out.println(fib(i));
		/*int a=0,b=1,k,i;
		System.out.println(a);
		System.out.println(b);
		for(i=0;i<n-2;i++)
		{
		k=a+b;
		System.out.println(k+" ");
		a=b;
		b=k;
		}*/
		input.close();
	}

}
