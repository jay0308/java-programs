//program to merge data from 2 files into a 3rd file
import java.io.*; 
class Merge1 
{
	public static void main(String[] args) throws IOException
	{
		PrintWriter f1=new PrintWriter("File1.txt");//create file 1
		f1.print("Hello i am writting in a file1 ");
		f1.flush();
		f1.close();
		PrintWriter f2=new PrintWriter("File2.txt");//create file 2
		f2.print("Hello i am writting in a file2 ");
		f2.flush();
		f2.close();
		PrintWriter f3=new PrintWriter("File3.txt");
		BufferedReader br1 =new BufferedReader(new FileReader("File1.txt"));
		String s=br1.readLine();
		while(s!=null)
		{
			f3.println(s);
			s=br1.readLine();
		}
		BufferedReader br2 =new BufferedReader(new FileReader("File2.txt"));
		s=br2.readLine();
		while(s!=null)
		{
			f3.println(s);
			s=br2.readLine();
		}
		f3.flush();
		f3.close();
	}
}
 