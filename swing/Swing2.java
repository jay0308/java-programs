import javax.swing.*;
class Swing2
{
	JFrame f;
	JButton b;
	Swing1()
	{
		f=new JFrame();
		b=new JButton();

		b.setBounds(130,100,100,40);
		f.add(b);
		f.setTitle("swing via association");
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new Swing2();
	}
}
