package firstPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class Form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form frame = new Form();
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
	public Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(10, 10, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(66, 44, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setBounds(10, 47, 46, 14);
		contentPane.add(lblAddress);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(66, 7, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(240, 7, 86, 20);
		contentPane.add(textField_2);
		
		JLabel lblDob = new JLabel("DOB :");
		lblDob.setBounds(184, 10, 46, 14);
		contentPane.add(lblDob);
		
		JLabel lblFaculty = new JLabel("Faculty :");
		lblFaculty.setBounds(184, 47, 46, 14);
		contentPane.add(lblFaculty);
		
		JComboBox Faculty = new JComboBox() {
			JComboBox<String> Faculty = new JComboBox<>(new String[]{"BCA", "Electrical", "BE","Civil Engineering","CSIT","BIT"});
		Faculty.setBounds(240, 43, 86, 22);
		contentPane.add(Faculty);
		frame.setVisible(true);}
		
		
		JLabel lblInerestedLub = new JLabel("Inerested club :");
		lblInerestedLub.setBounds(10, 90, 86, 14);
		contentPane.add(lblInerestedLub);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Non");
		chckbxNewCheckBox.setBounds(66, 111, 61, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxBishes = new JCheckBox("BSES");
		chckbxBishes.setBounds(129, 111, 61, 23);
		contentPane.add(chckbxBishes);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("RIU");
		chckbxNewCheckBox_1_1.setBounds(10, 111, 51, 23);
		contentPane.add(chckbxNewCheckBox_1_1);
		
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setBounds(10, 151, 61, 14);
		contentPane.add(lblGender);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Female");
		rdbtnNewRadioButton.setBounds(10, 172, 61, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(101, 172, 51, 23);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Others");
		rdbtnNewRadioButton_1_1.setBounds(194, 172, 78, 23);
		contentPane.add(rdbtnNewRadioButton_1_1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(7, 202, 89, 23);
		contentPane.add(btnNewButton);
	}
}
