
 class S 
{
	static Demo O;
		static{
		O=new Demo();
		}
}

class Demo
{
    void P(String s)
	{
		System.out.println(s);
	}
}
 class Sysout1
{
	public static void main(String[] args) 
	{
		S.O.P("Hello World!");
	}
}
