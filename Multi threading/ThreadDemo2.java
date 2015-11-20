//if we are not overriding run() method
class MyThread extends Thread
{
}
class ThreadDemo2
{
	public static void main(String[] args) 
	{
		MyThread t=new MyThread();
			t.start();
		

	}
}