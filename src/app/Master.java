package app;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Master {
	void load() {
		JFrame loadWindow = new JFrame();
		
		JPanel loadPanel = new JPanel();
		loadWindow.add(loadPanel);
		
		JLabel title = new JLabel("Human Nature ");
		title.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
		loadPanel.add(title);
		
		JButton quit = new JButton("Quit");
		quit.addActionListener(new loadQuitHandler());
		quit.setAlignmentX(JButton.RIGHT_ALIGNMENT);
		loadPanel.add(quit);
		
		loadPanel.setBackground(new Color(75,0,0));
		loadWindow.setPreferredSize(new Dimension(600,400));
		loadWindow.setUndecorated(true);
		loadWindow.setLocation(200, 200);
		
		loadPanel.setLayout(new BoxLayout(loadPanel, BoxLayout.PAGE_AXIS));
		
		loadWindow.pack();
		loadWindow.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Master().load();
	}
	
	class loadQuitHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
		
	}
}
