import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Equipments extends JFrame implements ActionListener{
    JFrame frame;
    JPanel headPanel;
    JPanel sideBar;
    JPanel listPanel;
    JPanel centerPanel;
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    JLabel tLabel;
    JLabel lLabel;
    JLabel categLabel = new JLabel("CATEGORIES");
    JButton hButton;
    JButton borrowButton;
    JButton p1b1 = new JButton("item 1");
    JButton p1b2 = new JButton("item 2");
    JButton p1b3 = new JButton("item 3");
    JButton p1b4 = new JButton("item 4");
    JButton p1b5 = new JButton("item 5");
    JButton p1b6 = new JButton("item 6");
    JButton p2b1 = new JButton("item 1");
    JButton p2b2 = new JButton("item 2");
    JButton p2b3 = new JButton("item 3");
    JButton p2b4 = new JButton("item 4");
    JButton p2b5 = new JButton("item 5");
    JButton p2b6 = new JButton("item 6");
    JButton p3b1 = new JButton("item 1");
    JButton p3b2 = new JButton("item 2");
    JButton p3b3 = new JButton("item 3");
    JButton p3b4 = new JButton("item 4");
    JButton p3b5 = new JButton("item 5");
    JButton p3b6 = new JButton("item 6");
    JButton c1 = new JButton("Sports & Games");
    JButton c2 = new JButton("Office Supplies");
    JButton c3 = new JButton("Books");
    final CardLayout card = new CardLayout();

    public Equipments(){
        frame = new JFrame();
        this.setTitle("Boom! NaBorrow");
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

        //panel 1
        p1.setLayout(new FlowLayout(FlowLayout.CENTER,15,60));
        //p1.setBounds(200,100,780,620);
        p1.setBackground(Color.GREEN);
        p1b1.setPreferredSize(new Dimension(240,200));
        p1b2.setPreferredSize(new Dimension(240,200));
        p1b3.setPreferredSize(new Dimension(240,200));
        p1b4.setPreferredSize(new Dimension(240,200));
        p1b5.setPreferredSize(new Dimension(240,200));
        p1b6.setPreferredSize(new Dimension(240,200));

        p1b1.setBackground(Color.white);
        p1b2.setBackground(Color.white);
        p1b3.setBackground(Color.white);
        p1b4.setBackground(Color.white);
        p1b5.setBackground(Color.white);
        p1b1.setBackground(Color.white);

        p2b1.setBackground(Color.white);
        p2b2.setBackground(Color.white);
        p2b3.setBackground(Color.white);
        p2b4.setBackground(Color.white);
        p2b5.setBackground(Color.white);
        p2b6.setBackground(Color.white);

        p3b1.setBackground(Color.white);
        p3b2.setBackground(Color.white);
        p3b3.setBackground(Color.white);
        p3b4.setBackground(Color.white);
        p3b5.setBackground(Color.white);
        p3b6.setBackground(Color.white);

        p1.add(p1b1);
        p1.add(p1b2);
        p1.add(p1b3);
        p1.add(p1b4);
        p1.add(p1b5);
        p1.add(p1b6);

        //panel 2
        p2.setLayout(new FlowLayout(FlowLayout.CENTER,15,60));
        //p2.setBounds(200,100,780,620);
        p2.setBackground(Color.PINK);
        p2b1.setPreferredSize(new Dimension(240,200));
        p2b2.setPreferredSize(new Dimension(240,200));
        p2b3.setPreferredSize(new Dimension(240,200));
        p2b4.setPreferredSize(new Dimension(240,200));
        p2b5.setPreferredSize(new Dimension(240,200));
        p2b6.setPreferredSize(new Dimension(240,200));
        p2.add(p2b1);
        p2.add(p2b2);
        p2.add(p2b3);
        p2.add(p2b4);
        p2.add(p2b5);
        p2.add(p2b6);

        //panel 3
        p3.setLayout(new FlowLayout(FlowLayout.CENTER,15,60));
        //p3.setBounds(200,100,780,620);
        p3.setBackground(Color.YELLOW);
        p3b1.setPreferredSize(new Dimension(240,200));
        p3b2.setPreferredSize(new Dimension(240,200));
        p3b3.setPreferredSize(new Dimension(240,200));
        p3b4.setPreferredSize(new Dimension(240,200));
        p3b5.setPreferredSize(new Dimension(240,200));
        p3b6.setPreferredSize(new Dimension(240,200));
        p3.add(p3b1);
        p3.add(p3b2);
        p3.add(p3b3);
        p3.add(p3b4);
        p3.add(p3b5);
        p3.add(p3b6);

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

        lLabel = new JLabel("LIST");
        lLabel.setBounds(75,10,90,50);
        lLabel.setFont(new Font("Comic Sans", Font.BOLD, 40));
        lLabel.setForeground(Color.BLACK);
        listPanel.add(lLabel);

        borrowButton = new JButton("BORROW");
        borrowButton.setBounds(60,450,130,40);
        borrowButton.setFont(new Font("Comic Sans", Font.BOLD, 20));
        borrowButton.setBackground(new Color(0,25,57));
        borrowButton.setForeground(Color.WHITE);
        listPanel.add(borrowButton);


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
        if(e.getSource()==hButton)
        {
            new Dashboard();
            this.dispose();
        }
    }
    
    
}
