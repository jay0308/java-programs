import java.awt.*;
import java.awt.event.*;
class MyCalcy implements ActionListener
{
	Frame f;
	TextField tf1,tf2,tf3;
	Button b1;

	MyCalcy(String s)
	{
		f=new Frame();
		tf1=new TextField();
		tf2=new TextField();
		tf3=new TextField();
		b1=new Button("ADD");

		b1.addActionListener(this);
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(b1);
		f.setLayout(new FlowLayout());
		f.setSize(400,400);
		f.setVisible(true);


	}

	public void actionPerformed(ActionEvent e)
	{
		String s1=tf1.getText();
		String s2=tf2.getText();
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int n3=n1+n2;
		tf3.setText(String.valueOf(n3));
	}
	public static void main(String[] args) 
	{
		MyCalcy m =new MyCalcy("calcy");
	}
}
