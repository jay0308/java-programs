//Program to merge file line by line
import java.io.*;
class Merge2 
{
	public static void main(String[] args)throws IOException 
	{
		PrintWriter f=new PrintWriter("File3.txt");
		BufferedReader br1=new BufferedReader(new FileReader("File1.txt"));
		BufferedReader br2=new BufferedReader(new FileReader("File2.txt"));
		int flag=0;
		String s1=br1.readLine();
		String s2=br2.readLine();
		while(s1!=null||s2!=null)
		{
			if(flag==0)
			{
				f.println(s1);
				s1=br1.readLine();
				flag=1;
			}
			else
			{
				f.println(s2);
				s2=br2.readLine();
				flag=0;
			}
		}
		f.flush();
		f.close();
	}
}
