package firstPackage;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class ChangeFont extends JFrame {
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangeFont frame = new ChangeFont();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	String  fontList[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
	public ChangeFont() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" ACEM");
		lblNewLabel.setBounds(215, 49, 105, 53);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Change Font");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Font f= new Font("Stencil",Font.BOLD, 15);
				lblNewLabel.setFont(f);
				btnNewButton.setVisible(true);
			}
		});
		btnNewButton.setBounds(0, 11, 154, 23);
		contentPane.add(btnNewButton);
		
		JButton btnChangeFont = new JButton("Size");
		btnChangeFont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Font f = new Font("Stencil",Font.BOLD, 30);
				lblNewLabel.setFont(f);
				btnNewButton.setVisible(true);
			}
		});
		btnChangeFont.setBounds(0, 45, 105, 23);
		contentPane.add(btnChangeFont);
		
		JButton btnNewButton_1 = new JButton("Change Color");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Font f = new Font("Stencil",Font.BOLD, 30);
				lblNewLabel.setForeground(Color.GRAY);
			}
		});
		btnNewButton_1.setBounds(0, 79, 154, 23);
		contentPane.add(btnNewButton_1);
		
		
	}
}
