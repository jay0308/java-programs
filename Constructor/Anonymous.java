class S
{
  static Demo o=new Demo();
}

class Demo
{
   void p(int x)
    {
       System.out.println(x);
    }

}

class Anonymous
{
	
	int data;
	public Anonymous change(int data)
	{
	   this.data=data;
	   S.o.p(this.data);
	   return this;
	}

    public static void main(String[] args)
	{
	    new Anonymous().change(10);
	    Anonymous obj=new Anonymous().change(20);
            S.o.p(obj.data);		
      		
	}
}	