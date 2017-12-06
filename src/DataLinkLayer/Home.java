package DataLinkLayer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Home {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
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
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnConnxion = new JMenu("Connection");
		menuBar.add(mnConnxion);
		
		JMenuItem admin = new JMenuItem("Admin");
		admin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login_page l=new Login_page();
				l.SetverifieEmployee("Admin");
				frame.setVisible(false);
				l.getJframe().setVisible(true);
				
			}
		});
		mnConnxion.add(admin);
		
		JMenuItem shelfemployer = new JMenuItem("Shelf_employer");
		shelfemployer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ok shelf_employer");
			}
		});
		mnConnxion.add(shelfemployer);
		
		JMenuItem cashier = new JMenuItem("Cashier");
		cashier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("cashier");
			}
			
		});
		mnConnxion.add(cashier);
		
		JMenu mnListOfAll = new JMenu("List of All Item");
		menuBar.add(mnListOfAll);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAboutUs = new JMenuItem("About Us");
		mnHelp.add(mntmAboutUs);
		
		JMenu mnQuitt = new JMenu("Quit");
		menuBar.add(mnQuitt);
	}
}
