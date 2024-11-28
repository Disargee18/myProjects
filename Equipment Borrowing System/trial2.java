import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class trial2 extends JFrame implements ActionListener {
    CardLayout card = new CardLayout();

    JPanel headPanel = new JPanel();
    JPanel cardPanel = new JPanel(card);

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();

    JLabel tLabel = new JLabel("Boom! Naborrow");
    JLabel name = new JLabel("Name:");
    JLabel title = new JLabel("Borrower's Information Form");

    JTextField nameField = new JTextField(20); // TextField for name

    JButton hButton = new JButton("HOME");

    public trial2() {
        // Header Panel Configuration
        headPanel.setLayout(null);
        headPanel.setBackground(Color.decode("#0B1C2C"));
        headPanel.setBounds(0, 0, 1280, 100);
        headPanel.setPreferredSize(new Dimension(1280, 100));

        tLabel.setBounds(50, 20, 400, 50);
        tLabel.setFont(new Font("Comic Sans", Font.BOLD, 40));
        tLabel.setForeground(Color.WHITE);
        headPanel.add(tLabel);

        // Title Configuration
        title.setFont(new Font("Comic Sans", Font.BOLD, 40));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Main Form Panel Configuration
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.setBackground(Color.white);
        panel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Padding for the form

        // Name Row Panel: Label + TextField Side by Side
        JPanel nameRowPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        nameRowPanel.setBackground(Color.white);

        name.setFont(new Font("Comic Sans", Font.PLAIN, 20)); // Label font
        nameRowPanel.add(name); // Add label to the row
        nameRowPanel.add(nameField); // Add text field to the row

        // Add Components to Main Form Panel
        panel1.add(title); // Add title
        panel1.add(Box.createRigidArea(new Dimension(0, 20))); // Spacer
        panel1.add(nameRowPanel); // Add name row panel

        // Secondary Panel Configuration
        panel2.setLayout(null);
        panel2.setBackground(Color.blue);

        // Card Layout Panel Configuration
        cardPanel.add(panel1, "one");
        cardPanel.add(panel2, "two");

        card.show(cardPanel, "one");

        // Home Button Configuration
        hButton.setBounds(1120, 25, 100, 40);
        hButton.setFont(new Font("Comic Sans", Font.BOLD, 20));
        hButton.setBackground(Color.BLACK);
        hButton.setForeground(Color.WHITE);
        headPanel.add(hButton);
        hButton.addActionListener(this);

        // Frame Configuration
        this.setSize(1280, 720);
        this.setTitle("Equipment Borrowing System");
        this.setVisible(true);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.getContentPane().setBackground(Color.decode("#112A42"));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(headPanel, BorderLayout.NORTH);
        this.add(cardPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == hButton) {
            card.show(cardPanel, "one");
        }
    }

    public static void main(String[] args) {
        new trial2();
    }
}
