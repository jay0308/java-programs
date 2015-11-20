//thread class yield method
class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			//Thread.yield();					//yield() is a static method of thread class
			System.out.println("run");
		}
	}
}
class ThreadYieldDemo 
{
	public static void main(String[] args) 
	{
		MyThread t=new MyThread();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello World!");
		}
	}
}
