import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Objects {

	public static void main(String[] args) {
		
		//create variable
		int value = 5;
		//Creating an Object ----new is a keyword,storing object JFrame in window.
		JFrame window = new JFrame();
		
		window.setVisible(true);
		window.setSize(700, 800);
		window.setTitle("Window1");
		
		JLabel label = new JLabel();
		label.setText("This Window is created for testing purpose");
		label.setFont(new Font(label.getName(), Font. ROMAN_BASELINE, 12));
		window.add(label);
		
		

	}

}
