package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;

public class my {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					my window = new my();
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
	public my() {
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
		
		textField = new JTextField();
		textField.setBounds(279, 42, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("jjjj");
		lblNewLabel.setBounds(83, 45, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(162, 145, 86, 20);
		textField_1.setColumns(10);
		frame.getContentPane().add(textField_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(246, 126, 119, 20);
		frame.getContentPane().add(passwordField);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBounds(162, 0, 68, 146);
		frame.getContentPane().add(verticalStrut);
		
		Component glue = Box.createGlue();
		glue.setBounds(173, 219, -11, -12);
		frame.getContentPane().add(glue);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(159, 185, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
