package chap13;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest {
	
	public static void main(String[] args) {
		BorderLayoutTest gui = new BorderLayoutTest();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		JButton east = new JButton("East");
		JButton east_LongName = new JButton("Long East");
		JButton west = new JButton("West");
		JButton north = new JButton("North");
		JButton south = new JButton("South");
		JButton center = new JButton("Center");
		
		Container cp = frame.getContentPane();
		cp.add(BorderLayout.EAST, east);
		cp.add(BorderLayout.EAST, east_LongName);
		cp.add(BorderLayout.WEST, west);
		cp.add(BorderLayout.NORTH, north);
		cp.add(BorderLayout.SOUTH, south);
		cp.add(BorderLayout.CENTER, center);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}
