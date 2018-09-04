
public class nulltest {
	public static void main(String args[])
	{
		Object a =null;
		try{	
			System.out.println(a.getClass());
		}
		catch(NullPointerException e)
		{
			System.out.println("invalid "+e);
		}
	}

}
