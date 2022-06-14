package builder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TableForm extends JFrame {

	private JPanel contentPane;
	private JTextField nametxt;
	private JTextField addresstxt;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableForm frame = new TableForm();
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
	public TableForm() {
		setTitle("table form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 987, 571);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "input panel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(36, 34, 896, 110);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("name");
		lblNewLabel.setBounds(41, 21, 46, 14);
		panel.add(lblNewLabel);
		
		nametxt = new JTextField();
		nametxt.setBounds(97, 18, 86, 20);
		panel.add(nametxt);
		nametxt.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Address");
		lblNewLabel_1.setBounds(210, 21, 75, 14);
		panel.add(lblNewLabel_1);
		
		addresstxt = new JTextField();
		addresstxt.setBounds(295, 18, 86, 20);
		panel.add(addresstxt);
		addresstxt.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("city");
		lblNewLabel_2.setBounds(445, 21, 46, 14);
		panel.add(lblNewLabel_2);
		
		JComboBox citycombo = new JComboBox();
		citycombo.setModel(new DefaultComboBoxModel(new String[] {"select", "kathmandu ", "pokhara ", "Nepalgunj ", "Dhangadi ", "Dipayal ", "Dharan ", "bhaktapur "}));
		citycombo.setBounds(490, 17, 98, 22);
		panel.add(citycombo);
		
		JLabel lblNewLabel_3 = new JLabel("gender");
		lblNewLabel_3.setBounds(41, 63, 46, 14);
		panel.add(lblNewLabel_3);
		
		JRadioButton malebtn = new JRadioButton("male");
		buttonGroup.add(malebtn);
		malebtn.setBounds(90, 59, 58, 23);
		panel.add(malebtn);
		
		JRadioButton femalebtn = new JRadioButton("female");
		buttonGroup.add(femalebtn);
		femalebtn.setBounds(163, 59, 66, 23);
		panel.add(femalebtn);
		
		JCheckBox agreebtn = new JCheckBox("Ageee");
		agreebtn.setBounds(261, 59, 97, 23);
		panel.add(agreebtn);
		
		JButton savebtn = new JButton("save");
		savebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//input data validation 
				if(nametxt.getText().isBlank()) {
					JOptionPane.showMessageDialog(nametxt, "name is req");
					return;
				}
				if(citycombo.getSelectedIndex()==0) {
					JOptionPane.showMessageDialog(citycombo, "city is req");
					return;
				}
				
				if(!malebtn.isSelected()&&!femalebtn.isSelected()) {
					JOptionPane.showMessageDialog(malebtn, "gender is required");
					return;
				}
				String name=nametxt.getText();
				String address =addresstxt.getText();
				String city=citycombo.getSelectedItem().toString();
				String gender ;
				if(malebtn.isSelected()) {
					gender="male";
				}
				else {
					gender="female";
				}
				String agree;
				if(agreebtn.isSelected()) {
					agree="true";
				}
				else {
					agree="fale";
				}
				//show data in table
				
				DefaultTableModel tmodel=(DefaultTableModel)table.getModel();
				tmodel.addRow(new Object[] {name,address,city,gender,agree});
				
				//clear ip panel 
				nametxt.setText("");
				addresstxt.setText("");
				citycombo.setSelectedIndex(0);
				buttonGroup.clearSelection();
				agreebtn.setSelected(false);
			
			}
		});
		savebtn.setBounds(445, 59, 89, 23);
		panel.add(savebtn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 178, 896, 318);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int srow =table.getSelectedRow();
				String nm=table.getModel().getValueAt(srow , 0).toString();
				String adr=table.getModel().getValueAt(srow , 1).toString();
				String city=table.getModel().getValueAt(srow , 2).toString();
				String gender=table.getModel().getValueAt(srow , 3).toString();
				String agr=table.getModel().getValueAt(srow , 4).toString();
				//set row value to input panel
				nametxt.setText(nm);
				addresstxt.setText(adr);
				citycombo.setSelectedItem(city);
				
				if(gender.equalsIgnoreCase("male") ) {
					malebtn.setSelected(true);
				}
				else {
					femalebtn.setSelected(true);
				}
				
				if(agr.equalsIgnoreCase("true")) {
					agreebtn.setSelected(true);
					
					
				}
				else {
					agreebtn.setSelected(false);
					
				}
			}
		});
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
				DefaultTableModel tmodel =(DefaultTableModel) table.getModel();
				tmodel.setRowCount(0);
			}
		});
		reset.setBounds(817, 498, 89, 23);
		contentPane.add(reset);
	}
}
