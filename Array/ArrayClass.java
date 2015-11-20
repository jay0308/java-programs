class ArrayClass 
{
	public static void main(String[] args) 
	{
		int[][] testscore={{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<testscore.length;i++)   //arr.length used in array and length() used in string
		{
			for(int j=0;j<testscore[i].length;j++)
		    System.out.print(testscore[i][j]+" ");
			System.out.println();
		}
	}
}
