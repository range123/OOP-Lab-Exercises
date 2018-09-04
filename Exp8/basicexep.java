
public class basicexep {
	public static void main(String args[])
	{
		try{
			throw new Exception("This is an exception");
		}catch(Exception e)
		{
			System.out.println(e.toString());
		}
		finally{
			System.out.println("finally block,this is after the try-catch block");
		}
	}

}
