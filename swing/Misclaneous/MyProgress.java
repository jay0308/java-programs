import javax.swing.*;

class MyProgress extends JFrame 
{
	JProgressBar jb;
	int i=0,num=2000;
	MyProgress()
	{
		jb=new JProgressBar();
		jb.setBounds(40,40,200,30);
		jb.setValue(0);
		jb.setStringPainted(true);
		add(jb);
		setSize(400,400);
		setLayout(null);
	}
	public void iterate()
	{
		while(i<=2000)
		{
			jb.setValue(i);
			i=i+20;
			try{
				Thread.sleep(150);

			}
			catch(Exception c)
			{

			}
		}
	}
	public static void main(String[] args) 
	{
		MyProgress m=new MyProgress();
		m.setVisible(true);
		m.iterate();
	}
}
