package classes;

import java.awt.Choice;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class Car {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Car window = new Car();
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
	public Car() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 751, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final DefaultListModel listMake = new DefaultListModel();
		listMake.addElement("Ford");
		listMake.addElement("Fiat");
		listMake.addElement("BMW");
		listMake.addElement("Nissan");
		
		
		JList list = new JList(listMake);
		list.setBounds(50, 199, 88, 139);
		frame.getContentPane().add(list);
		
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    list.setSelectedIndex(0);
	    list.setVisibleRowCount(4);  
	    
	    Choice modelChoice = new Choice();

	    modelChoice.add("Apple");
	    modelChoice.add("Grapes");
	    modelChoice.add("Mango");
	    modelChoice.add("Peer");
	    
	   
	}

}
