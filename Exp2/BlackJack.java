import java.util.*;
public class BlackJack {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		while(true)
		{
			System.out.println("\nEnter number of cards");
			int n=input.nextInt();
			if(n<2 || n>5)
				System.out.println("Invalid Number of cards");
			else
			{
				int val[]=new int[n],i=0;
				int noofa=0;
				System.out.println("Enter card sequence");
				String card=new String(input.next());
				card.toLowerCase();
				for(i=0;i<n;i++)
				{
					char key=card.charAt(i);
					if(key=='2')
						val[i]=2;
					else if(key=='3')
						val[i]=3;
					else if(key=='4')
						val[i]=4;
					else if(key=='5')
						val[i]=5;
					else if(key=='6')
						val[i]=6;
					else if(key=='7')
						val[i]=7;
					else if(key=='8')
						val[i]=8;
					else if(key=='9')
						val[i]=9;
					else if(key=='t')
						val[i]=10;
					else if(key=='j' || key=='q' || key=='k'|| key=='J'|| key=='Q'|| key=='K')
						val[i]=10;
					else if(key=='a'||key=='A')
					{
						val[i]=1;
						noofa++;
					}
					
				}
				int sum=0;
				for(i=0;i<n;i++)
					sum+=val[i];
				if(sum>21)
					System.out.println("   BUSTED!!!   ");
				else
				{
					while(sum<=11 && noofa>0)
					{
						sum+=10;
						noofa--;
					}
					System.out.println("SCORE = "+sum);
				}
					
				System.out.println("Enter anykey to continue and Enter e to exit");
				char check=input.next().charAt(0);
				input.close();
				if(check=='e')
					break;
				
				
			}
		}
	}

}
