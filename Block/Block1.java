class Block1
{ 
	static int data=5;
     static  {
                Block1 obj=new Block1();
	         	try{
				data=System.in.read();
                }
				catch(Exception a){}
				obj.display();
             }
     void display()
     {
                System.out.println(data);
				System.exit(0);
     }

    public static void main(String[] args) 
     {
                System.out.println("WE Have done");
     }

}

