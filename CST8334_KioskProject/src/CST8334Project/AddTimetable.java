package CST8334Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class AddTimetable {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddTimetable window = new AddTimetable();
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
	public AddTimetable() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.menu);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAddYourTimetable = new JLabel("Add your Timetable here");
		lblAddYourTimetable.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblAddYourTimetable.setBounds(302, 60, 251, 63);
		frame.getContentPane().add(lblAddYourTimetable);
		
		JButton btnOpen = new JButton("Browse");
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JFileChooser chooser = new JFileChooser();
			chooser.showOpenDialog(null);
			
			}
		});
		btnOpen.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnOpen.setBounds(254, 158, 91, 29);
		frame.getContentPane().add(btnOpen);
		
		JLabel lblAddFileFrom = new JLabel("Add file from PC");
		lblAddFileFrom.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAddFileFrom.setBounds(403, 161, 150, 26);
		frame.getContentPane().add(lblAddFileFrom);
		frame.setBounds(100, 100,1625, 875);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}

}
