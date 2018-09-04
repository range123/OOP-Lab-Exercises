import java.util.*;
public class MontyHall {
	public static void main(String args[])
	{
		int nochange=0,change=0;
		Random rand=new Random();
		for(int z=0;z<10000;z++)
		{
		int prizeloc=rand.nextInt(3)+1;
		int choice=rand.nextInt(3)+1;
		if(prizeloc==choice)
			nochange++;
		else
			change++;
		}
		System.out.println("When switched = "+change);
		System.out.println("When stayed = "+nochange);
	}
}
