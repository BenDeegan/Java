package classes;

import java.awt.Choice;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Car {
	Choice modelChoice;

	private JFrame frame;
	private JTextField textField;

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
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		frame.setBounds(100, 100, 819, 588);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		final DefaultListModel listMake = new DefaultListModel();
		listMake.addElement("Ford");
		listMake.addElement("Fiat");
		listMake.addElement("BMW");
		listMake.addElement("Nissan");
		
		
		JList list = new JList(listMake);
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(list.getSelectedValue().equals("Ford")){
					modelChoice.removeAll();
			    	modelChoice.add("Focus");
			    	modelChoice.add("Fiesta");
			    }
			    if(list.getSelectedValue().equals("Fiat")){
			    	modelChoice.removeAll();
			    	modelChoice.add("Punto");
			    	modelChoice.add("Panda");
			    }
			    if(list.getSelectedValue().equals("BMW")){
			    	modelChoice.removeAll();
			    	modelChoice.add("3 Series");
			    	modelChoice.add("4 Series");
			    }
			    if(list.getSelectedValue().equals("Nissan")){
			    	modelChoice.removeAll();
			    	modelChoice.add("Micra");
			    	modelChoice.add("Almera");
			    }
				
			}
		});
		list.setBounds(30, 165, 88, 139);
		frame.getContentPane().add(list);
		
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    list.setSelectedIndex(0);
	    list.setVisibleRowCount(4);  
	    list.getSelectedValue();
	    
	    
	    modelChoice = new Choice();
	    modelChoice.setBounds(149, 165, 109, 20);
	    frame.getContentPane().add(modelChoice);
	    
	    JRadioButton anyBTN = new JRadioButton("Any");
	    anyBTN.setHorizontalAlignment(SwingConstants.LEFT);
	    anyBTN.setBounds(149, 239, 127, 23);
	    frame.getContentPane().add(anyBTN);
	    anyBTN.setSelected(true);
	    anyBTN.setActionCommand("Any");
	    
	    JRadioButton manualBTN = new JRadioButton("Manual");
	    manualBTN.setHorizontalAlignment(SwingConstants.LEFT);
	    manualBTN.setBounds(149, 265, 127, 23);
	    frame.getContentPane().add(manualBTN);
	    manualBTN.setActionCommand("Manual");
	    
	    JRadioButton autoBTN = new JRadioButton("Automatic");
	    autoBTN.setBounds(149, 294, 127, 23);
	    frame.getContentPane().add(autoBTN);
	    autoBTN.setActionCommand("Automatic");
	    
	    JLabel btnTransmission = new JLabel("Transmission");
	    btnTransmission.setBounds(149, 199, 127, 23);
	    frame.getContentPane().add(btnTransmission);
	    modelChoice.add("Focus");
	    modelChoice.add("Fiesta");
	    
	    ButtonGroup group = new ButtonGroup();
	    group.add(anyBTN);
	    group.add(manualBTN);
	    group.add(autoBTN);
	    
	    
	    JLabel lblMake = new JLabel("MAKE");
	    lblMake.setHorizontalAlignment(SwingConstants.CENTER);
	    lblMake.setBounds(30, 140, 46, 14);
	    frame.getContentPane().add(lblMake);
	    
	    JLabel lblNewLabel = new JLabel("MODEL");
	    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel.setBounds(149, 140, 46, 14);
	    frame.getContentPane().add(lblNewLabel);
	    
	    final DefaultListModel colours = new DefaultListModel();
	    colours.addElement("Red");
	    colours.addElement("Blue");
	    colours.addElement("Black");
	    colours.addElement("Green");
	    colours.addElement("Silver");
	    colours.addElement("White");
	    
	    JList listColour = new JList(colours);
	    listColour.setBounds(315, 165, 88, 139);
	    frame.getContentPane().add(listColour);
	    listColour.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    listColour.setSelectedIndex(0);
	    listColour.setVisibleRowCount(6);  
	    
	    JLabel lblNewLabel_1 = new JLabel("COLOUR");
	    lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
	    lblNewLabel_1.setBounds(315, 140, 88, 14);
	    frame.getContentPane().add(lblNewLabel_1);
	    
	    JLabel lblFuelType = new JLabel("FUEL TYPE");
	    lblFuelType.setBounds(446, 140, 63, 14);
	    frame.getContentPane().add(lblFuelType);
	    
	    JRadioButton fuelAny = new JRadioButton("Any");
	    fuelAny.setBounds(433, 162, 109, 23);
	    frame.getContentPane().add(fuelAny);
	    fuelAny.setSelected(true);
	    fuelAny.setActionCommand("Any");
	    
	    JRadioButton fuelPet = new JRadioButton("Petrol");
	    fuelPet.setBounds(433, 188, 109, 23);
	    frame.getContentPane().add(fuelPet);
	    fuelPet.setActionCommand("Petrol");
	    
	    JRadioButton fuelDie = new JRadioButton("Diesel");
	    fuelDie.setBounds(433, 214, 109, 23);
	    frame.getContentPane().add(fuelDie);
	    fuelDie.setActionCommand("Diesel");
	    
	    JRadioButton fuelHyb = new JRadioButton("Hybrid");
	    fuelHyb.setBounds(433, 239, 109, 23);
	    frame.getContentPane().add(fuelHyb);
	    fuelHyb.setActionCommand("Hybrid");
	    
	    JRadioButton fuelBio = new JRadioButton("Bioethanol");
	    fuelBio.setBounds(433, 265, 109, 23);
	    frame.getContentPane().add(fuelBio);
	    fuelBio.setActionCommand("Bioethanol");
	    
	    JLabel lblNewLabel_2 = new JLabel("NUMBER OF SEATS");
	    lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_2.setBounds(606, 140, 137, 14);
	    frame.getContentPane().add(lblNewLabel_2);
	    
	    JRadioButton seat2 = new JRadioButton("2");
	    seat2.setBounds(606, 162, 109, 23);
	    frame.getContentPane().add(seat2);
	    seat2.setSelected(true);
	    seat2.setActionCommand("2");
	    
	    JRadioButton seat4 = new JRadioButton("4");
	    seat4.setBounds(606, 188, 109, 23);
	    frame.getContentPane().add(seat4);
	    seat4.setActionCommand("4");
	    
	    JRadioButton seat5 = new JRadioButton("5");
	    seat5.setBounds(606, 214, 109, 23);
	    frame.getContentPane().add(seat5);
	    seat5.setActionCommand("5");
	    
	    JRadioButton seat7 = new JRadioButton("7");
	    seat7.setBounds(606, 239, 109, 23);
	    frame.getContentPane().add(seat7);
	    seat7.setActionCommand("7");
	    
	    JRadioButton seat8 = new JRadioButton("8");
	    seat8.setBounds(606, 265, 109, 23);
	    frame.getContentPane().add(seat8);
	    seat8.setActionCommand("8");
	    
	    ButtonGroup fuelGr = new ButtonGroup();
	    fuelGr.add(fuelAny);
	    fuelGr.add(fuelPet);
	    fuelGr.add(fuelDie);
	    fuelGr.add(fuelHyb);
	    fuelGr.add(fuelBio);
	    
	    ButtonGroup seatGr = new ButtonGroup();
	    seatGr.add(seat2);
	    seatGr.add(seat4);
	    seatGr.add(seat5);
	    seatGr.add(seat7);
	    seatGr.add(seat8);
	    
	    textField = new JTextField();
	    textField.setBounds(30, 389, 591, 20);
	    frame.getContentPane().add(textField);
	    textField.setColumns(10);
	    
	    
	    JButton btnPlaceOrder = new JButton("Place Order");
	    btnPlaceOrder.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		String entered = fuelGr.getSelection().getActionCommand();
	    		String enteredSeat = seatGr.getSelection().getActionCommand();
	    		String enteredTrans = group.getSelection().getActionCommand();
	    		textField.setText("You have requested a " + listColour.getSelectedValue() +", " + entered +" fuel " + list.getSelectedValue() + " " 
	    							+ modelChoice.getSelectedItem() + " with " + enteredSeat + " seats and " + enteredTrans + " Transmission\n");
	    	}
	    });
	    btnPlaceOrder.setBounds(631, 388, 89, 23);
	    frame.getContentPane().add(btnPlaceOrder);
	    
	    JButton btnSaveOrder = new JButton("Save Order");
	    btnSaveOrder.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		try(FileWriter fw = new FileWriter(new File("src/classes/Storage.txt"), true); PrintWriter pw = new PrintWriter(fw)){
	    			pw.println(textField.getText());
	    		} catch(IOException E){
	    			E.printStackTrace();
	    		}
	    			
	    		
	    }
//	    		try{
//	    			PrintWriter pw = new PrintWriter("src/classes/Storage.txt");
//	    			String str = textField.getText();
//	    			
//	    			pw.println(str);
//	    			pw.flush();
//	    			pw.close();
//	    		} catch (Exception e) {
//	    			e.printStackTrace();;
//				}
//	    	}
    });
	    btnSaveOrder.setBounds(631, 426, 89, 23);
	    frame.getContentPane().add(btnSaveOrder);
	    
	    JButton btnLoadOrder = new JButton("Load Order");
	    btnLoadOrder.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		String str =null;
	    		try{
	    			FileReader fr = new FileReader("src/classes/Storage.txt");
	    			BufferedReader br = new BufferedReader(fr);
	    			while((str = br.readLine())!=null){
	    				textField.setText(str);
	    			}
	    			
	    	} catch (Exception e) {
	    		e.printStackTrace();
	    	}
			}
	    });
	    btnLoadOrder.setBounds(631, 460, 89, 23);
	    frame.getContentPane().add(btnLoadOrder);
	    
	    JButton btnReset = new JButton("Reset");
	    btnReset.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		fuelAny.setSelected(true);
	    		seat2.setSelected(true);
	    		list.setSelectedIndex(0);
	    		anyBTN.setSelected(true);
	    		listColour.setSelectedIndex(0);
	    		textField.setText("");
	    	}
	    });
	    btnReset.setBounds(631, 494, 89, 23);
	    frame.getContentPane().add(btnReset);
	    
	    JLabel lblNewLabel_3 = new JLabel("BOB'S CAR DEALERSHIP");
	    lblNewLabel_3.setFont(new Font("Simplified Arabic Fixed", Font.PLAIN, 37));
	    lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_3.setBounds(10, 11, 783, 118);
	    frame.getContentPane().add(lblNewLabel_3);
	    
	    JLabel lblNewLabel_4 = new JLabel("New label");
	    lblNewLabel_4.setIcon(new ImageIcon(Car.class.getResource("/classes/download (1).jpg")));
	    lblNewLabel_4.setBounds(65, 420, 497, 119);
	    frame.getContentPane().add(lblNewLabel_4);

	    
	    
	    
	    


	   
	    
	   
	}
}
