import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ABLogin {
	JTextField tf1;
	JPasswordField tf2;
	JLabel l1,l2,l3;
	JButton b1;
	JDialog d;
	Connection conn=null;
	Statement stmt = null;
	ABLogin()throws ClassNotFoundException, SQLException {
		d=new JDialog();
		d.setTitle("Login");
		d.setSize(400,500);
		d.setLayout(null);
		d.setLocation(200, 200);
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost/om", "root", "om");
		
		stmt=conn.createStatement();
		Font f1=new Font("Lucida Handwriting",Font.ITALIC,18);
		l3=new JLabel("Wellcome");
		l3.setBounds(0, 0, 0, 0);
		l3.setFont(f1);
		d.add(l3);
		
		l1=new JLabel("User Name");
		l1.setBounds(50, 10, 0, 0);
		d.add(l1);
		
		tf1=new JTextField();
		tf1.setBounds(0, 0, 0, 0);
		d.add(tf1);
		
		l2=new JLabel("Paddword");
		l2.setBounds(0, 0, 0, 0);
		d.add(l2);
		
		tf2=new JPasswordField();
		tf2.setBounds(0, 0, 0, 0);
		d.add(tf2);
	}
	
}
