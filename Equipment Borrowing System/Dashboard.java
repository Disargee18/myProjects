import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Dashboard extends JFrame implements ActionListener
{
    ImageIcon imageIcon = new ImageIcon("images\\output-onlinepngtools.png");
    JLabel label = new JLabel();
    JLabel label2 = new JLabel();
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button = new JButton();
    JLabel icon = new JLabel();

    public Dashboard()
    {
        this.setTitle("Equipment Borrowing System");
        this.setSize(1280,720);
        this.setVisible(true);
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(0,9,75));

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
        icon.setBounds(40, 30, 150, 150);


        this.add(label);
        this.add(label2);
        this.add(button1);
        this.add(button2);
        this.add(button);
        this.add(icon);
       
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==button1)
        {
            new trial();
        }
        if(e.getSource()==button2)
        {
            new trial2();
        }
    }
}