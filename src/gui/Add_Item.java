package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Add_Item extends JFrame {

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
					Add_Item frame = new Add_Item();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public Add_Item() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddNewItem = new JLabel("Add New Item");
		lblAddNewItem.setBounds(213, 38, 127, 14);
		contentPane.add(lblAddNewItem);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(128, 66, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(128, 91, 46, 14);
		contentPane.add(lblType);
		
		JLabel lblCategories = new JLabel("categories");
		lblCategories.setBounds(117, 122, 61, 14);
		contentPane.add(lblCategories);
		
		textField = new JTextField();
		textField.setBounds(213, 63, 114, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(213, 88, 114, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(213, 119, 114, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdd.setBounds(213, 150, 61, 23);
		contentPane.add(btnAdd);
		
		JButton btnNewButton = new JButton("exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirmed = JOptionPane.showConfirmDialog(null, "no more item to add?","EXIT",JOptionPane.YES_NO_OPTION);
		        if(confirmed == JOptionPane.YES_OPTION)
		        {
		            dispose();
		        }
			}
		});
		btnNewButton.setBounds(273, 150, 66, 23);
		contentPane.add(btnNewButton);
	}
}
