class B
{
  B()
  { 
	System.out.println("Method is Invocked");
	Const1 obj=new Const1();
  }	
  
}
 class Const1
{
 
 Const1(Const obk)
 {
   
   System.out.println("Constructor is invocked");
   B obj2=new B();
 }  
 
 
 public static void main(String... args)
 {
   Const1 obj=new Const1(this);   
 }
 
}