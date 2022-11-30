import java.awt.Color;

import javax.swing.JFrame;

public class JFrameTest {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("Java Gui Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650,650);
		frame.setVisible(true);
		
		frame.getContentPane().setBackground(Color.BLACK);
	}
}
