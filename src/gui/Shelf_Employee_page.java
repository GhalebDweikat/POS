package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Shelf_Employee_page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shelf_Employee_page frame = new Shelf_Employee_page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} */

	/**
	 * Create the frame.
	 */
	public Shelf_Employee_page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnItem = new JMenu("Item");
		menuBar.add(mnItem);
		
		JMenuItem mntmReplenishWarehouse = new JMenuItem("Replenish shelf");
		mnItem.add(mntmReplenishWarehouse);
		
		JMenuItem mntmRequestItem = new JMenuItem("Request Item");
		mnItem.add(mntmRequestItem);
		
		JMenu mnLogOut = new JMenu("Log out");
		menuBar.add(mnLogOut);
		
		JMenuItem mntmExit = new JMenuItem("exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Home h=new Home();
				h.getJFrame().setVisible(true);
			}
		});
		mnLogOut.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	public JFrame getJframe()
	{
		return this;
	}
	
}
