package DataLinkLayer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login_page {

	private JFrame frame ;
	private String verifieEmployee ;
	private JTextField username;
	private JLabel lblPassword;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_page window = new Login_page();
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
	public Login_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public JFrame getJframe()
	{
		return frame;
	}
	public void  SetverifieEmployee(String d) 
	{
		this.verifieEmployee=d;
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUserName = new JLabel("User name");
		lblUserName.setBounds(66, 61, 93, 14);
		frame.getContentPane().add(lblUserName);
		
		username = new JTextField();
		username.setBounds(157, 58, 191, 20);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		lblPassword = new JLabel("Password ");
		lblPassword.setBounds(66, 107, 75, 14);
		frame.getContentPane().add(lblPassword);
		
		password = new JPasswordField();
		password.setBounds(157, 104, 191, 20);
		frame.getContentPane().add(password);
		
		JButton loginbutton = new JButton("log in ");
		loginbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verifieEmployee=="Admin")
				{
					Admin_page p = new Admin_page();
					p.getJframe().setVisible(true);
					frame.setVisible(false);
				}
			}
		});
		loginbutton.setBounds(155, 159, 75, 23);
		frame.getContentPane().add(loginbutton);
		
		JButton resetbutton = new JButton("Reset");
		resetbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		resetbutton.setBounds(273, 159, 75, 23);
		frame.getContentPane().add(resetbutton);
	}
}
