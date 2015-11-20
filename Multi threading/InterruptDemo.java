//thread class sleep method and interruption of thread 
class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Lazzy Thread");
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				System.out.println("I got interrupted");
			}
		}
	}
} 
class InterruptDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
		MyThread t=new MyThread();
		t.start();
		t.interrupt();
		System.out.println("Hello World!");
	}
}
