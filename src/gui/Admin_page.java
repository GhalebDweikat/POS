package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class Admin_page {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_page window = new Admin_page();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
	
	public JFrame getJframe()
	{
		return frame ;
	}

	/**
	 * Create the application.
	 */
	public Admin_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnAdd = new JMenu("Add ");
		menuBar.add(mnAdd);
		
		JMenuItem mntmItem = new JMenuItem("Item");
		mntmItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Add_Item j=new Add_Item();
				j.setVisible(true);
				 
				
			}
		});
		mnAdd.add(mntmItem);
		
		JMenuItem mntmShelfemployer = new JMenuItem("Shelf_employer");
		mntmShelfemployer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adding_ShelfEmployee j=new Adding_ShelfEmployee();
				j.setVisible(true);
			}
		});
		mnAdd.add(mntmShelfemployer);
		
		JMenuItem mntmBalance = new JMenuItem("Balance");
		mnAdd.add(mntmBalance);
		
		JMenuItem mntmCashier = new JMenuItem("cashier");
		mntmCashier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_cashier j=new Add_cashier();
				j.setVisible(true);
			}
		});
		mnAdd.add(mntmCashier);
		
		JMenu mnUpdate = new JMenu("Update");
		menuBar.add(mnUpdate);
		
		JMenuItem mntmShelfemployee = new JMenuItem("Shelf_Employee");
		mnUpdate.add(mntmShelfemployee);
		
		JMenuItem mntmItem_1 = new JMenuItem("Item");
		mnUpdate.add(mntmItem_1);
		
		JMenu mnLogOut = new JMenu("Log out");
		menuBar.add(mnLogOut);
		
		JMenuItem mntmQuit = new JMenuItem("Quit");
		mntmQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		mnLogOut.add(mntmQuit);
	}
}
