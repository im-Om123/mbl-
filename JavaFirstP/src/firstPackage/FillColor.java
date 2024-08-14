package firstPackage;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FillColor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FillColor frame = new FillColor();
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
	public FillColor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);	
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		JPanel panel=new JPanel();
		Graphics2D g2D=(Graphics2D)g;
		g2D.setStroke(new BasicStroke(2));
		g2D.setColor(Color.blue);
		g2D.drawOval(200,100,150,140);
		
		g2D.setColor(Color.gray); 
        g2D.fillOval(200, 100, 150, 140);
		
		}

}
