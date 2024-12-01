import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class History extends JFrame implements ActionListener {
    int size = 4;

    JPanel headPanel = new JPanel();
    JPanel mainPanel = new JPanel();
    JPanel secPanel = new JPanel();
    JPanel panel1 = new JPanel();  // Panel for buttons (inside the JScrollPane)
    JPanel panel2 = new JPanel();  // Additional panel for other content (optional)

    JButton hButton = new JButton();
    JButton button[] = new JButton[size];
    
    JLabel tLabel = new JLabel("Boom! NaBorrow");
    JLabel title = new JLabel("List of Borrowers");

    JScrollPane scrollPane; // ScrollPane for panel1
    JScrollBar verticalScrollBar;

    public History() {
        this.setSize(1280, 720);
        this.setTitle("Equipment Borrowing System");
        this.setVisible(true);
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.white);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Head panel
        headPanel.setLayout(null);
        headPanel.setBackground(Color.decode("#0B1C2C"));
        headPanel.setBounds(0, 0, 1280, 100);

        tLabel.setBounds(50, 20, 400, 50);
        tLabel.setFont(new Font("Comic Sans", Font.BOLD, 40));
        tLabel.setForeground(Color.WHITE);
        headPanel.add(tLabel);
        
        hButton = new JButton("HOME");
        hButton.setBounds(1120, 25, 100, 40);
        hButton.setFont(new Font("Comic Sans", Font.BOLD, 20));
        hButton.setBackground(Color.BLACK);
        hButton.setForeground(Color.WHITE);
        headPanel.add(hButton);
        hButton.addActionListener(this);

        // Title label
        title.setFont(new Font("Comic Sans", Font.BOLD, 40));
        title.setBounds(450, 0, 500, 100);
        title.setForeground(Color.white);

        // Main panel
        mainPanel.setBackground(Color.decode("#0B1C2C"));
        mainPanel.setBounds(43, 140, 1180, 520);
        mainPanel.setLayout(null);
        mainPanel.add(title);
        mainPanel.add(secPanel);

        // Sec panel: This holds the scroll pane
        secPanel.setBounds(0, 100, 1180, 420);
        secPanel.setBackground(Color.darkGray);
        secPanel.setLayout(null); // Use null layout to position components manually

        // Initialize the scroll pane and add it to secPanel
        scrollPane = new JScrollPane(panel1);
        scrollPane.setBounds(0, 0, 700, 420); // Set bounds manually for scrollPane
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        // Set up the vertical scroll bar for better scrolling
        verticalScrollBar = scrollPane.getVerticalScrollBar();
        verticalScrollBar.setUnitIncrement(20);
        verticalScrollBar.setBlockIncrement(80);

        // Add the scroll pane to secPanel
        secPanel.add(scrollPane);

        // Panel1 setup with BoxLayout for vertical stacking of buttons
        panel1.setBackground(Color.lightGray);
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS)); // Vertical box layout

        // Create 6 buttons and add them to panel1
        for (int i = 0; i < size; i++) {
            button[i] = new JButton("Button " + (i + 1));
            button[i].setBackground(Color.GREEN);
            button[i].setPreferredSize(new Dimension(700, 100)); // Set height and full width (700px)
            button[i].setMaximumSize(new Dimension(700, 100)); // Ensure the button stretches to the full width
            button[i].setAlignmentX(Component.CENTER_ALIGNMENT); // Center the button horizontally
            panel1.add(button[i]);
        }

        // Add secPanel to the mainPanel
        mainPanel.add(secPanel);

        // Add headPanel and mainPanel to JFrame
        this.add(headPanel);
        this.add(mainPanel);
    }


    InfoContainer c = new InfoContainer();

    


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == hButton) {
            new Dashboard(); // Handle home button click
            this.dispose();  // Close the current window
        }
        if(e.getSource()==button[0])
        {
            System.out.println(c.storeName);
            System.out.println(c.storeID);
            System.out.println(c.storeEmail);
            System.out.println(c.storePhone);
            System.out.println(c.storeTime);
        }
    }
}
