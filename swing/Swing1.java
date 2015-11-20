import javax.swing.*;
class Swing1 extends JFrame
{
	
	JButton b;
	Swing1()
	{
		b=new JButton();

		b.setBounds(130,100,100,40);
		add(b);
		setTitle("swing via inheritance");
		setSize(400,500);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new Swing1();
	}
}
