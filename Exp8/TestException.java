class CustomException extends Exception
{
	String obj;

 public CustomException(String s)
 {
	 super();
	 obj=s;
 }
 public String toString()
 {
	 return obj;
 }
	
}
public class TestException {
	public static void main(String args[])
	{
		try
		{
			throw new CustomException("This is the Description");
		}
		catch(CustomException e)
		{
			System.out.println("Custom Exception caught "+ e);
		}
	}

}
