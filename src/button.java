import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JButton;

//Parent Class
public class button extends JButton{

	
	public button() {
		setContentAreaFilled(false);
		setFocusable(false);
		setBorderPainted(false);
		setOpaque(false);
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		setFont(new Font("Century Gothic", Font.PLAIN, 10));
		setBackground(Color.yellow);
		setMargin(new Insets(0, 0, 0, 0));
		clicked();
	}

	void clicked() {
		setBackground(Color.yellow);
	}
	
	
}
