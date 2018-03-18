package CST8334Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Point;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Login {

	private JFrame frame;
	
	private JTextField username;
	private JPasswordField password;
	private JLabel lblLoginPage;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(SystemColor.info);
		frame.getContentPane().setBackground(SystemColor.menu);
		frame.setBounds(-16, -31, 1625, 875);
		
		
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		
		
		JLabel lblNewLabel = new JLabel("Enter User Name");
		lblNewLabel.setBounds(586, 264, 125, 45);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JLabel lblEnterPassword = new JLabel("Enter Password");
		lblEnterPassword.setBounds(586, 366, 125, 45);
		lblEnterPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		username = new JTextField();
		username.setBounds(828, 264, 209, 48);
		username.setForeground(Color.BLACK);
		username.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(828, 366, 209, 48);
		password.setForeground(Color.BLACK);
		password.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		lblLoginPage = new JLabel("Login Page");
		lblLoginPage.setBounds(711, 138, 141, 47);
		lblLoginPage.setFont(new Font("Times New Roman", Font.BOLD, 22));
		
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(640, 533, 89, 47);
		btnLogin.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				
				String user = username.getText();
				String pass = password.getText();								
			 
				
				
				if(user.equals("Admin") && pass.equals("admin")) {
					
					Administrator open = new Administrator();
					open.main(null);
					frame.dispose();
					
			}
				
			   
			}
		});
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 16));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblLoginPage);
		frame.getContentPane().add(lblNewLabel);
		frame.getContentPane().add(username);
		frame.getContentPane().add(lblEnterPassword);
		frame.getContentPane().add(password);
		frame.getContentPane().add(btnLogin);
		
		JButton btnCreateAnAccount = new JButton("Create an account");
		btnCreateAnAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SignUp open = new SignUp();
				open.main(null);
				frame.dispose();
				
			}
		});
		btnCreateAnAccount.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnCreateAnAccount.setBounds(863, 533, 162, 47);
		frame.getContentPane().add(btnCreateAnAccount);
		
		
		
	
		
	
		
	
	}
}
