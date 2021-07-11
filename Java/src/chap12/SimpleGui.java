package chap12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleGui implements ActionListener{
	JButton button;
	
	public static void main (String[] args) {
		SimpleGui gui = new SimpleGui();
		gui.go();
	}

	private void go() {
		JFrame frame = new JFrame();
		button = new JButton("click me");
		
		button.addActionListener(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(button);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println(event.getActionCommand());
		button.setText("I've benn clicked!");
	}
}
