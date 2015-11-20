import javax.swing.*;
class MySlider extends JFrame 
{
	JSlider slider;
	MySlider()
	{
		slider=new JSlider(JSlider.HORIZONTAL,0,50,25);
		slider.setMinorTickSpacing(2);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		JPanel panel=new JPanel();
		panel.add(slider);
		add(panel);
		pack();
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new MySlider();
	}
}
