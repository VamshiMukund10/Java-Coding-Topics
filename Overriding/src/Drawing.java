import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Drawing extends JFrame {
public static void main(String[] args) {
	new Drawing();
	
}
public Drawing() {
	setSize(500,500);
	setVisible(true);
}

@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		//super.paint(g);
		
	//g.drawRect(100, 200, 30, 40);
	//g.draw3DRect(200, 400, 50, 60, false);
	//g.drawArc(300, 400, 200, 300, 60, 90);
	g.draw3DRect(200, 400, 50, 60, true);

	g.setColor(Color.blue);
	g.fillRect(300, 300, 30, 60);
	}
}
