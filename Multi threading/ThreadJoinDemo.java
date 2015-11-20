//thread class join() method
class MyThread extends Thread 
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("My Thread");
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
			}
		}
	}
}
class Test extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
			System.out.println("test");
	}
}
class ThreadJoinDemo
{
	public static void main(String[] args) throws InterruptedException				//join throws exception (checked exception)
	{
		
		MyThread t=new MyThread();
		Test t1=new Test();
		t.start();
		t.join(6000);							//overloaded method of join
		t1.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main()");
		}
	}
}
