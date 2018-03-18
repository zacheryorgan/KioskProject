package CST8334Project;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;

public class Welcome_Faculty {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome_Faculty window = new Welcome_Faculty();
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
	public Welcome_Faculty() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.menu);
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 1625, 875);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		
		JLabel lblWelcomeToAlgonquin = new JLabel("Welcome to Algonquin College");
		lblWelcomeToAlgonquin.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblWelcomeToAlgonquin.setBounds(246, 35, 325, 33);
		frame.getContentPane().add(lblWelcomeToAlgonquin);
		
		JButton btnAddTimetable = new JButton("Add Timetable");
		btnAddTimetable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddTimetable add = new AddTimetable();
				add.main(null);
			}
		});
		btnAddTimetable.setBounds(337, 128, 153, 43);
		frame.getContentPane().add(btnAddTimetable);
		
		JButton btnNewButton = new JButton("Put a Notice");
		btnNewButton.setBounds(337, 250, 153, 43);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Find a Room");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://lyceum.algonquincollege.com/roomfinder/"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_1.setBounds(337, 362, 153, 43);
		frame.getContentPane().add(btnNewButton_1);
		
	}

}
