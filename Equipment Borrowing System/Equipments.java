import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Equipments extends JFrame implements ActionListener{
    JPanel headPanel;
    JPanel sideBar;
    JPanel listPanel;
    JPanel centerPanel;

    JPanel inviPanel = new JPanel();
    JPanel inviPanel2 = new JPanel();

    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();

    JLabel tLabel;
    JLabel lLabel;
    JLabel categLabel = new JLabel("CATEGORIES");
    JButton hButton;
    JButton borrowButton;
    JButton restartButton = new JButton("RESTART");

    JLabel[] p1Items = new JLabel[6];
    JButton[] panel1Items = new JButton[6];
    String[] items1 = new String[]{"Basketball","Volleyball","Badminton","ChessBoard", "Cards", "UNO"};

    JLabel[] p2Items = new JLabel[6];
    JButton[] panel2Items = new JButton[6];
    String[] items2 = new String[]{"Projector","Rulers","Puncher","Stapler","Speaker","Microphone"};

    JLabel[] p3Items = new JLabel[6];
    JButton[] panel3Items = new JButton[6];
    String[] items3 = new String[]{"OOPROG Book","DIGILOG Book","Basic Calculus","HTML & CSS For Beginners","Basic Javascript","How to Accounting"};

    JButton c1 = new JButton("Sports & Games");
    JButton c2 = new JButton("Office Supplies");
    JButton c3 = new JButton("Books");
    final CardLayout card = new CardLayout();

    public Equipments(){
        this.setTitle("Equipment Borrowing System");
        this.setVisible(true);
        this.setSize(1280,720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.decode("#112A42"));
        this.setLayout(null);

        headPanel = new JPanel();
        headPanel.setLayout(null);
        headPanel.setBackground(Color.decode("#0b1C2C"));
        headPanel.setBounds(0,0,1280,100);
        this.add(headPanel);

        tLabel = new JLabel("Boom! NaBorrow");
        tLabel.setBounds(50,20,400,50);
        tLabel.setFont(new Font("Comic Sans", Font.BOLD, 40));
        tLabel.setForeground(Color.WHITE);
        headPanel.add(tLabel);

        hButton = new JButton("HOME");
        hButton.setBounds(1120,25,100,40);
        hButton.setFont(new Font("Comic Sans", Font.BOLD, 20));
        hButton.setBackground(Color.BLACK);
        hButton.setForeground(Color.WHITE);
        headPanel.add(hButton);
        hButton.addActionListener(this);

        sideBar = new JPanel();
        sideBar.setLayout(new BoxLayout(sideBar, BoxLayout.Y_AXIS));
        sideBar.setBounds(0,100,200,620);
        sideBar.setBackground(Color.decode("#112A42"));
        this.add(sideBar);

        c1.setPreferredSize(new Dimension(150,100));
        c1.setMaximumSize(new Dimension(150, 100));    
        c1.setMinimumSize(new Dimension(150, 100));
        c1.setAlignmentX(Component.CENTER_ALIGNMENT);
        c1.setBackground(Color.white);
        c1.setFont(new Font("Comic Sans", Font.BOLD, 14));
        c1.addActionListener(this);

        c2.setPreferredSize(new Dimension(150,100));
        c2.setMaximumSize(new Dimension(150, 100));    
        c2.setMinimumSize(new Dimension(150, 100));
        c2.setAlignmentX(Component.CENTER_ALIGNMENT);
        c2.setBackground(Color.white);
        c2.setFont(new Font("Comic Sans", Font.BOLD, 14));
        c2.addActionListener(this);

        c3.setPreferredSize(new Dimension(150,100));
        c3.setMaximumSize(new Dimension(150, 100));    
        c3.setMinimumSize(new Dimension(150, 100));
        c3.setAlignmentX(Component.CENTER_ALIGNMENT);
        c3.setBackground(Color.white);
        c3.setFont(new Font("Comic Sans", Font.BOLD, 14));
        c3.addActionListener(this);


        categLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        categLabel.setFont(new Font("Comic Sans", Font.BOLD, 20));

        categLabel.setForeground(Color.WHITE);
        sideBar.add(Box.createVerticalStrut(30));
        sideBar.add(categLabel);
        sideBar.add(Box.createVerticalStrut(40));
        sideBar.add(c1);
        sideBar.add(Box.createVerticalStrut(40));
        sideBar.add(c2);
        sideBar.add(Box.createVerticalStrut(40));
        sideBar.add(c3);
        sideBar.add(Box.createVerticalStrut(40));

        centerPanel = new JPanel();
        centerPanel.setBounds(200,100,780,620);
        centerPanel.setLayout(card);
        centerPanel.setBackground(Color.gray);
        p4.setBackground(Color.decode("#112A42"));
        centerPanel.add(p4, "four");
        centerPanel.add(p1, "one");
        centerPanel.add(p2, "two");
        centerPanel.add(p3, "three");
        this.add(centerPanel);
        card.show(centerPanel, "four");

        kuan();


        //panel 1
        p1.setLayout(new FlowLayout(FlowLayout.CENTER,15,60));
        p1.setBackground(Color.GREEN);

        //panel 2
        p2.setLayout(new FlowLayout(FlowLayout.CENTER,15,60));
        p2.setBackground(Color.PINK);

        //panel 3
        p3.setLayout(new FlowLayout(FlowLayout.CENTER,15,60));
        p3.setBackground(Color.YELLOW);

        p1.revalidate();
        p1.repaint();
        p2.revalidate();
        p2.repaint();
        p3.revalidate();
        p3.repaint();

        listPanel = new JPanel();
        listPanel.setLayout(null);
        listPanel.setBounds(1000,120,245,545);
        listPanel.setBackground(Color.WHITE);
        this.add(listPanel);

        inviPanel = new JPanel();
        inviPanel.setBounds(190,60,100,385);
        inviPanel.setBackground(Color.yellow);
        listPanel.add(inviPanel);
        

        // inviPanel2.setBackground(Color.blue);
        inviPanel2.setBounds(0,60,190,385);
        inviPanel2.setLayout(new BoxLayout(inviPanel2, BoxLayout.Y_AXIS));
        listPanel.add(inviPanel2);


        lLabel = new JLabel("LIST");
        lLabel.setBounds(75,10,90,50);
        lLabel.setFont(new Font("Comic Sans", Font.BOLD, 40));
        lLabel.setForeground(Color.BLACK);
        listPanel.add(lLabel);

        borrowButton = new JButton("BORROW");
        borrowButton.setBounds(30,470,100,40);
        borrowButton.setFont(new Font("Comic Sans", Font.BOLD, 13));
        borrowButton.setBackground(new Color(0,25,57));
        borrowButton.setForeground(Color.WHITE);
        borrowButton.addActionListener(this);
        listPanel.add(borrowButton);

        restartButton.setBounds(130,470,100,40);
        restartButton.setFont(new Font("Comic Sans", Font.BOLD, 13));
        restartButton.setBackground(new Color(0,25,57));
        restartButton.setForeground(Color.WHITE);
        restartButton.addActionListener(this);
        listPanel.add(restartButton);

    }

    //SETTING THE ARRAYS
    public void kuan()
    {
        for (int i = 0; i < 6; i++) 
        {
            panel1Items[i] = new JButton(items1[i]);
            panel1Items[i].setPreferredSize(new Dimension(240,200));
            panel1Items[i].setBackground(Color.white);
            p1.add(panel1Items[i]);

            p1Items[i] = new JLabel(items1[i]);
            panel1Items[i].addActionListener(this);

            panel2Items[i] = new JButton(items2[i]);
            panel2Items[i].setPreferredSize(new Dimension(240,200));
            panel2Items[i].setBackground(Color.white);
            p2.add(panel2Items[i]);

            p2Items[i] = new JLabel(items2[i]);
            panel2Items[i].addActionListener(this);

            panel3Items[i] = new JButton(items3[i]);
            panel3Items[i].setPreferredSize(new Dimension(240,200));
            panel3Items[i].setBackground(Color.white);
            p3.add(panel3Items[i]);

            p3Items[i] = new JLabel(items3[i]);
            panel3Items[i].addActionListener(this);
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == c1){
            card.show(centerPanel, "one");
            //centerPanel.setVisible(false);
            //p1.setVisible(true);
            //p2.setVisible(false);
            //p3.setVisible(false);
            System.out.println("panel 1");
        }else if (e.getSource() == c2) {
            //centerPanel.setVisible(false);
            //p1.setVisible(false);
            //p2.setVisible(true);
            //p3.setVisible(false);
            card.show(centerPanel, "two");
            System.out.println("panel 2");
        }else if (e.getSource() == c3) {
            //centerPanel.setVisible(false);
            //p1.setVisible(false);
            //p2.setVisible(false);
            //p3.setVisible(true);
            card.show(centerPanel, "three");
            System.out.println("panel 3");
        }


        //ITEM BUTTONS FUNCTIONALITY
        for (int i = 0; i < 6; i++) 
        {
            if(e.getSource()==panel1Items[i])
            {
                inviPanel2.add(p1Items[i],BorderLayout.WEST);
                p1Items[i].setFont(new Font("Comic Sans", Font.PLAIN, 20));
                p1Items[i].setBorder(new EmptyBorder(10, 10, 10, 10)); 
                p1Items[i].setAlignmentX(Component.LEFT_ALIGNMENT);
                p1Items[i].setVisible(true);
            }

            if(e.getSource()==panel2Items[i])
            {
                inviPanel2.add(p2Items[i],BorderLayout.WEST);
                p2Items[i].setFont(new Font("Comic Sans", Font.PLAIN, 20));
                p2Items[i].setBorder(new EmptyBorder(10, 10, 10, 10)); 
                p2Items[i].setAlignmentX(Component.LEFT_ALIGNMENT);
                p2Items[i].setVisible(true);
            }

            if(e.getSource()==panel3Items[i])
            {
                inviPanel2.add(p3Items[i],BorderLayout.WEST);
                p3Items[i].setFont(new Font("Comic Sans", Font.PLAIN, 20));
                p3Items[i].setBorder(new EmptyBorder(10, 10, 10, 10)); 
                p3Items[i].setAlignmentX(Component.LEFT_ALIGNMENT);
                p3Items[i].setVisible(true);
            }
        }

        if(e.getSource()==hButton)
        {
            new Dashboard();
            this.dispose();
        }

        if(e.getSource()==restartButton)
        {
            for (int i = 0; i < 6; i++)
            {
                listPanel.remove(p1Items[i]);
                listPanel.remove(p2Items[i]);
                listPanel.remove(p3Items[i]);

                p1Items[i].setVisible(false);
                p2Items[i].setVisible(false);
                p3Items[i].setVisible(false);
            }



            listPanel.revalidate();
            listPanel.repaint();
        }

        if(e.getSource()==borrowButton)
        {
            new InfoContainer();
            this.dispose();
        }
    }
    
    
}
