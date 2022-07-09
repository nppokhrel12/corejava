package builder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Example extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField address;
	private JTable table;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Example frame = new Example();
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
	public Example() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Input", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 546, 146);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel n = new JLabel("Name");
		n.setBounds(21, 32, 79, 24);
		panel.add(n);
		
		name = new JTextField();
		name.setBounds(110, 32, 86, 22);
		panel.add(name);
		name.setColumns(10);
		
		JLabel a = new JLabel("Address");
		a.setBounds(258, 37, 46, 14);
		panel.add(a);
		
		address = new JTextField();
		address.setBounds(310, 34, 86, 20);
		panel.add(address);
		address.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("City");
		lblNewLabel.setBounds(21, 67, 46, 14);
		panel.add(lblNewLabel);
		
		JComboBox city = new JComboBox();
		city.setModel(new DefaultComboBoxModel(new String[] {"select", "ktm", "bkt"}));
		city.setBounds(110, 65, 86, 22);
		panel.add(city);
		
		JLabel lblNewLabel_1 = new JLabel("Gender");
		lblNewLabel_1.setBounds(258, 67, 46, 14);
		panel.add(lblNewLabel_1);
		
		JRadioButton male = new JRadioButton("m");
		buttonGroup.add(male);
		male.setBounds(298, 63, 46, 23);
		panel.add(male);
		
		JRadioButton female = new JRadioButton("f");
		buttonGroup.add(female);
		female.setBounds(346, 63, 46, 23);
		panel.add(female);
		
		JCheckBox agree = new JCheckBox("agree");
		agree.setBounds(21, 100, 97, 23);
		panel.add(agree);
		
		JButton save = new JButton("save");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=name.getText();
				String a=address.getText();
				String c=city.getName();
				String gender;
				if(male.isSelected()) {
					gender="male";
				}
				else {
					gender="female";
				}
				String acpt;
				if(agree.isSelected()) {
					acpt="yes";
				}
				else {
					acpt="no";
				}
				
				
			}
		});
		save.setBounds(146, 100, 89, 23);
		panel.add(save);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 166, 546, 286);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Address", "City", "Gender", "Agree"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton reset = new JButton("reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		reset.setBounds(467, 453, 89, 23);
		contentPane.add(reset);
	}
}
