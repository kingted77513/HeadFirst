package chap13;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutTest {

	public static void main(String[] args) {
		FlowLayoutTest gui = new FlowLayoutTest();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}

}
