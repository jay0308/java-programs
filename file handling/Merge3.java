//Program to merge data from all .txt file to output file
import java.io.*;
class Merge3 
{
	public static void main(String[] args) throws IOException
	{
		File file=new File("E:\\java programs\\file handling");
		String[] lst=file.list();
		try{
		System.out.println(lst[0]);
		for(int i=0;i<lst.length;i++)
		{
			if(lst[i].contains(".txt"))
			{
				BufferedReader br=new BufferedReader(new FileReader(lst[i]));
				String s=br.readLine();
				while(s!=null)
				{
					f.println(s);
					s=br.readLine();
				}
			}
		}
		}
		catch(NullPointerException e){}
		f.flush();
		f.close();

	}
}
