import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Dashboard extends JFrame implements ActionListener
{
    ImageIcon imageIcon = new ImageIcon("images\\kuan.png");
    JLabel label = new JLabel();
    JLabel label2 = new JLabel();
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button = new JButton();
    JButton hButton = new JButton();
    JLabel icon = new JLabel();
    JPanel headPanel = new JPanel();

    public Dashboard()
    {
        this.setTitle("Equipment Borrowing System");
        this.setSize(1280,720);
        this.setVisible(true);
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.decode("#112A42"));

        label.setText("Equipment Borrowing System");
        label.setFont(new Font("Times New Roman", Font.BOLD, 50));
        label.setBounds(315,200,1280,60);
        label.setForeground(Color.white);

        label2.setText("\"Your Trusted Source for Reliable Equipment Rentals\"");
        label2.setFont(new Font("Times New Roman",Font.ITALIC,30));
        label2.setBounds(315,300,1280,60);
        label2.setForeground(Color.white);

        button1.setText("Borrow Now");
        button1.setFont(new Font("Calibri",Font.BOLD,20));
        button1.setBounds(400,420,200,50);
        button1.setBackground(Color.lightGray);
        button1.setForeground(Color.BLACK);
        button1.addActionListener(this);

        button2.setText("Borrow History");
        button2.setFont(new Font("Calibri",Font.BOLD,20));
        button2.setBounds(700,420,200,50);
        button2.setBackground(Color.lightGray);
        button2.setForeground(Color.BLACK);
        button2.addActionListener(this);

        // button.setBounds(40, 30, 150, 150);
        icon.setIcon(imageIcon);
        icon.setBounds(40, 30, 629, 150);

        headPanel = new JPanel();
        headPanel.setLayout(null);
        headPanel.setBackground(Color.decode("#0B1C2C"));
        headPanel.setBounds(0,0,1280,100);
        

        hButton = new JButton("HOME");
        hButton.setBounds(1120,25,100,40);
        hButton.setFont(new Font("Comic Sans", Font.BOLD, 20));
        hButton.setBackground(Color.BLACK);
        hButton.setForeground(Color.WHITE);
        headPanel.add(hButton);
        hButton.addActionListener(this);


        this.add(label);
        this.add(label2);
        this.add(button1);
        this.add(button2);
        this.add(button);
        this.add(headPanel);
       
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==button1)
        {
            new Equipments();
            this.dispose();
        }
        if(e.getSource()==button2)
        {
            new trial2();
            this.dispose();
        }
    }
}