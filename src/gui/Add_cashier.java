package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Add_cashier extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_cashier frame = new Add_cashier();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} /*

	/**
	 * Create the frame.
	 */
	public Add_cashier() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddingENew = new JLabel("Adding a New Cashier to The Super Market");
		lblAddingENew.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		lblAddingENew.setBounds(89, 43, 226, 14);
		contentPane.add(lblAddingENew);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(88, 78, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(88, 103, 46, 14);
		contentPane.add(lblLogin);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(89, 128, 80, 14);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(189, 68, 158, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(189, 100, 158, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(189, 125, 158, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(161, 171, 80, 23);
		contentPane.add(btnAdd);
		
		JButton btnNewButton = new JButton("exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirmed = JOptionPane.showConfirmDialog(null,"Are you sure to want to exit ","EXIT",JOptionPane.YES_NO_OPTION);
		        if(confirmed == JOptionPane.YES_OPTION)
		        {
		            dispose();
		        }
			}
		});
		btnNewButton.setBounds(252, 171, 66, 23);
		contentPane.add(btnNewButton);
	}

}
