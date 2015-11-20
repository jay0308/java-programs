import java.awt.*;
import javax.swing.*;
class MyFlowLayout 
{
	JFrame f;
	Button B[];
	MyFlowLayout()
	{
		f=new JFrame("MyFlowLayout");
		B=new Button[5];
		for(int i=0;i<5;i++)
		{
			B[i]=new Button("Button"+(i+1));
			f.add(B[i]);
		}
		f.setLayout(new FlowLayout(FlowLayout.LEFT,10,100));
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) 
	{
		new MyFlowLayout();
	}
}