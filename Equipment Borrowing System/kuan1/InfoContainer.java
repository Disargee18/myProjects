import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class InfoContainer extends JFrame implements ActionListener

{
    CardLayout card = new CardLayout();

    JPanel headPanel = new JPanel();
    JPanel cardPanel = new JPanel(card);
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel formPanel = new JPanel();
    JPanel confirmPanel = new JPanel();

    JLabel tLabel = new JLabel("Boom! Naborrow");
    JLabel name = new JLabel("Name:");
    JLabel idNum = new JLabel("ID No:");
    JLabel email = new JLabel("Email Address:");
    JLabel phone = new JLabel("Contact No:");
    JLabel time = new JLabel("Return Time:");
    JLabel title = new JLabel("Borrower's Information Form");
    JLabel name2 = new JLabel("Name:");
    JLabel idNum2 = new JLabel("ID No:");
    JLabel email2 = new JLabel("Email Address:");
    JLabel phone2 = new JLabel("Contac No:");
    JLabel time2 = new JLabel("Return Time:");
    JLabel title2 = new JLabel("Confirm Information");

    JTextField nametf = new JTextField();
    JTextField idNumtf = new JTextField();
    JTextField emailtf = new JTextField();
    JTextField phonetf = new JTextField();
    JTextField timetf = new JTextField();

    JButton hButton = new JButton("HOME");
    JButton enter = new JButton("Enter");
    JButton proceed = new JButton("Proceed");
    JButton undo = new JButton("Edit");

    JScrollPane scrollPane = new JScrollPane(formPanel);
    JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
    JScrollPane scrollPane2 = new JScrollPane(confirmPanel);
    JScrollBar verticalScrollBar2 = scrollPane2.getVerticalScrollBar();

    ArrayList<String> storeName = new ArrayList<String>();
    ArrayList<String> storeID = new ArrayList<String>();
    ArrayList<String> storeEmail = new ArrayList<String>();
    ArrayList<String> storePhone = new ArrayList<String>();
    ArrayList<String> storeTime = new ArrayList<String>();

    String newName = "hatdog lami";

    String nameText,iDText,emailText,phoneText;

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
        title.setBorder(BorderFactory.createEmptyBorder(30, 0, 30, 0));

        title2.setFont(new Font("Times New Roman", Font.BOLD, 50));
        title2.setForeground(Color.white);
        title2.setAlignmentX(Component.CENTER_ALIGNMENT);
        title2.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));

        //PANEL1
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.setBorder(BorderFactory.createEmptyBorder(10, 20, 30, 20));
        panel1.setBackground(Color.decode("#112A42"));

        formPanel.setBackground(Color.decode("#0B1C2C"));
        formPanel.setLayout(null);
        formPanel.setPreferredSize(new Dimension(1000,750));
        // formPanel.setMinimumSize(new Dimension(1000,550));
        // formPanel.setMaximumSize(new Dimension(1000,550));

        formPanel.add(name);
        formPanel.add(nametf);
        name.setBounds(20, 0, 100, 70);
        name.setForeground(Color.white);
        name.setFont(new Font("Times New Roman", Font.BOLD, 30));
        nametf.setBounds(10, 65, 950, 50);
        nametf.setBackground(Color.lightGray);

        formPanel.add(idNum);
        formPanel.add(idNumtf);
        idNum.setBounds(20, 120, 500, 70);
        idNum.setForeground(Color.white);
        idNum.setFont(new Font("Times New Roman", Font.BOLD, 30));
        idNumtf.setBounds(10, 185, 950, 50);
        idNumtf.setBackground(Color.lightGray);

        formPanel.add(email);
        formPanel.add(emailtf);
        email.setBounds(20, 250, 500, 70);
        email.setForeground(Color.white);
        email.setFont(new Font("Times New Roman", Font.BOLD, 30));
        emailtf.setBounds(10, 315, 950, 50);
        emailtf.setBackground(Color.lightGray);

        formPanel.add(phone);
        formPanel.add(phonetf);
        phone.setBounds(20, 380, 500, 70);
        phone.setForeground(Color.white);
        phone.setFont(new Font("Times New Roman", Font.BOLD, 30));
        phonetf.setBounds(10, 445, 950, 50);
        phonetf.setBackground(Color.lightGray);

        formPanel.add(time);
        formPanel.add(timetf);
        time.setBounds(20, 510, 500, 70);
        time.setForeground(Color.white);
        time.setFont(new Font("Times New Roman", Font.BOLD, 30));
        timetf.setBounds(10, 575, 950, 50);
        timetf.setBackground(Color.lightGray);

        formPanel.add(enter);
        enter.setBounds(300,665,400,50);
        enter.setBackground(Color.white);
        enter.setForeground(Color.BLACK);
        enter.addActionListener(this);  

        scrollPane.setPreferredSize(new Dimension(1000, 420));
        scrollPane.setMinimumSize(new Dimension(1000, 420));
        scrollPane.setMaximumSize(new Dimension(1000, 420));
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        verticalScrollBar.setUnitIncrement(20); 
        verticalScrollBar.setBlockIncrement(80);
        scrollPane.setViewportView(formPanel);

        panel1.add(title);
        panel1.add(scrollPane);
        // panel1.add(formPanel);   

        //PANEL 2
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        panel2.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 20));
        panel2.setBackground(Color.decode("#112A42"));

        confirmPanel.setBackground(Color.decode("#0B1C2C"));
        confirmPanel.setLayout(null);
        confirmPanel.setPreferredSize(new Dimension(1000, 570));  
        // confirmPanel.setMinimumSize(new Dimension(1180,420));
        // confirmPanel.setMaximumSize(new Dimension(1180,420));

        confirmPanel.add(name2);
        name2.setBounds(20, 0, 1000, 70);
        name2.setForeground(Color.white);
        name2.setFont(new Font("Times New Roman", Font.BOLD, 30));

        confirmPanel.add(idNum2);
        idNum2.setBounds(20, 100, 1000, 70);
        idNum2.setForeground(Color.white);
        idNum2.setFont(new Font("Times New Roman", Font.BOLD, 30));


        confirmPanel.add(email2);
        email2.setBounds(20, 200, 1000, 70);
        email2.setForeground(Color.white);
        email2.setFont(new Font("Times New Roman", Font.BOLD, 30));

        confirmPanel.add(phone2);
        phone2.setBounds(20, 300, 1000, 70);
        phone2.setForeground(Color.white);
        phone2.setFont(new Font("Times New Roman", Font.BOLD, 30));

        confirmPanel.add(time2);
        time2.setBounds(20, 400, 1000, 70);
        time2.setForeground(Color.white);
        time2.setFont(new Font("Times New Roman", Font.BOLD, 30));
        
        confirmPanel.add(proceed);
        proceed.setBounds(390,500,200,40);
        proceed.setBackground(Color.white);
        proceed.setForeground(Color.BLACK);
        proceed.addActionListener(this);

        confirmPanel.add(undo);
        undo.setBounds(690,500,200,40);
        undo.setBackground(Color.white);
        undo.setForeground(Color.BLACK);
        undo.addActionListener(this);

        scrollPane2.setPreferredSize(new Dimension(1180, 420));
        scrollPane2.setMinimumSize(new Dimension(1180, 420));
        scrollPane2.setMaximumSize(new Dimension(1180, 420));
        scrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        verticalScrollBar2.setUnitIncrement(20); 
        verticalScrollBar2.setBlockIncrement(80);
        scrollPane2.setViewportView(confirmPanel);

        panel2.add(title2);
        panel2.add(scrollPane2);

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

        numberOnlyFunct();
    }

    public void numberOnlyFunct()
    {
        //Function 
        idNumtf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE) {
                    e.consume();
                }
            }
        });
        
        phonetf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE) {
                    e.consume();
                }
            }
        });
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==hButton)
        {
            new Dashboard();
            this.dispose();
        }
        
        if(e.getSource()==enter)
        {
            nameText = nametf.getText();
            iDText = idNumtf.getText();
            emailText = emailtf.getText();
            phoneText = phonetf.getText();

            if(nameText.isEmpty()||iDText.isEmpty()||emailText.isEmpty()||phoneText.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Please Input All Fields","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
            card.show(cardPanel, "two");
            }

            // ||storeID.isEmpty()||storeEmail.isEmpty()||storePhone.isEmpty()
            storeName.add(nametf.getText());
            storeID.add(idNumtf.getText());
            storeEmail.add(emailtf.getText());
            storePhone.add(phonetf.getText()); 
            storeTime.add(timetf.getText());

            name2.setText("Name: " + storeName.get(storeName.size() - 1)); 
            idNum2.setText("ID No: " + storeID.get(storeID.size() - 1));
            email2.setText("Email Address: " + storeEmail.get(storeEmail.size() - 1));
            phone2.setText("Contact No: " + storePhone.get(storePhone.size() - 1));   
            time2.setText("Return Time: " + storeTime.get(storeTime.size() - 1));   
        }

        if(e.getSource()==undo)
        {
            card.show(cardPanel, "one");
            nameText = null;
            iDText = null;
            emailText = null;
            phoneText = null;

            storeName.remove(storeName.size()-1);
            storeID.remove(storeID.size()-1);
            storeEmail.remove(storeEmail.size()-1);
            storePhone.remove(storePhone.size()-1);
            
        }

        if(e.getSource()==proceed)
        {
            new Dashboard();
            this.dispose();
        }
    }

}
