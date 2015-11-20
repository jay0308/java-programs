class ProvingThis
{ int data=70;
    void m()
	{
	  ProvingThis obk=new ProvingThis();
      System.out.println(obk.data);	 
	  System.out.println(this);
	}
  public static void main(String[] arg)
    {
      ProvingThis obj=new ProvingThis();
	  ProvingThis obj1=new ProvingThis();
	  System.out.println(obj);
	  obj.m(); 
	  System.out.println(obj1);
	  obj1.m();	
	  }
}	