import javax.swing.*;
class Radio 
{
	JFrame f;
	Radio()
	{
		f=new JFrame();
		JRadioButton x=new JRadioButton("A) Male");
		JRadioButton y=new JRadioButton("B) Female");
		x.setBounds(50,100,200,30);
		y.setBounds(50,150,200,30);
		ButtonGroup bg=new ButtonGroup();
		bg.add(x);
		bg.add(y);
		f.add(x);
		f.add(y);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new Radio();
	}
}
