package r1;

import java.applet.Applet;
import java.awt.*;

public class ri extends Applet{
    Label label;
    
	public void init( ) {
		label=new Label("Address Note");
		label.setBackground(Color.blue);
		add(label,Label.LEFT);
	}

}
