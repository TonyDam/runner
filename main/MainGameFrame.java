package main;

import javax.swing.*;

public class MainGameFrame extends JFrame {

	private JPanel runnerGamePanel;
	
	public MainGameFrame() {
		
		runnerGamePanel = new RunnerGamePanel();
		
		setDefaultCloseOperation( EXIT_ON_CLOSE);
		setTitle( "Petit runner game test tuto par tony");
		setLocation(500, 200);
		add( runnerGamePanel);
		pack();
		setResizable(false);
		setVisible( true);
		
	}
	
	public static void main( String[] args) {
		
		new MainGameFrame();
	}

}
