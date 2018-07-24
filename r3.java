package r3;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class r3 extends Applet implements ActionListener{

	Button button1,button2;
	int sw=0;
	
	public void init() {
		setBackground(Color.white);
		button1=new Button("Circle");
		button2=new Button("clear");
		add(button1);
		add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent evt) {
		String label=evt.getActionCommand();
		if(label.equals("Circle"))
			sw=1;
		else
			sw=0;
		repaint();
	}
	
	public void paint(Graphics g) {
		if(sw==1)
			g.setColor(Color.black);
		else
			g.setColor(Color.white);
		g.drawOval(25,50,100,100);
	}
}
