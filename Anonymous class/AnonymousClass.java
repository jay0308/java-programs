abstract class Abc
{
	abstract void method();
}
class AnonymousClass 
{
	void call()
	{
		System.out.println("bom..");
	}

        public static void main(String[] args) 
	{
		Abc a=new Abc(){
			void method()
			{
				System.out.println("method implemented in anonymous class");
			}
		};
		a.method();
		a.call();
	}
}
