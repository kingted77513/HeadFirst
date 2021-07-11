package chap12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGui implements ActionListener{
	
	JFrame frame;
	
	public static void main (String[] args) {
		SimpleGui gui = new SimpleGui();
		gui.go();
	}

	private void go() {
		frame = new JFrame();
		JButton button = new JButton("Change colors");
		button.addActionListener(this);
		
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println(event.getActionCommand());
		frame.repaint();
	}
	
	@SuppressWarnings("serial")
	private class MyDrawPanel extends JPanel {
		public void paintComponent(Graphics g) {
			g.setColor(Color.WHITE);
			g.fillRect(10, 10, this.getWidth() - 20, this.getHeight() - 20);
			
			Color randomColor = getRandomColor();
			g.setColor(randomColor);
			g.fillRect(70, 70, 100, 100);
		}

		private Color getRandomColor() {
			int red = getRandomIntergerUnder256();
			int green = getRandomIntergerUnder256();
			int blue = getRandomIntergerUnder256();
			
			Color randomColor = new Color(red, green, blue);
			return randomColor;
		}
		
		private int getRandomIntergerUnder256() {
			return (int) (Math.random() * 256);
		}
	}
}
