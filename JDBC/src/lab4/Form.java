package lab4;
import java.awt.EventQueue;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // Execute a query
            Statement statement = connection.createStatement();
            String sql = "SELECT id, name FROM Student";
            ResultSet resultSet = statement.executeQuery(sql);

            // Extract data from result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                // Display values
                System.out.print("ID: " + id);
                System.out.print(", Name: " + name);
                System.out.println(", Age: " + age);
            }

            // Clean-up environment
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
	}

	/**
	 * Create the frame.
	 */
	public Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student_ID");
		lblNewLabel.setBounds(10, 11, 93, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Student_ID");
		lblNewLabel_1.setBounds(10, 11, 93, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblFname = new JLabel("Fname");
		lblFname.setBounds(10, 35, 93, 14);
		contentPane.add(lblFname);
		
		JLabel lblLname = new JLabel("Lname");
		lblLname.setBounds(10, 62, 93, 14);
		contentPane.add(lblLname);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(10, 92, 93, 14);
		contentPane.add(lblAddress);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setBounds(10, 118, 93, 14);
		contentPane.add(lblDob);
		
		JLabel lblFacultyid = new JLabel("Faculty_ID");
		lblFacultyid.setBounds(10, 147, 93, 14);
		contentPane.add(lblFacultyid);
		
		textField = new JTextField();
		textField.setBounds(77, 8, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(77, 36, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(77, 59, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(77, 89, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(77, 115, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(77, 144, 86, 20);
		contentPane.add(textField_5);
	}
}
