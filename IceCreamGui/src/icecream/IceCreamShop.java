package icecream;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.security.auth.callback.ChoiceCallback;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.nio.channels.ShutdownChannelGroupException;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;
import javax.swing.JButton;

public class IceCreamShop {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	BigDecimal total = new BigDecimal("0");
	BigDecimal basePrice = new BigDecimal("0");
	BigDecimal extras = new BigDecimal("0"); 
	JLabel lblTotalDigit;
	JCheckBox chckFlake;
	JCheckBox chckSprinkles;
	JCheckBox chckSyrup;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IceCreamShop window = new IceCreamShop();
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
	public IceCreamShop() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void setBasePrice(double d){
		BigDecimal s = new BigDecimal(d);
		basePrice = basePrice.subtract(basePrice);
		basePrice = basePrice.add(s);
		BigDecimal twenty = new BigDecimal("0.20");
		
		
		setTotal();
		
	}
	
	public void disposeOfFrame(){
		
	}
	
	public void setExtras(String a){
		BigDecimal s = new BigDecimal(Double.parseDouble(a));
		basePrice=basePrice.add(s);
		setTotal();
	}
	
	public void removeExtras(String a){
		
		BigDecimal s = new BigDecimal(Double.parseDouble(a));
		basePrice = basePrice.subtract(s);
		setTotal();
	}
	
	public void setTotal(){
		String str = "";
		str = str.format("%.2f%n", basePrice);
		
		lblTotalDigit.setText(str);
	}
	private void initialize() {
		JRadioButton rbChoc;
		
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 561, 512);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblTotalDigit = new JLabel("");
		lblTotalDigit.setBounds(69, 399, 46, 14);
		frame.getContentPane().add(lblTotalDigit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(299, 256, 121, 105);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		rbChoc = new JRadioButton("Chocolate");
		buttonGroup_1.add(rbChoc);
		rbChoc.setBounds(6, 16, 109, 23);
		panel_1.add(rbChoc);
		rbChoc.setSelected(true);
		
		
		JRadioButton rbStraw = new JRadioButton("Strawberry");
		buttonGroup_1.add(rbStraw);
		rbStraw.setBounds(6, 49, 109, 23);
		panel_1.add(rbStraw);
		
		JRadioButton rbVanilla = new JRadioButton("Vanilla");
		buttonGroup_1.add(rbVanilla);
		rbVanilla.setBounds(6, 75, 109, 23);
		panel_1.add(rbVanilla);
		
		JRadioButton rbCone = new JRadioButton("Cone");
		rbCone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double doub = Double.parseDouble(buttonGroup.getSelection().getActionCommand());
				if(chckFlake.isSelected()){
					doub += 0.20;
				}
				if(chckSyrup.isSelected()){
					doub += 0.20;
				}
				if(chckSprinkles.isSelected()){
					doub += 0.20;
				}
				rbChoc.setSelected(true);;
				rbStraw.setEnabled(true);
				rbChoc.setEnabled(true);
				rbVanilla.setEnabled(true);
				setBasePrice(doub);
			}
		});
	
		
		
		buttonGroup.add(rbCone);
		rbCone.setBounds(6, 189, 109, 23);
		frame.getContentPane().add(rbCone);
		rbCone.setSelected(true);
		rbCone.setActionCommand("1.50");		
		
		JRadioButton rbSundae = new JRadioButton("Sundae");
		rbSundae.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double doub = Double.parseDouble(buttonGroup.getSelection().getActionCommand());
				if(chckFlake.isSelected()){
					doub += 0.20;
				}
				if(chckSyrup.isSelected()){
					doub += 0.20;
				}
				if(chckSprinkles.isSelected()){
					doub += 0.20;
				}
				rbVanilla.setSelected(true);
				rbStraw.setEnabled(true);
				rbChoc.setEnabled(true);
				rbVanilla.setEnabled(true);
				setBasePrice(doub);
			}
		});
		
		buttonGroup.add(rbSundae);
		rbSundae.setBounds(201, 189, 109, 23);
		frame.getContentPane().add(rbSundae);
		rbSundae.setActionCommand("1.90");
		double doub = Double.parseDouble(buttonGroup.getSelection().getActionCommand());
		setBasePrice(doub);
		
		
		JRadioButton rbSplit = new JRadioButton("Banana Split");
		rbSplit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double doub = Double.parseDouble(buttonGroup.getSelection().getActionCommand());
				if(chckFlake.isSelected()){
					doub += 0.20;
				}
				if(chckSyrup.isSelected()){
					doub += 0.20;
				}
				if(chckSprinkles.isSelected()){
					doub += 0.20;
				}
				JOptionPane.showMessageDialog(null, "Your Banana Split comes with strawberry, vanilla and chocolate ice cream");
				rbStraw.setEnabled(false);
				rbChoc.setEnabled(false);
				rbVanilla.setEnabled(false);
				setBasePrice(doub);

			}
		});
	
		buttonGroup.add(rbSplit);
		rbSplit.setBounds(376, 189, 109, 23);
		frame.getContentPane().add(rbSplit);
		rbSplit.setActionCommand("2.50");
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(21, 263, 93, 98);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 16, 81, 75);
		panel_2.add(panel);
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, null));
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		
		
		
		chckFlake = new JCheckBox("Flake");
		chckFlake.setBounds(0, 0, 81, 23);
		panel.add(chckFlake);
		chckFlake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckFlake.isSelected()){
					setExtras(chckFlake.getActionCommand());
				} else if(!chckFlake.isSelected()){
					removeExtras(chckFlake.getActionCommand());
				}
			}
		});
		chckFlake.setActionCommand("0.20");
		
		chckSprinkles = new JCheckBox("Sprinkles");
		chckSprinkles.setBounds(0, 26, 81, 23);
		panel.add(chckSprinkles);
		chckSprinkles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckSprinkles.isSelected()){
					setExtras(chckSprinkles.getActionCommand());
				} else if(!chckSprinkles.isSelected()){
					removeExtras(chckSprinkles.getActionCommand());
				}
			}
		});
		chckSprinkles.setActionCommand("0.20");
		
		chckSyrup = new JCheckBox("Syrup");
		chckSyrup.setBounds(0, 52, 81, 23);
		panel.add(chckSyrup);
		chckSyrup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckSyrup.isSelected()){
					setExtras(chckSyrup.getActionCommand());
				} else if(!chckSyrup.isSelected()){
					removeExtras(chckSyrup.getActionCommand());
				}
			}
		});
		chckSyrup.setActionCommand("0.20");
		
		JLabel label = new JLabel("€0.20");
		label.setBounds(120, 309, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("€0.20");
		label_1.setBounds(120, 283, 46, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("€0.20");
		label_2.setBounds(120, 335, 46, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rbCone.doClick();
			}
		});
		label_3.setIcon(new ImageIcon(IceCreamShop.class.getResource("/icecream/cone.png")));
		label_3.setBounds(10, 54, 128, 128);
		frame.getContentPane().add(label_3);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rbSundae.doClick();
			}
		});
		lblNewLabel.setIcon(new ImageIcon(IceCreamShop.class.getResource("/icecream/sundae.jpg")));
		lblNewLabel.setBounds(188, 54, 128, 128);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rbSplit.doClick();
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(IceCreamShop.class.getResource("/icecream/bananasplit.jpg")));
		lblNewLabel_1.setBounds(372, 54, 128, 128);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel label_4 = new JLabel("€1.50");
		label_4.setBounds(46, 25, 46, 14);
		frame.getContentPane().add(label_4);
		
		JLabel lblNewLabel_2 = new JLabel("€1.90");
		lblNewLabel_2.setBounds(216, 25, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel label_5 = new JLabel("€2.50");
		label_5.setBounds(412, 25, 46, 14);
		frame.getContentPane().add(label_5);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(10, 399, 46, 14);
		frame.getContentPane().add(lblTotal);
		
		JLabel lblNewLabel_3 = new JLabel("Flavours");
		lblNewLabel_3.setBounds(332, 237, 70, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnPlaceorder = new JButton("PlaceOrder");
		btnPlaceorder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = "";
				String flavaFlav = "";
				String toppings = "";
				ArrayList list = new ArrayList();
				list.add(rbSundae);
				list.add(rbCone);
				list.add(rbSplit);
				
				if(chckFlake.isSelected()){
					toppings += "a Flake";
				}
				if(chckSprinkles.isSelected() && chckFlake.isSelected()){
					toppings += " and Sprinkles";
				} else if(chckSprinkles.isSelected()){
					toppings += " Sprinkles";
				}
				if(chckSyrup.isSelected() && (chckSprinkles.isSelected() || chckFlake.isSelected())){
					toppings+= " and Syrup";
				} else if(chckSyrup.isSelected()){
					toppings += "Syrup";
				}
				
				for (Object object : list) {
						JRadioButton jr = (JRadioButton)object;
						if(jr.isSelected()){
							str = jr.getText();
						}
				}
				ArrayList arr = new ArrayList();
				arr.add(rbVanilla);
				arr.add(rbStraw);
				arr.add(rbChoc);
				
				for (Object object : arr) {
					JRadioButton br = (JRadioButton)object;
					if(br.isSelected()){
						if(rbSplit.isSelected()){
						flavaFlav = "Strawberry, Vanilla and Chocolate";
					} else {
						flavaFlav = br.getText();
					}
					}
					
					
				}
				String total = "";
				total = total.format("%.2f", basePrice);
				int optionType = JOptionPane.OK_OPTION;
				int i = JOptionPane.showConfirmDialog(null, "You ordered a " + str + " with  " 
									+ flavaFlav + " ice cream with " + toppings + ".\nPlease pay €" + total + " at the till.", "Purchase Confirmation", optionType);
				if(i == JOptionPane.OK_OPTION){
					IceCreamShop.this.frame.dispose();
					IceCreamShop window = new IceCreamShop();
					window.frame.setVisible(true);
					IceCreamShop.this.frame.dispose();
					
				}
				
			}
		});
		btnPlaceorder.setBounds(252, 395, 89, 23);
		frame.getContentPane().add(btnPlaceorder);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		btnExit.setBounds(394, 395, 89, 23);
		frame.getContentPane().add(btnExit);
		
	
		
		
		
	}
}
