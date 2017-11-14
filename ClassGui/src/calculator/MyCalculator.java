package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class MyCalculator extends JFrame{
	private JTextField txtFirst;
	private JTextField txtSecond;
	private JLabel lblResult;
	
	public MyCalculator(){
		super("My Calculator");
		setSize(350, 250);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(800, 600); //set location to start at
		setLayout(null);
		initComponents();
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyCalculator();
	}
	
	private void initComponents(){
		JLabel lblFirst = new JLabel("First");
		JLabel lblSecond = new JLabel("Second");
		JLabel lblResultHeading = new JLabel("Result");
		
		txtFirst = new JTextField();
		txtSecond = new JTextField();
		JLabel lblPlus= new JLabel("+");
		JLabel lblEqual = new JLabel("=");
		JButton btnCalculate = new JButton("Calculate");
		lblResult = new JLabel();
		
		lblFirst.setBounds(50, 10, 80, 40);
		lblSecond.setBounds(150, 10, 80, 40);
		lblResultHeading.setBounds(220, 10, 80, 40);
		txtFirst.setBounds(20, 45, 50, 40);
		lblPlus.setBounds(90, 55, 20, 20);
		txtSecond.setBounds(120,45,50, 40);
		lblEqual.setBounds(190,55,20,20);
		lblResult.setBounds(220, 45, 80, 40);
		lblResult.setBorder(new BevelBorder(BevelBorder.LOWERED));
		btnCalculate.setBounds(190, 130, 120, 30);
		
		
		add(lblFirst);
		add(lblSecond);
		add(lblResultHeading);
		add(txtFirst);
		add(txtSecond);
		add(lblPlus);
		add(lblEqual);
		add(btnCalculate);
		add(lblResult);
		
		btnCalculate.addKeyListener(new KeyListener() {
			
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER){
					btnCalculate.doClick();
				}
				
			}
		});
		
		btnCalculate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				calculateButtonPressed(e);
				
			}
		});
	}
		private void calculateButtonPressed(ActionEvent e){
			try{
			int num1 = Integer.parseInt(txtFirst.getText());
			try{
			int num2 = Integer.parseInt(txtSecond.getText());
			int result = num1+num2;
			
			lblResult.setText(Integer.toString(result));
			} catch(NumberFormatException z){
				txtSecond.requestFocus();
				txtSecond.selectAll();
			}
			} catch(NumberFormatException f){
				txtFirst.requestFocus();
				txtFirst.selectAll();
			}
		}
	
	}



