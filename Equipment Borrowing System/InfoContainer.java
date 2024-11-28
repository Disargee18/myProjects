import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InfoContainer extends JFrame implements ActionListener
{
    CardLayout card = new CardLayout();

    JPanel headPanel = new JPanel();
    JPanel cardPanel = new JPanel(card);
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel formPanel = new JPanel();

    JLabel tLabel = new JLabel("Boom! Naborrow");
    JLabel name = new JLabel("Name:");
    JLabel idNum = new JLabel("ID No:");
    JLabel email = new JLabel("Email Address:");
    JLabel phone = new JLabel("Contact No:");
    JLabel title = new JLabel("Borrower's Information Form");

    JTextField nametf = new JTextField();
    JTextField idNumtf = new JTextField();
    JTextField emailtf = new JTextField();
    JTextField phonetf = new JTextField();

    JButton hButton = new JButton("HOME");
    JButton enter = new JButton("Enter");

    JScrollPane scrollPane = new JScrollPane(formPanel);

    public InfoContainer()
    {
        headPanel.setLayout(null);
        headPanel.setBackground(Color.decode("#0B1C2C"));
        headPanel.setBounds(0, 0, 1280, 100);
        headPanel.setPreferredSize(new Dimension(1280, 100));

        tLabel.setBounds(50, 20, 400, 50);
        tLabel.setFont(new Font("Comic Sans", Font.BOLD, 40));
        tLabel.setForeground(Color.WHITE);
        headPanel.add(tLabel);

        title.setFont(new Font("Times New Roman", Font.BOLD, 50));
        title.setForeground(Color.white);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));

        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 20));
        panel1.setBackground(Color.decode("#112A42"));

        formPanel.setBackground(Color.decode("#0B1C2C"));
        formPanel.setLayout(null);
        formPanel.setPreferredSize(new Dimension(1280, 600));  

        
        formPanel.add(name);
        formPanel.add(nametf);
        name.setBounds(20, 0, 100, 70);
        name.setForeground(Color.white);
        name.setFont(new Font("Times New Roman", Font.BOLD, 30));
        nametf.setBounds(10, 65, 1190, 50);
        nametf.setBackground(Color.lightGray);

        formPanel.add(idNum);
        formPanel.add(idNumtf);
        idNum.setBounds(20, 120, 500, 70);
        idNum.setForeground(Color.white);
        idNum.setFont(new Font("Times New Roman", Font.BOLD, 30));
        idNumtf.setBounds(10, 185, 1190, 50);
        idNumtf.setBackground(Color.lightGray);


        formPanel.add(email);
        formPanel.add(emailtf);
        email.setBounds(20, 250, 500, 70);
        email.setForeground(Color.white);
        email.setFont(new Font("Times New Roman", Font.BOLD, 30));
        emailtf.setBounds(10, 315, 1190, 50);
        emailtf.setBackground(Color.lightGray);


        formPanel.add(phone);
        formPanel.add(phonetf);
        phone.setBounds(20, 380, 500, 70);
        phone.setForeground(Color.white);
        phone.setFont(new Font("Times New Roman", Font.BOLD, 30));
        phonetf.setBounds(10, 445, 1190, 50);
        phonetf.setBackground(Color.lightGray);


        formPanel.add(enter);
        enter.setBounds(410,530,400,50);
        enter.setBackground(Color.white);
        enter.setForeground(Color.BLACK);


        scrollPane.setPreferredSize(new Dimension(1280, 600));  
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); 
        JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
        verticalScrollBar.setUnitIncrement(20);  // Set unit increment for fine scroll (small scroll)
        verticalScrollBar.setBlockIncrement(100);


        panel1.add(title);
        panel1.add(scrollPane);

        panel2.setLayout(null);
        panel2.setBackground(Color.blue);

        cardPanel.add(panel1, "one");
        cardPanel.add(panel2, "two");
        card.show(cardPanel, "one");

        hButton = new JButton("HOME");
        hButton.setBounds(1120, 25, 100, 40);
        hButton.setFont(new Font("Comic Sans", Font.BOLD, 20));
        hButton.setBackground(Color.BLACK);
        hButton.setForeground(Color.WHITE);
        headPanel.add(hButton);
        hButton.addActionListener(this);

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
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==hButton)
        {
            new Dashboard();
            this.dispose();
        }
    }

}
