class Parent
{
	static void display()
	{
		System.out.println("i am in parent class");
	}
}
class Child extends Parent
{
	static void display()
	{
		System.out.println("i am in child class");
	}
}
class MethodOverriding  
{
	public static void main(String[] args) 
	{
		Parent p=new Child();
		p.display();
	}
}
