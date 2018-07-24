package r4;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class r4 extends Applet implements ItemListener{
	Checkbox c1,c2;
	
	public void init() {
		c1=new Checkbox("man");
		c2=new Checkbox("woman");
		add(c1);
		add(c2);
		c1.addItemListener(this);
		c2.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent evt) {
		Checkbox cb=(Checkbox)evt.getSource();
		if(cb==c1||cb==c2) {
			if(cb.getState()==true)
				showStatus("On");
			else
				showStatus("Off");
		}
	}
}
