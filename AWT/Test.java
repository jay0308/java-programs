import java.awt.*;
import java .awt.event.*;
class Test implements ActionListener
{
	float a=0,b=0,c=0;
	char s1;
	Frame f;
	TextField tf1,tf2;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,plus,sub,div,mul,equal,clear;
	Label l;
	Test()
	{
		f=new Frame("Clacy");
		tf1=new TextField();
		tf2=new TextField();
		b0=new Button("0");
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		plus=new Button("+");
	    sub=new Button("-");
		div=new Button("/");
		mul=new Button("*");
		equal=new Button("=");
		clear=new Button("C");

		tf1.setBounds(100,110,60,30);
		tf2.setBounds(160,110,20,30);
		b1.setBounds(100,140,20,20);
		b2.setBounds(120,140,20,20);
		b3.setBounds(140,140,20,20);
		b4.setBounds(160,140,20,20);
		b5.setBounds(100,160,20,20);
		b6.setBounds(120,160,20,20);
		b7.setBounds(140,160,20,20);
		b8.setBounds(160,160,20,20);
		b9.setBounds(100,180,20,20);
		b0.setBounds(120,180,20,20);
		equal.setBounds(140,180,20,20);
		clear.setBounds(160,180,20,20);
		plus.setBounds(100,200,20,20);
		sub.setBounds(120,200,20,20);
		mul.setBounds(140,200,20,20);
		div.setBounds(160,200,20,20);

		f.add(tf1);
		f.add(tf2);
		f.add(b0);
		f.add(b1);
		f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(equal);f.add(plus);f.add(mul);f.add(sub);f.add(div);f.add(clear);

		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		plus.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		equal.addActionListener(this);
		clear.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==clear)
		{
			tf1.setText("");
			tf2.setText("");
			
		}
		
		
		if(e.getSource()==b0)
		{
			String s="0";
			tf1.setText(tf1.getText().concat(s));
			
		}
		
		if(e.getSource()==b1)
		{
			String s="1";
			tf1.setText(tf1.getText().concat(s));
			
		}
		
		if(e.getSource()==b2)
		{
			String s="2";
			tf1.setText(tf1.getText().concat(s));
			
		}
		
		if(e.getSource()==b3)
		{
			String s="3";
			tf1.setText(tf1.getText().concat(s));
			
		}
		
		if(e.getSource()==b4)
		{
			String s="4";
			tf1.setText(tf1.getText().concat(s));
			
		}
		
		if(e.getSource()==b5)
		{
			String s="5";
			tf1.setText(tf1.getText().concat(s));
			
		}
		
		if(e.getSource()==b6)
		{
			String s="6";
			tf1.setText(tf1.getText().concat(s));
			
		}
		
		if(e.getSource()==b7)
		{
			String s="7";
			tf1.setText(tf1.getText().concat(s));
			
		}

		if(e.getSource()==b8)
		{
			String s="8";
			tf1.setText(tf1.getText().concat(s));
			
		}
		
		if(e.getSource()==b9)
		{
			String s="9";
		tf1.setText(tf1.getText().concat(s));
			
		}
		
		if(e.getSource()==plus)
		{
			a=Float.parseFloat(tf1.getText());
			s1='+';
			tf2.setText("+");
			//tf1.setText(tf1.getText().concat(s1));
			tf1.setText("");
		
		}
			
		
		if(e.getSource()==sub)
		{
			 a=Float.parseFloat(tf1.getText());
			 s1='-';
			 tf2.setText("-");
			//tf1.setText(tf1.getText().concat(s1));
			tf1.setText("");

	
		}
		if(e.getSource()==mul)
		{
			 a=Float.parseFloat(tf1.getText());
			 s1='*';
			 tf2.setText("*");
			//tf1.setText(tf1.getText().concat(s1));
			tf1.setText("");
	
		}
		
		if(e.getSource()==div)
		{
			 a=Float.parseFloat(tf1.getText());
			 s1='/';
			 tf2.setText("/");
			//tf1.setText(tf1.getText().concat(s1));
			tf1.setText("");
		
		}
		
		if(e.getSource()==equal)
		{
			b=Float.parseFloat(tf1.getText());
			System.out.println(s1);
			if(s1=='+')
			{c=a+b;tf2.setText("");}
			if(s1=='-')
			{c=a-b;tf2.setText("");}
			if(s1=='*')
			{c=a*b;tf2.setText("");}
			if(s1=='/')
			{c=a/b;tf2.setText("");}
		tf1.setText(String.valueOf(c));
		}
			
	
	}
	public static void main(String[] args) 
	{
		Test t=new Test();
	}
}
