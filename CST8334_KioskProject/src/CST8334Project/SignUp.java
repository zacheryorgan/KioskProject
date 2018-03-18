package CST8334Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUp {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
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
	public SignUp() {
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


		
		JLabel lblAddNewAccount = new JLabel("Add New Account");
		lblAddNewAccount.setForeground(Color.BLUE);
		lblAddNewAccount.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 25));
		lblAddNewAccount.setBounds(648, 106, 324, 53);
		frame.getContentPane().add(lblAddNewAccount);
		
		textField = new JTextField();
		textField.setBounds(796, 220, 192, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(796, 285, 192, 35);
		frame.getContentPane().add(textField_1);
		
		JRadioButton btnStudent = new JRadioButton("Student");
		btnStudent.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnStudent.setBounds(796, 485, 109, 23);
		frame.getContentPane().add(btnStudent);
		
		JRadioButton btnProfessor = new JRadioButton("Professor");
		btnProfessor.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnProfessor.setBounds(907, 485, 109, 23);
		frame.getContentPane().add(btnProfessor);
		
		ButtonGroup group = new ButtonGroup();
		group.add(btnStudent);
		group.add(btnProfessor);
		
		JLabel lblEnterYourAlgonquin = new JLabel("Enter your Algonquin Email");
		lblEnterYourAlgonquin.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEnterYourAlgonquin.setBounds(461, 220, 230, 35);
		frame.getContentPane().add(lblEnterYourAlgonquin);
		
		JLabel lblEnterYourUser = new JLabel("Enter your username");
		lblEnterYourUser.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEnterYourUser.setBounds(461, 285, 230, 35);
		frame.getContentPane().add(lblEnterYourUser);
		
		JLabel lblEnterYourPassword = new JLabel("Enter your password");
		lblEnterYourPassword.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEnterYourPassword.setBounds(461, 343, 230, 35);
		frame.getContentPane().add(lblEnterYourPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm password");
		lblConfirmPassword.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblConfirmPassword.setBounds(461, 397, 230, 35);
		frame.getContentPane().add(lblConfirmPassword);
		
		JLabel lblSelectUserLevel = new JLabel("Select user level");
		lblSelectUserLevel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblSelectUserLevel.setBounds(461, 479, 230, 35);
		frame.getContentPane().add(lblSelectUserLevel);
		
		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CourseList open =new CourseList();
				open.main(null);
				frame.dispose();
				
			}
		});
		btnNext.setBounds(725, 599, 103, 43);
		frame.getContentPane().add(btnNext);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(796, 343, 192, 43);
		frame.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(796, 408, 192, 35);
		frame.getContentPane().add(passwordField_1);
		
		JButton btnExit = new JButton("Back to login page");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login open = new Login();
				open.main(null);
				frame.dispose();
			
				
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnExit.setBounds(1036, 698, 192, 53);
		frame.getContentPane().add(btnExit);
	}
}
