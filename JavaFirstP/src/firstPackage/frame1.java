package firstPackage;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics2D;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class frame1 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 frame = new frame1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();}
			}
		});
	}
	public frame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	}
	//Override Method(paint)
	public void paint(Graphics g)
	{
		super.paint(g);
		JPanel panel=new JPanel();
		Graphics2D g2D=(Graphics2D)g;
		g2D.setStroke(new BasicStroke(2));
		g2D.setColor(Color.blue);
		g2D.drawOval(200,100,50,60);
		g2D.drawRect(150, 80, 100,150);
		int[] yPoints= {80,50,100,100};
		int [] xPoints= {80,50,50,150};
		int noofpoint=4;
		g2D.drawPolygon( xPoints,yPoints,noofpoint);
	}
}
