//program to perform file extraction operation
import java.io.*;
class Merge4 
{
	public static void main(String[] args)throws IOException 
	{
		PrintWriter f=new PrintWriter("extract.txt");
		BufferedReader br1=new BufferedReader(new FileReader("File1.txt"));
			String s=br1.readLine();
		while(s!=null)
		{
			BufferedReader br2=new BufferedReader(new FileReader("File2.txt"));
			String s2=br2.readLine();
			while(s2!=null&&!s.equals(s2))
			{
				s2=br2.readLine();
			}
			if(s2==null){
				f.println(s);}
				s=br1.readLine();
		}
		f.flush();
		f.close();
	}
}
