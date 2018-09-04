import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public class FileParametersTest {
	public static void main(String args[])
	{
		File obj = new File("/rhome/3cse4064/temp.txt");
		if(obj.exists())
			System.out.println("The file exists ");
		else
			System.out.println("The file doesnt exist");
		if(obj.canRead())
			System.out.println("Readable");
		if(obj.canWrite())
			System.out.println("Writeable");
		try {
			System.out.println("Type = "+Files.probeContentType(obj.toPath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Length = "+ obj.length());
		
			
	}

}
