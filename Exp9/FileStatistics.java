import java.io.*;
public class FileStatistics {
	public static void main(String args[])
	{
		File file=new File("statistics.txt");
		int words=0,spaces=0,lines=0,characters=0,letters=0,vowels=0,consonants=0,numbers=0;
		BufferedReader read= null;
		try
		{
		read=new BufferedReader(new FileReader(file));
		String line=null;
		while((line=read.readLine())!=null)
		{
			words+=line.split("\\s").length;
			vowels+=countVowels(line);
			numbers+=countnums(line);
			lines++;
			spaces+=countWhite(line);
			characters+=line.length()-countWhite(line);
			letters+=countletters(line);
			//consonants+=letters-countVowels(line);
			
		}
		consonants=letters-vowels;
		System.out.println("Words = "+words);
		System.out.println("Whitespaces = "+spaces);
		System.out.println("Lines = "+lines);
		System.out.println("Characters = "+characters);
		System.out.println("Letters = "+letters);
		System.out.println("Vowels = "+vowels);
		System.out.println("Consonants = "+consonants);
		System.out.println("Numerals = "+numbers);
	
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	static int countVowels(String line)
	{
		int count=0;
		for(int i=0;i<line.length();i++)
		{
			char a= line.toLowerCase().charAt(i);
			if(a=='a' || a=='e' || a=='o' || a=='i' || a=='u' )
				count++;
		}
		return count;
	}
	static int countWhite(String line)
	{
		int count=0;
		for(int i=0;i<line.length();i++)
		{
			char a= line.toLowerCase().charAt(i);
			if(a==' ')
				count++;
		}
		return count;
	}
	static int countletters(String line)
	{
		int count=0;
		for(int i=0;i<line.length();i++)
		{
			char a= line.charAt(i);
			if(Character.isLetter(a))
				count++;
		}
		return count;
	}
	static int countnums(String line)
	{
		int count=0;
		for(int i=0;i<line.length();i++)
		{
			char a= line.toLowerCase().charAt(i);
			if(Character.isDigit(a))
				count++;
		}
		return count;
	}
	
		

}
