


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Moon extends JFrame {
    private JComboBox<String> comboBox;
    private JLabel imageLabel;

    // Names of moon phases
    private String[] phases = {
        "New Moon", "First Quarter", "Full Moon", "Last Quarter"
    };

    // Image file names corresponding to moon phases
    private String[] imageFiles = {
        "new moon.jpeg",
        "first quarter.jpeg",
        "full m.jpeg",
        "last.jpeg"
    };

    public Moon() {
        setTitle("Moon Phase Selector");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the combo box
        comboBox = new JComboBox<>(phases);
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateImage();
            }
        });

        // Create the label to display the image
        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        imageLabel.setVerticalAlignment(JLabel.CENTER);

        // Add components to the frame
        add(comboBox, BorderLayout.NORTH);
        add(imageLabel, BorderLayout.CENTER);

        // Set initial image
        updateImage();
    }

    private void updateImage() {
        // Get the selected index
        int index = comboBox.getSelectedIndex();
        // Load the corresponding image
        ImageIcon icon = new ImageIcon(getClass().getResource(imageFiles[index]));
        // Set the image icon to the label
        imageLabel.setIcon(icon);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Moon frame = new Moon();
                frame.setVisible(true);
            }
        });
    }
}
