package CST8334Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JSeparator;

public class Welcome_Student {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome_Student window = new Welcome_Student();
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
	public Welcome_Student() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.menu);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(25, 25,1625, 875);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
		frame.getContentPane().setLayout(null);
		frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		
		JLabel lblWelcomeToAlgonquin = new JLabel("Welcome to Algonquin College");
		//lblWelcomeToAlgonquin.setForeground(Color.BLACK);
		lblWelcomeToAlgonquin.setBackground(Color.CYAN);
		lblWelcomeToAlgonquin.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblWelcomeToAlgonquin.setBounds(246, 35, 325, 33);
		frame.getContentPane().add(lblWelcomeToAlgonquin);
		
		JButton btnNewButton = new JButton("View Timetable");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(296, 284, 206, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Find a Room");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://lyceum.algonquincollege.com/roomfinder/"));
				} catch (IOException e1) {
				
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_1.setBounds(296, 352, 206, 33);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Book an Appointment");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_2.setBounds(296, 139, 206, 38);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Notifications or Announcements");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_3.setBounds(296, 214, 257, 37);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnBack.setBounds(98, 475, 89, 23);
		frame.getContentPane().add(btnBack);
		
		
	
	}
}
