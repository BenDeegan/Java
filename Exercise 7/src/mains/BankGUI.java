package mains;

import java.awt.EventQueue;
import java.awt.List;

import classes.BankAcc;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import java.awt.TextArea;
import java.awt.Color;
import java.awt.SystemColor;

public class BankGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private boolean isMade = false;
	private JTextField AccDetails;

	private JTextField textFieldDep;
	JButton btnSubmit;
	JButton btnGetDetails;
	JButton btnDeposit;
	JButton btnWithdraw;
	JButton btnWithdrawAll;
	private JTextField accNumTXT;
	private JButton btnNext;
	private boolean isNext = true;
	int i;
	private JButton btnExit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BankGUI window = new BankGUI();
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
	public BankGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.controlShadow);
		frame.setBounds(100, 100, 742, 542);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnCreateAccount = new JButton("Create Account");

		ArrayList<BankAcc> accounts = new ArrayList<BankAcc>();
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accounts.add(new BankAcc());
				isMade = true;
				if (isMade == true && !textField.getText().isEmpty() && !textField_1.getText().isEmpty()) {
					btnSubmit.setVisible(true);

				}

			}
		});
		btnCreateAccount.setBounds(21, 11, 121, 23);
		frame.getContentPane().add(btnCreateAccount);

		textField = new JTextField();
		textField.setBounds(77, 62, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(77, 93, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(21, 65, 46, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Address");
		lblNewLabel_1.setBounds(10, 96, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);

		btnSubmit = new JButton("submit");
		btnSubmit.setVisible(false);
		btnSubmit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (isMade = true) {
					accounts.get(0).setName(textField.getText());
					accounts.get(0).setAddress(textField_1.getText());
					// b1.setAddress(textField_1.getText());
					JOptionPane.showMessageDialog(null,
							"Name : " + accounts.get(0).getName() + "Address : " + accounts.get(0).getAddress());
					btnGetDetails.setVisible(true);
				}

			}
		});
		btnSubmit.setBounds(37, 124, 86, 23);
		frame.getContentPane().add(btnSubmit);

		btnGetDetails = new JButton("Get Details");
		btnGetDetails.setVisible(false);
		btnGetDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < accounts.size(); i++) {
					if (accounts.get(i).getAccNum() == Integer.parseInt(accNumTXT.getText())) {
						AccDetails.setText(accounts.get(i).toString());
						// System.out.println(accounts.get(i).toString());
					}

				}

			}
		});
		btnGetDetails.setBounds(261, 124, 89, 23);
		frame.getContentPane().add(btnGetDetails);

		AccDetails = new JTextField();
		AccDetails.setBounds(32, 399, 667, 93);
		frame.getContentPane().add(AccDetails);
		AccDetails.setColumns(10);

		textFieldDep = new JTextField();
		textFieldDep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textFieldDep != null) {
					btnDeposit.setVisible(true);
					btnWithdraw.setVisible(true);
					btnWithdrawAll.setVisible(true);
				}
			}
		});
		textFieldDep.setBounds(434, 62, 170, 20);
		frame.getContentPane().add(textFieldDep);
		textFieldDep.setColumns(10);

		btnDeposit = new JButton("Deposit");
		btnDeposit.setVisible(false);
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < accounts.size(); i++) {
					if (accounts.get(i).getAccNum() == Integer.parseInt(accNumTXT.getText())) {
						accounts.get(i).deposit(Double.parseDouble(textFieldDep.getText()));
					}
				}

			}
		});
		btnDeposit.setBounds(434, 92, 89, 23);
		frame.getContentPane().add(btnDeposit);

		btnWithdraw = new JButton("Withdraw");
		btnWithdraw.setVisible(false);
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < accounts.size(); i++) {
					if (accounts.get(i).getAccNum() == Integer.parseInt(accNumTXT.getText())) {
						accounts.get(i).withdraw(Double.parseDouble(textFieldDep.getText()));
					}

				}

			}
		});
		btnWithdraw.setBounds(533, 92, 89, 23);
		frame.getContentPane().add(btnWithdraw);

		btnWithdrawAll = new JButton("Withdraw all");
		btnWithdrawAll.setVisible(false);
		btnWithdrawAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < accounts.size(); i++) {
					if (accounts.get(i).getAccNum() == Integer.parseInt(accNumTXT.getText())) {
						accounts.get(i).withdrawAll();
					}
				}
			}
		});
		btnWithdrawAll.setBounds(434, 124, 188, 23);
		frame.getContentPane().add(btnWithdrawAll);

		accNumTXT = new JTextField();
		accNumTXT.setBounds(261, 93, 89, 20);
		frame.getContentPane().add(accNumTXT);
		accNumTXT.setColumns(10);

		JLabel lblAccNum = new JLabel("Account Number");
		lblAccNum.setBounds(261, 65, 89, 14);
		frame.getContentPane().add(lblAccNum);

		JButton btnGetAll = new JButton("Get All Accounts");
		btnGetAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				i = 0;

				// if(isNext == true && i <= max){
				// AccDetails.set
				AccDetails.setText(accounts.get(i).toString());
				// i++;
				// System.out.println(i);
				// }

			}
		});
		btnGetAll.setBounds(247, 343, 177, 23);
		frame.getContentPane().add(btnGetAll);

		btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				int max = accounts.size();
				if (i == 0) {
					AccDetails.setText(accounts.get(i).toString());
					//i++;

				} else if (i < max) {

					AccDetails.setText(accounts.get(i).toString());
					//i++;
					System.out.println(i + " in next");
				}

				if (i > max) {
					System.out.println("error");
				}

			}
		});
		btnNext.setBounds(498, 343, 89, 23);
		frame.getContentPane().add(btnNext);

		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(i + "in prev");
				int max = accounts.size();
				if (i == max) {
					i--;

				}

				if (i > 0) {
					i--;
					AccDetails.setText(accounts.get(i).toString());

				}
			}
		});
		btnPrevious.setBounds(37, 343, 89, 23);
		frame.getContentPane().add(btnPrevious);

		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(627, 11, 89, 23);
		frame.getContentPane().add(btnExit);
	}
}
