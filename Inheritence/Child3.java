class Dadaji 
{
	int x=10;
	void show()
	{
		System.out.println("Dadaji");
    }
}

class Parent extends Dadaji
{
	int x=20;
	void show()
	{   
		System.out.println("Parent");
    }
}

class Child3 extends Parent
{
    int x=30;
	{
		((Dadaji)this).show();  // Concept of overridding  
	      
	}
	
	void show()
	{
		System.out.println("child");
	}
	
	public static void main(String... args)
	{
		
		Child3 obj=new Child3();
		//obj.show(); 
 
    } 
}