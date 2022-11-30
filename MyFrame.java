import java.awt.Color;

import javax.swing.JFrame;

public class MyFrame extends JFrameTest{

	MyFrame(){
		JFrame frame = new JFrame();
		frame.setTitle("Java Gui Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650,650);
		frame.setVisible(true);
		
		frame.getContentPane().setBackground(Color.BLACK);
	}
}
