class MenuDriven
{
	int data;
	String name;

	MenuDriven()
	{
		this.data=1;
		this.name="ABC";
	}
	
	void display()
	{
		System.out.println("DATA : "+this.data+" NAME : "+this.name);
	}
	
	public static void main(String arg[])
	{
		MenuDriven obj=new MenuDriven();
			       // break;

		int i=0;
		for( ;i<3;i++)
		{
		  switch(i)
		   {
			case 0:  break;           case 1: obj.display();
			        break;
            case 2: System.out.println("WELCOME 2 PROLOG ACADEMY");
		   }
		}	   
    }

}
