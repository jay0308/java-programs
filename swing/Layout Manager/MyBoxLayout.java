import java.awt.*;
import javax.swing.*;
class MyBoxLayout extends Frame
{
	Button B[];
	MyBoxLayout()
	{
		B=new Button[5];
		for(int i=0;i<5;i++)
		{
			B[i]=new Button("Button"+(i+1));
			add(B[i]);
		}
		setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new MyBoxLayout();
	}
}