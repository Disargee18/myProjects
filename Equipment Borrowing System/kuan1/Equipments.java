import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Equipments extends JFrame implements ActionListener{
    int itemCount = 0;
    int a = 0;
    JLabel[] newArr = new JLabel[2];
    JPanel headPanel;
    JPanel sideBar;
    JPanel listPanel;
    JPanel centerPanel;
    JButton button;
    JLabel itemLabel;

    ArrayList<Integer> qt = new ArrayList<>();  

    ArrayList<JLabel> qty = new ArrayList<>();
    ArrayList<JLabel> qty2 = new ArrayList<>();
    ArrayList<JLabel> qty3 = new ArrayList<>();

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
    JButton resetButton = new JButton("RESET");

    JButton del1 = new JButton();
    JButton del2 = new JButton();
    JButton del3 = new JButton();
    //JButton[] del = new JButton[3];

    JLabel[] arrOfItems = new JLabel[3];
    public static ArrayList<JLabel> list = new ArrayList<>();

    JLabel[] p1Items = new JLabel[6];
    JButton[] panel1Items = new JButton[6];
    String[] items1 = new String[]{"Basketball","Volleyball","Badminton","ChessBoard", "Cards", "UNO"};

    JLabel[] p2Items = new JLabel[6];
    JButton[] panel2Items = new JButton[6];
    String[] items2 = new String[]{"Projector","Rulers","Puncher","Stapler","Speaker","Microphone"};

    JLabel[] p3Items = new JLabel[6];
    JButton[] panel3Items = new JButton[6];
    String[] items3 = new String[]{"OOPROG Book","DIGILOG Book","Basic Calculus","HTML & CSS For Beginners","Basic Javascript","How to Accounting"};

    ArrayList<JLabel> p1ItemsAL = new ArrayList<>();
    ArrayList<JLabel> p2ItemsAL = new ArrayList<>();
    ArrayList<JLabel> p3ItemsAL = new ArrayList<>();

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
        p1.setBackground(Color.decode("#112A42"));

        //panel 2
        p2.setLayout(new FlowLayout(FlowLayout.CENTER,15,60));
        p2.setBackground(Color.decode("#112A42"));

        //panel 3
        p3.setLayout(new FlowLayout(FlowLayout.CENTER,15,60));
        p3.setBackground(Color.decode("#112A42"));

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
        inviPanel.setBounds(190,60,55,385);
        inviPanel.setBackground(Color.DARK_GRAY);
        inviPanel.setLayout(new FlowLayout(FlowLayout.CENTER,0,25));
        del1.setPreferredSize(new Dimension(50,20));
        del1.setBackground(Color.WHITE);
        del1.setMinimumSize(new Dimension(50,20));
        del1.setMaximumSize(new Dimension(50,20));
        del1.setAlignmentX(Component.CENTER_ALIGNMENT);
        del1.setVisible(false);
        del1.addActionListener(this);

        del2.setPreferredSize(new Dimension(50,20));
        del2.setBackground(Color.WHITE);
        del2.setMinimumSize(new Dimension(50,20));
        del2.setMaximumSize(new Dimension(50,20));
        del2.setAlignmentX(Component.CENTER_ALIGNMENT);
        del2.setVisible(false);
        del2.addActionListener(this);

        del3.setPreferredSize(new Dimension(50,20));
        del3.setBackground(Color.WHITE);
        del3.setMinimumSize(new Dimension(50,20));
        del3.setMaximumSize(new Dimension(50,20));
        del3.setAlignmentX(Component.CENTER_ALIGNMENT);
        del3.setVisible(false);
        del3.addActionListener(this);

        inviPanel.add(del1);
        inviPanel.add(del2);
        inviPanel.add(del3);
        listPanel.add(inviPanel);

        inviPanel2.setBounds(0,60,190,385);
        inviPanel2.setLayout(new BoxLayout(inviPanel2, BoxLayout.Y_AXIS));
        inviPanel2.add(Box.createVerticalStrut(10));
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

        resetButton.setBounds(130,470,100,40);
        resetButton.setFont(new Font("Comic Sans", Font.BOLD, 13));
        resetButton.setBackground(new Color(0,25,57));
        resetButton.setForeground(Color.WHITE);
        resetButton.addActionListener(this);
        listPanel.add(resetButton);


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
            p1ItemsAL.add(new JLabel(items1[i]));
            panel1Items[i].addActionListener(this);

            panel2Items[i] = new JButton(items2[i]);
            panel2Items[i].setPreferredSize(new Dimension(240,200));
            panel2Items[i].setBackground(Color.white);
            p2.add(panel2Items[i]);

            p2Items[i] = new JLabel(items2[i]);
            p2ItemsAL.add(new JLabel(items2[i]));
            panel2Items[i].addActionListener(this);

            panel3Items[i] = new JButton(items3[i]);
            panel3Items[i].setPreferredSize(new Dimension(240,200));
            panel3Items[i].setBackground(Color.white);
            p3.add(panel3Items[i]);

            p3Items[i] = new JLabel(items3[i]);
            p3ItemsAL.add(new JLabel(items3[i]));
            panel3Items[i].addActionListener(this);
        }
    }

    public void removeITem(int i){
        if (i >= 0 && i < list.size()) {
            for (int j = 0; j<6; j++) {
                if (list.get(i).getText().equals(panel1Items[j].getText())) {
                    panel1Items[j].setEnabled(true);
                }
                if (list.get(i).getText().equals(panel2Items[j].getText())) {
                    panel2Items[j].setEnabled(true);
                }
                if (list.get(i).getText().equals(panel3Items[j].getText())) {
                    panel3Items[j].setEnabled(true);
                }
            }
            inviPanel2.remove(list.get(i));
            list.remove(i);
            inviPanel2.revalidate();
            inviPanel2.repaint();
        }
    }
    public void delButtons(){
        if (itemCount == 0) {
            del1.setVisible(false);
            del2.setVisible(false);
            del3.setVisible(false);
        } else if (itemCount == 1) {
            del1.setVisible(true);
            del2.setVisible(false);
            del3.setVisible(false);
        } else if (itemCount == 2) {
            del1.setVisible(true);
            del2.setVisible(true);
            del3.setVisible(false);
        } else if (itemCount == 3) {
            del1.setVisible(true);
            del2.setVisible(true);
            del3.setVisible(true);
        }
    }

    public int reset()
    {
        // logButtonLabel("RESET action triggered. Clearing all items from the list.");

        list.clear();
        inviPanel2.removeAll();
        inviPanel2.revalidate();
        inviPanel2.repaint();
        itemCount = 0;
        delButtons();
        return itemCount;
    }
    
    public void itemClicked(JButton button, JLabel itemLabel){
        if (itemCount < 3) {
            list.add(itemLabel);
            inviPanel2.add(itemLabel, BorderLayout.WEST);
            itemLabel.setFont(new Font("Comic Sans", Font.PLAIN, 20));
            itemLabel.setBorder(new EmptyBorder(10, 10, 10, 10));
            itemLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
            itemLabel.setVisible(true);
    
            button.setEnabled(false);
            itemCount++;
            //itemCount(itemCount);
            delButtons();
            // logButtonLabel(itemLabel.getText());
        }
    }
    public void itemCount(int itemCount){
        if(itemCount>2)
        {
            for (int j = 0; j<6 ; j++) {
                panel1Items[j].setEnabled(false);
                panel2Items[j].setEnabled(false);
                panel3Items[j].setEnabled(false);

                // panel1Items[j].setOpaque(true);
                // panel2Items[j].setOpaque(true);
                // panel3Items[j].setOpaque(true);

                // p1Items[j].setForeground(Color.DARK_GRAY);
                // p2Items[j].setForeground(Color.DARK_GRAY);
                // p3Items[j].setForeground(Color.DARK_GRAY);

                //System.out.print("itemCount"+itemCount);
            }
        }else{
            for (int j = 0; j<6 ; j++) {
                panel1Items[j].setEnabled(true);
                panel2Items[j].setEnabled(true);
                panel3Items[j].setEnabled(true);
            }
        }
    }

    // private void logButtonLabel(String label) 
    // {
    //     try (BufferedWriter writer = new BufferedWriter(new FileWriter("list.txt", true))) 
    //     {
    //         writer.write(label);
    //         writer.newLine(); 
    //     } 
    //     catch (IOException e) 
    //     {
    //         System.err.println("Error writing to log file: " + e.getMessage());
    //     }
    // }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == c1){
            card.show(centerPanel, "one");
            System.out.println("panel 1");
        }else if (e.getSource() == c2) {
            card.show(centerPanel, "two");
            System.out.println("panel 2");
        }else if (e.getSource() == c3) {
            card.show(centerPanel, "three");
            System.out.println("panel 3");
        }else if(e.getSource()==del1){
            System.out.println("del1");
            removeITem(0);
            itemCount--;
            delButtons();
            //itemCount(itemCount);
            System.out.println(itemCount);
        }else if(e.getSource()==del2){
            System.out.println("del2");
            removeITem(1);
            itemCount--;
            delButtons();
            //itemCount(itemCount);
            System.out.println(itemCount);
        }else if(e.getSource()==del3){
            System.out.println("del3");
            removeITem(2);
            itemCount--;
            delButtons();
            //itemCount(itemCount);
            System.out.println(itemCount);
        }

        //ITEM BUTTONS FUNCTIONALITY   
        for (int i = 0; i < 6; i++) 
            {
                
                if(e.getSource()==panel1Items[i])
                {
                    itemClicked(panel1Items[i], p1ItemsAL.get(i));
                }
    
                if(e.getSource()==panel2Items[i])
                {
                    itemClicked(panel2Items[i], p2ItemsAL.get(i));
                }
                if(e.getSource()==panel3Items[i])
                {
                    itemClicked(panel3Items[i], p3ItemsAL.get(i));
                }
            }
        if(e.getSource()==hButton)
        {
            new Dashboard();
            this.dispose();
        }

        if(e.getSource()==resetButton)
        {
            itemCount(reset());
        }

        if(itemCount>0||itemCount==2)
        {
            if(e.getSource()==borrowButton)
            {
                // System.out.print(list.get(0).getText());
                // System.out.print(list.get(1).getText());
                // System.out.print(list.get(2).getText());
                if(list.size()==2)
                {
                    list.add(new JLabel(""));
                }
                if(list.size()==1)
                {
                    list.add(new JLabel(""));
                }
                new InfoContainer();
                this.dispose();
            }
        }
        
    }
}
