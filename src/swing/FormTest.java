package swing;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class FormTest {
	public static void main(String[] args) {
		JFrame form=new JFrame();
		form.setSize(800,600);
		form.setLayout(null);
		form.setTitle("TestForm");
		//label
		
		JLabel email=new JLabel("email");
		email.setBounds(22, 22, 100, 20);
		form.add(email);
		
		JLabel password =new JLabel("password");
		password.setBounds(22,50,100 , 20);
		form.add(password);
		
		JTextField emailt=new JTextField("dlgsdflng");
		emailt.setBounds(140, 22, 100, 20);
		form.add(emailt);
		
		JTextField passwordt =new JTextField();
		passwordt.setBounds(140,50,100 , 20);
		form.add(passwordt);
		
		JButton b=new JButton("login");
		b.setBounds(100, 80, 100, 20);
		form.add(b);
		
		form.setVisible(true);		
	}
}
