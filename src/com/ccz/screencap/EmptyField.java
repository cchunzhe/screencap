package com.ccz.screencap;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EmptyField {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmptyField window = new EmptyField();
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
	public EmptyField() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 220);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnterAFilename = new JLabel("Enter a filename!");
		lblEnterAFilename.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterAFilename.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblEnterAFilename.setBounds(12, 13, 420, 40);
		frame.getContentPane().add(lblEnterAFilename);
		
		JLabel lblPleaseEnterA = new JLabel("Please enter a filename for the screencap!");
		lblPleaseEnterA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPleaseEnterA.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseEnterA.setBounds(12, 66, 420, 56);
		frame.getContentPane().add(lblPleaseEnterA);
		
		JButton btnOk = new JButton("OK");
		btnOk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				frame.dispose();
			}
		});
		btnOk.setBounds(174, 147, 97, 25);
		frame.getContentPane().add(btnOk);
	}

}
