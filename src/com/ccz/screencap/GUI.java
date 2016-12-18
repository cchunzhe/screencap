package com.ccz.screencap;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class GUI {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setTitle("Screencap");
		frame.setResizable(false);
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 794, 26);
		frame.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
		        System.exit(0);
			}
		});
		
		JMenu mnOptions = new JMenu("Options");
		menuBar.add(mnOptions);
		
		JMenuItem mntmNothing = new JMenuItem("Nothing here yet!");
		mnOptions.add(mntmNothing);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				About.main(null);
			}
		});
		mnHelp.add(mntmAbout);
		
		JLabel lblFilename = new JLabel("Filename:");
		lblFilename.setBounds(10, 49, 69, 16);
		frame.getContentPane().add(lblFilename);
		
		JTextPane textPane = new JTextPane();
		textPane.setToolTipText("Enter filename of screencap");
		textPane.setBounds(91, 49, 250, 22);
		frame.getContentPane().add(textPane);
		
		JMenuItem mntmNewScreencap = new JMenuItem("New screencap");
		mntmNewScreencap.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textPane.getText().equals("")) {
				    EmptyField.main(null);
				} else {
					String text = textPane.getText();
				    try {
				        Screencap.screencap(text);
				    } catch (Exception e1) {
				        e1.printStackTrace();
				    }
				}
			}
		});
		mnFile.add(mntmNewScreencap);
		mnFile.add(mntmExit);
		
		JButton btnScreencap = new JButton("Screencap!");
		btnScreencap.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (textPane.getText().equals("")) {
				    EmptyField.main(null);
				} else {
					String text = textPane.getText();
				    try {
				        Screencap.screencap(text);
				    } catch (Exception e1) {
				        e1.printStackTrace();
				    }
				}
			}
		});
		btnScreencap.setBounds(91, 117, 140, 25);
		frame.getContentPane().add(btnScreencap);
	}
}
