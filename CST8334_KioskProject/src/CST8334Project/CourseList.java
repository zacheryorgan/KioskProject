package CST8334Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class CourseList {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CourseList window = new CourseList();
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
	public CourseList() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1625, 875);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		
		JCheckBox box1 = new JCheckBox("CST8333");
		box1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		box1.setHorizontalAlignment(SwingConstants.CENTER);
		box1.setBounds(560, 198, 97, 23);
		frame.getContentPane().add(box1);
		
		JCheckBox box2 = new JCheckBox("CST8334");
		box2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		box2.setHorizontalAlignment(SwingConstants.CENTER);
		box2.setBounds(560, 253, 97, 23);
		frame.getContentPane().add(box2);
		
		JCheckBox box3 = new JCheckBox("CST8276");
		box3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		box3.setHorizontalAlignment(SwingConstants.CENTER);
		box3.setBounds(560, 310, 97, 23);
		frame.getContentPane().add(box3);
		
		JCheckBox box4 = new JCheckBox("CST8277");
		box4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		box4.setHorizontalAlignment(SwingConstants.CENTER);
		box4.setBounds(560, 373, 97, 23);
		frame.getContentPane().add(box4);
		
		JCheckBox box5 = new JCheckBox("CST8001");
		box5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		box5.setHorizontalAlignment(SwingConstants.CENTER);
		box5.setBounds(560, 434, 97, 23);
		frame.getContentPane().add(box5);
		
		JCheckBox box6 = new JCheckBox(" CST8284");
		box6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		box6.setHorizontalAlignment(SwingConstants.CENTER);
		box6.setBounds(901, 198, 97, 23);
		frame.getContentPane().add(box6);
		
		JCheckBox box7 = new JCheckBox("CST2335");
		box7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		box7.setHorizontalAlignment(SwingConstants.CENTER);
		box7.setBounds(901, 253, 97, 23);
		frame.getContentPane().add(box7);
		
		JCheckBox box8 = new JCheckBox("CST8108");
		box8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		box8.setHorizontalAlignment(SwingConstants.CENTER);
		box8.setBounds(901, 310, 97, 23);
		frame.getContentPane().add(box8);
		
		JCheckBox box9 = new JCheckBox("CST8288");
		box9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		box9.setHorizontalAlignment(SwingConstants.CENTER);
		box9.setBounds(901, 373, 97, 23);
		frame.getContentPane().add(box9);
		
		JCheckBox box10 = new JCheckBox("CST8283");
		box10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		box10.setHorizontalAlignment(SwingConstants.CENTER);
		box10.setBounds(901, 434, 97, 23);
		frame.getContentPane().add(box10);
		
		JButton btnSelectAll = new JButton("Select all");
		btnSelectAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				box1.setSelected(true);
				box2.setSelected(true);
				box3.setSelected(true);
				box4.setSelected(true);
				box5.setSelected(true);
				box6.setSelected(true);
				box7.setSelected(true);
				box8.setSelected(true);
				box9.setSelected(true);
				box10.setSelected(true);
			}
		});
		btnSelectAll.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnSelectAll.setBounds(581, 578, 103, 40);
		frame.getContentPane().add(btnSelectAll);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box1.setSelected(false);
				box2.setSelected(false);
				box3.setSelected(false);
				box4.setSelected(false);
				box5.setSelected(false);
				box6.setSelected(false);
				box7.setSelected(false);
				box8.setSelected(false);
				box9.setSelected(false);
				box10.setSelected(false);
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnReset.setBounds(754, 578, 97, 40);
		frame.getContentPane().add(btnReset);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AccountCreated open = new AccountCreated();
				open.main(null);
				frame.dispose();
			
			}
		});
		btnSubmit.setBounds(931, 578, 97, 40);
		frame.getContentPane().add(btnSubmit);
		
		JLabel lblPleaseSelectThe = new JLabel("Please select the courses that you are going to learn/teach");
		lblPleaseSelectThe.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		lblPleaseSelectThe.setBounds(524, 78, 591, 32);
		frame.getContentPane().add(lblPleaseSelectThe);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp open = new SignUp();
				open.main(null);
				frame.dispose();
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnBack.setBounds(522, 750, 97, 40);
		frame.getContentPane().add(btnBack);
	}
}
