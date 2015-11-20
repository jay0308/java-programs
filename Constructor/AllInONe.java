class AllInOne
{
	int x;
	void method1(int x)
	{
		this.x=x;     // Data Shadowing
		System.out.println("Value of x: "+this.x);
		AllInOne obj= method2(this); // Passing Current object reference from Method
		System.out.println("RETURNING from Method2"+obj);
		
	}
	AllInOne method2(AllInOne Take)
	{
		return this;   // Return Current object reference 
	}
	AllInOne()
	{
		this("JAY");   // Constructor Chaining
		System.out.println("Revising all Concept");
		method1(10);   // Implicitly invoke method using this
		
	}
	AllInOne(String name)
	{
		
		System.out.println(name);
		method3(this);  // Passing Current object reference from Constructor
	}

	void method3(AllInOne obj)
	{
		System.out.println(obj);
    }
		public static void main(String[] args) 
	{
		new AllInOne(); //Anonymous Object
	}
}
