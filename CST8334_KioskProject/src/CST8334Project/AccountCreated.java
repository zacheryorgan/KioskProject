package CST8334Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AccountCreated {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountCreated window = new AccountCreated();
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
	public AccountCreated() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1625, 870);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Your account has been created");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(639, 390, 558, 82);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewl = new JLabel("Congratulations!");
		lblNewl.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 26));
		lblNewl.setBackground(SystemColor.textHighlight);
		lblNewl.setBounds(679, 287, 390, 62);
		frame.getContentPane().add(lblNewl);
		
		JButton btnBackToLogin = new JButton("Back to Login");
		btnBackToLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Login open = new Login();
				open.main(null);
				frame.dispose();
				
			}
		});
		btnBackToLogin.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnBackToLogin.setBounds(709, 518, 159, 52);
		frame.getContentPane().add(btnBackToLogin);
	}
}
