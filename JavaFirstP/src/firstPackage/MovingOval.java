package firstPackage;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class MovingOval extends JFrame {
	int x=150;
	int y=100;
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MovingOval frame = new MovingOval();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();}
			}
		});
	}
	public MovingOval() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton_1 = new JButton("Right");
		btnNewButton_1.setBounds(315, 113, 109, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x=x+20;
				repaint();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(36, 16, 0, 2);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("Left");
		btnNewButton.setBounds(10, 113, 67, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Top");
		btnNewButton_2.setBounds(170, 16, 94, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				y=y-20;
				repaint();
			}
		});
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Bottom");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				y=y+20;
				repaint();
			}
		});
		btnNewButton_2_1.setBounds(170, 227, 109, 23);
		contentPane.add(btnNewButton_2_1);
		
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				x=x- 10;  
				repaint();
            }
        });
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2D=(Graphics2D)g;
		g2D.setStroke(new BasicStroke(2));
		g2D.setColor(Color.blue);
		g2D.drawOval(x,y,50,100);
		
		
	}
}
