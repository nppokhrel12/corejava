package builder.Login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Form");
		lblNewLabel.setBounds(160, 28, 63, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("uname");
		lblNewLabel_1.setBounds(60, 103, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("pw");
		lblNewLabel_2.setBounds(60, 128, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		username = new JTextField();
		username.setBounds(138, 100, 86, 20);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setBounds(137, 125, 86, 20);
		contentPane.add(password);
		password.setColumns(10);
		
		JButton login = new JButton("login");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String un=username.getText();
				String psw=password.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
					
					String sql="select * from nameaddress where name='"+un+"' and address='"+psw+"'";
					Statement stm=con.createStatement();
					ResultSet rs=stm.executeQuery(sql);
					
						if(rs.next()) {
							JOptionPane.showMessageDialog(null,"login sucess !!");
							new FormLogin().setVisible(true);
							dispose();
						}
						else {
							
								JOptionPane.showMessageDialog(null,"login failed ");
						}
					
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		login.setBounds(84, 169, 89, 23);
		contentPane.add(login);
	}
}
