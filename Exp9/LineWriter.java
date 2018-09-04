import java.io.*;
public class LineWriter {
	public static void main(String args[])
	{
		File file1=new File("Main.txt");
		File file2=new File("Copy.txt");
		BufferedReader read=null;
		BufferedWriter write=null;
		try
		{
			read= new BufferedReader(new FileReader(file1));
			write = new BufferedWriter(new FileWriter(file2,true));
			String line;
			int c=0;
			while((line=read.readLine())!=null)
			{
				c++;
				write.write(c+". "+line);
				write.newLine();
				
			}
			read.close();
			write.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		}


	}

}
