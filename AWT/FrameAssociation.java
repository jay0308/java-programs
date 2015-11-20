import java.awt.*;
class FrameAssociation
{
	Frame f;
	FrameAssociation(String s)
	{
		f=new Frame(s);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String[] args) 
	{
		FrameAssociation f=new FrameAssociation("Frame via Association");
	}
}
 