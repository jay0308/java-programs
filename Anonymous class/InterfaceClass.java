interface Abc
{
	{
		System.out.println("kya mai chalunga");
	}
	/*public static void method(){
		System.out.println("chalega");
	}*/
}
class InterfaceClass 
{
	void call()
	{
		System.out.println("bom..");
	}

        public static void main(String[] args) 
	{
		Abc a=new Abc(){
			//void method()
			//{
				//System.out.println("method implemented in anonymous class");
			//}
		};
		Abc.method();
		//a.call();
	}
}
