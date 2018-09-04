import java.util.Random;
import java.util.Scanner;
public class CubeSimulation {
	public static void main(String[] args)
	{
		int c=0;
		Random rand = new Random();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number Of Throws");
		int n=input.nextInt();
		while(true)
		{
			c++;
		int num=rand.nextInt(6)+1;
		System.out.println(c+") You got number : "+num);
		if(c==n)
			break;
	}input.close();
		}
}
