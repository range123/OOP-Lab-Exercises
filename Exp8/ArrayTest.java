
public class ArrayTest {
	public static void main(String args[])
	{
		int a[]=new int[10];
		try{
		for(int i=0;i<50;i++)
			a[i]=i;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid Index "+ e);
		}
		
	}

}
