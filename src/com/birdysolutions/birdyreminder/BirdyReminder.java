package com.birdysolutions.birdyreminder;

import javax.swing.*;
import javax.swing.JFrame;

public class BirdyReminder {

	
	JFrame f = new JFrame("BirdyReminder");
	JTextField time = new JTextField(10);
	JButton ok = new JButton("set");
	
	public void init()
	{
		JPanel bottom = new JPanel();
		bottom.add(time);
		bottom.add(ok);

		f.add(bottom);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.pack();
		f.setVisible(true);
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new BirdyReminder().init();
	}

}
