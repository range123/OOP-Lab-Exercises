import java.io.*;
public class FileExercise {
	public static void main(String args[])
	{
		File file = new File("/rhome/3cse4064/workspace/exp9/src/FileExercise.java");
		File file2 = new File("NewFileExercise.java");
		BufferedReader in=null ;
		BufferedWriter out = null;
		try {
			in = new BufferedReader(new FileReader(file));
			out= new BufferedWriter(new FileWriter(file2,true));
		} catch (IOException e) {
			System.out.println("File not found");
		}
		String st;
		try {
			while ((st = in.readLine()) != null)
			{
				out.write(st);
				out.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			out.close();
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


