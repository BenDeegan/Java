package classes;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Fonts {
	String theFont = "";
	private JFrame frame;
	int fontSize = 18;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtFont;
	private JList listColour;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fonts window = new Fonts();
					window.frame.setVisible(true);  
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
//				try { 
//				  
//				} catch (Exception e) {
//				    e.printStackTrace();
//				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Fonts() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public void setFont(String font){
		theFont = font;
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 696, 417);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWords = new JLabel("The quick brown fox jumped over the lazy dog");
		
		
		lblWords.setFont(new Font("Iskoola Pota", Font.PLAIN, fontSize));
		lblWords.setHorizontalAlignment(SwingConstants.CENTER);
		lblWords.setBounds(20, 42, 637, 67);
		frame.getContentPane().add(lblWords);
		
		DefaultListModel fontz = new DefaultListModel();
		fontz.addElement("Times New Roman");
		fontz.addElement("Comic Sans MS");
		fontz.addElement("Arial");
		fontz.addElement("Algerian");
		fontz.addElement("Simplified Arabic");
		fontz.addElement("Ravie");
		
		
		JList list = new JList(fontz);
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				String font = list.getSelectedValue().toString();
				setFont(font);
				lblWords.setFont(new Font(list.getSelectedValue().toString(), Font.PLAIN,fontSize));
			}
		});
		
		list.setBounds(51, 154, 121, 199);
		frame.getContentPane().add(list);
		
		JRadioButton rbBold = new JRadioButton("Bold");
		rbBold.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblWords.setFont(new Font(theFont, Font.BOLD,fontSize));
				rbBold.setSelected(false);
			}
		});
		buttonGroup.add(rbBold);
		rbBold.setBounds(275, 151, 109, 23);
		frame.getContentPane().add(rbBold);
		
		JRadioButton rbItalic = new JRadioButton("Italic");
		rbItalic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblWords.setFont(new Font(theFont, Font.ITALIC,fontSize));
				rbItalic.setSelected(false);
				
			}
		});
		buttonGroup.add(rbItalic);
		rbItalic.setBounds(275, 177, 109, 23);
		frame.getContentPane().add(rbItalic);
		
		txtFont = new JTextField();
		txtFont.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				txtFont.setText("");
			}
		});
		txtFont.setText("Desired Font Size");
		txtFont.setForeground(Color.LIGHT_GRAY);
		txtFont.setBounds(479, 152, 123, 20);
		frame.getContentPane().add(txtFont);
		txtFont.setColumns(10);
		
		JButton btnChangeFont = new JButton("Change Font");
		btnChangeFont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fontSize = Integer.parseInt(txtFont.getText());
				if(rbItalic.isSelected()){
					lblWords.setFont(new Font(theFont, Font.ITALIC, fontSize));
				} else {
					lblWords.setFont(new Font(theFont, Font.BOLD, fontSize));
					
				}
				
			}
		});
		btnChangeFont.setBounds(476, 201, 126, 23);
		frame.getContentPane().add(btnChangeFont);
		
		DefaultListModel colours = new DefaultListModel();
		colours.addElement("Red");
		colours.addElement("Blue");
		colours.addElement("Green");
		
		listColour = new JList(colours);
		listColour.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				if(listColour.getSelectedIndex() == 0){
					lblWords.setForeground(Color.RED);
				}
				if(listColour.getSelectedIndex() == 1){
					lblWords.setForeground(Color.BLUE);
				}
				if(listColour.getSelectedIndex() == 2){
					lblWords.setForeground(Color.GREEN);
				}
			}
		});
		listColour.setBounds(264, 235, 109, 114);
		frame.getContentPane().add(listColour);
		
		
		
		
	}
}
