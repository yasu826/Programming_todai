package r6;

import java.applet.Applet;
import java.awt.*;

public class r6 extends Applet{
	int rows=5,cols=4,hgap=2,vgap=2;
	
	String button_name[]= {  "C","M+","M-","MR",
			                 "7","8","9","/",
			                 "4","5","6","*",
			                 "1","2","3","-",
			                 "0",".","=","+",};
	Button calc_button[]=new Button[20];

	public void init() {
		setLayout(new GridLayout(rows,cols,hgap,vgap));
		for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			int p=i*4+j;
			calc_button[p]=new Button(button_name[p]);
			add(calc_button[p]);
		}
		}
	}
}
