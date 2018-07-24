package r5;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class r5 extends Applet implements AdjustmentListener{
	
	Scrollbar Rbar,Gbar,Bbar;
	int rv=0,gv=0,bv=0;
	Label R_Label,G_Label,B_Label;
	
	public void init() {
		setLayout(null);
		
		R_Label=new Label("R(0)");
		G_Label=new Label("G(0)");
		B_Label=new Label("B(0)");
		R_Label.setBounds(0,10,50,20);
		G_Label.setBounds(0,40,50,20);
		B_Label.setBounds(0,70,50,20);
		add(R_Label);
		add(G_Label);
		add(B_Label);
		
		Rbar=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,256);
		Gbar=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,256);
		Bbar=new Scrollbar(Scrollbar.HORIZONTAL,0,2,0,256);
		Rbar.setBounds(60,10,100,20);
		Gbar.setBounds(60,40,100,20);
		Bbar.setBounds(60,70,100,20);
		add(Rbar);   Rbar.addAdjustmentListener(this);
		add(Gbar);   Gbar.addAdjustmentListener(this);
		add(Bbar);   Bbar.addAdjustmentListener(this);
	}
	
	public void paint(Graphics g) {
		g.setColor(new Color(rv,gv,bv));
		g.fillRect(170,10,80,80);
	}

	public void adjustmentValueChanged(AdjustmentEvent evt) {
		Scrollbar sb=(Scrollbar)evt.getSource();
		if(sb==Rbar)
			rv=Rbar.getValue();
		if(sb==Gbar)
			gv=Gbar.getValue();
		if(sb==Bbar)
			bv=Bbar.getValue();
		R_Label.setText("R("+rv+")");
		G_Label.setText("G("+rv+")");
		B_Label.setText("B("+rv+")");
		repaint();
	}
}
