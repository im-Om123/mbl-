package firstPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

public class LayoutManagerr extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LayoutManagerr frame = new LayoutManagerr();
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
	public LayoutManagerr() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		 setTitle("Layout Manager Demo");
	        setSize(800, 600);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);

	        // Create a tabbed pane to hold different layout demos
	        JTabbedPane tabbedPane = new JTabbedPane();

	        // FlowLayout panel
	        JPanel flowLayoutPanel = new JPanel(new FlowLayout());
	        for (int i = 1; i <= 5; i++) {
	            flowLayoutPanel.add(new JButton("Button " + i));
	        }
	        tabbedPane.addTab("FlowLayout", flowLayoutPanel);

	        // BorderLayout panel
	        JPanel borderLayoutPanel = new JPanel(new BorderLayout());
	        borderLayoutPanel.add(new JButton("North"), BorderLayout.NORTH);
	        borderLayoutPanel.add(new JButton("South"), BorderLayout.SOUTH);
	        borderLayoutPanel.add(new JButton("East"), BorderLayout.EAST);
	        borderLayoutPanel.add(new JButton("West"), BorderLayout.WEST);
	        borderLayoutPanel.add(new JButton("Center"), BorderLayout.CENTER);
	        tabbedPane.addTab("BorderLayout", borderLayoutPanel);

	        // GridLayout panel
	        JPanel gridLayoutPanel = new JPanel(new GridLayout(2, 3));
	        for (int i = 1; i <= 6; i++) {
	            gridLayoutPanel.add(new JButton("Button " + i));
	        }
	        tabbedPane.addTab("GridLayout", gridLayoutPanel);

	        // BoxLayout panel
	        JPanel boxLayoutPanel = new JPanel();
	        boxLayoutPanel.setLayout(new BoxLayout(boxLayoutPanel, BoxLayout.Y_AXIS));
	        for (int i = 1; i <= 5; i++) {
	            boxLayoutPanel.add(new JButton("Button " + i));
	        }
	        tabbedPane.addTab("BoxLayout", boxLayoutPanel);

	        // GridBagLayout panel
	        JPanel gridBagLayoutPanel = new JPanel(new GridBagLayout());
	        GridBagConstraints gbc = new GridBagConstraints();
	        
	        gbc.fill = GridBagConstraints.HORIZONTAL;
	        gbc.gridx = 0;
	        gbc.gridy = 0;
	        gridBagLayoutPanel.add(new JButton("Button 1"), gbc);
	        
	        gbc.gridx = 1;
	        gbc.gridy = 0;
	        gridBagLayoutPanel.add(new JButton("Button 2"), gbc);
	        
	        gbc.gridx = 0;
	        gbc.gridy = 1;
	        gbc.gridwidth = 2;
	        gridBagLayoutPanel.add(new JButton("Button 3"), gbc);
	        
	        gbc.fill = GridBagConstraints.HORIZONTAL;
	        gbc.ipady = 40;      // make this component tall
	        gbc.weightx = 0.0;
	        gbc.gridwidth = 3;
	        gbc.gridx = 0;
	        gbc.gridy = 2;
	        gridBagLayoutPanel.add(new JButton("Button 4"), gbc);
	        
	        gbc.fill = GridBagConstraints.HORIZONTAL;
	        gbc.ipady = 0;       // reset to default
	        gbc.weighty = 1.0;   // request any extra vertical space
	        gbc.anchor = GridBagConstraints.PAGE_END; // bottom of space
	        gbc.insets = new Insets(10,0,0,0);  // top padding
	        gbc.gridx = 1;       // aligned with button 2
	        gbc.gridwidth = 2;   // 2 columns wide
	        gbc.gridy = 3;       // third row
	        gridBagLayoutPanel.add(new JButton("Button 5"), gbc);
	        
	        tabbedPane.addTab("GridBagLayout", gridBagLayoutPanel);

	        // Add the tabbed pane to the frame
	        add(tabbedPane);

	        // Make the frame visible
	        setVisible(true);
	}

}
