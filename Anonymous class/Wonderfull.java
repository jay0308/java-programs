interface Cookable
{
	void cook();
}
class  Wonderfull
{
	void doStuff(Cookable c)
	{
		c.cook();
	}
	public static void main(String[] args) 
	{
		Wonderfull w=new Wonderfull();
		w.doStuff(new Cookable(){
			public void cook()
			{
				System.out.println("Making Cookies...");
			}
		});
	}
}
