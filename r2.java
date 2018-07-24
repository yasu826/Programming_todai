package r2;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class r2 extends Applet implements ActionListener{
    TextField tf1,tf2,tf3,tf4;
	public void init() {
		tf1=new TextField(30);
		tf2=new TextField("Your name",40);
		tf3=new TextField("Age",20);
		tf4=new TextField(10);
		add(tf1);
		add(tf2);
		add(tf3);
		add(tf4);
		tf1.addActionListener(this);
		tf2.addActionListener(this);
		tf3.addActionListener(this);
		tf4.addActionListener(this);
		setLayout(null);
		tf1.setBackground(new Color(0,100,0));
		tf1.setForeground(new Color(0,255,0));
		tf1.setFont(new Font("courier",Font.BOLD,20));
		tf1.setBounds(50,80,200,30);
		tf2.setBackground(new Color(100,0,0));
		tf2.setForeground(new Color(255,0,0));
		tf2.setFont(new Font("courier",Font.BOLD,20));
		tf2.setBounds(1,1,120,40);
		tf3.setBackground(new Color(0,0,100));
		tf3.setForeground(new Color(0,0,255));
		tf3.setFont(new Font("courier",Font.BOLD,20));
		tf3.setBounds(30,120,120,20);
		tf4.setBackground(new Color(100,100,0));
		tf4.setForeground(new Color(255,50,0));
		tf4.setFont(new Font("courier",Font.BOLD,20));
		tf4.setBounds(1,150,120,40);
	}
	public void actionPerformed(ActionEvent evt) {
		TextField tf=(TextField)evt.getSource( );
		if(tf==tf1||tf==tf2||tf==tf3||tf==tf4)
			showStatus(tf.getText( ));
	}
}
