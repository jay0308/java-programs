class Display1
{
	public void disp(int c, int num)
	{
		System.out.println("I am the first defination of method display");
	}
	
	 void disp(int num, char c)
	{
		System.out.println("I am the second defination of method display");
	}
}
class Sample1 
{
	public static void main(String[] args) 
	{
		Display1 d=new Display1();
		d.disp('x',51);
		d.disp(51,'y');
	}
}
