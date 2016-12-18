package com.ccz.screencap;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class About {

	public JFrame about;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About window = new About();
					window.about.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public About() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		about = new JFrame();
		about.setResizable(false);
		about.setBounds(150, 150, 500, 300);
		about.setTitle("About Screencap");
		about.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		about.getContentPane().setLayout(null);
		
		JButton btnClose = new JButton("Close");
		btnClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				//about.setVisible(false);
				about.dispose();
			}
		});
		btnClose.setBounds(190, 227, 97, 25);
		about.getContentPane().add(btnClose);
		
		JLabel lblScreencap = new JLabel("Screencap 1.0");
		lblScreencap.setHorizontalAlignment(SwingConstants.CENTER);
		lblScreencap.setFont(new Font("STXinwei", Font.PLAIN, 25));
		lblScreencap.setBounds(160, 13, 152, 40);
		about.getContentPane().add(lblScreencap);
		
		JLabel lblDevelopedBy = new JLabel("Developed by:");
		lblDevelopedBy.setVerticalAlignment(SwingConstants.TOP);
		lblDevelopedBy.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDevelopedBy.setBounds(160, 66, 97, 148);
		about.getContentPane().add(lblDevelopedBy);
		
		JLabel lblCcz = new JLabel("CCZ");
		lblCcz.setVerticalAlignment(SwingConstants.TOP);
		lblCcz.setHorizontalAlignment(SwingConstants.LEFT);
		lblCcz.setBounds(269, 66, 97, 148);
		about.getContentPane().add(lblCcz);
	}
}
