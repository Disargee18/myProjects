import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;

public class borrowList extends JFrame implements ActionListener {
    CardLayout card = new CardLayout();

    JPanel headPanel = new JPanel();
    JPanel mainPanel = new JPanel();
    ArrayList<ArrayList<String>> loadedList = new ArrayList<>();
    ArrayList<JPanel> panelist = new ArrayList<>();
    JPanel[] arrPanel = new JPanel[15];
    JButton[] arrButton = new JButton[15];

    JScrollPane scroll;

    JLabel tLabel = new JLabel("Boom! Naborrow");
    JLabel name = new JLabel("Name:");
    JLabel title = new JLabel("Borrower's Information Form");

    JButton hButton = new JButton("HOME");

    public borrowList() {
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

        this.add(title);
        title.setFont(new Font("Comic Sans", Font.BOLD, 40));
        title.setBounds(350, 90, 700, 100);
        title.setForeground(Color.white);

        scroll = new JScrollPane(mainPanel);
        scroll.setBounds(33, 180, 1200, 480);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        this.add(scroll);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.darkGray);

        loadedList.add(loadData());
    }

    public static ArrayList<String> loadData() {
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("list.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    //SETUP PANELS
    public void panelbuttonSetup(){
        for (int i = 0; i<15; i++) 
        {
            arrPanel[i] = new JPanel();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == hButton) {
            for (int i = 0; i < loadedList.size(); i++) {
                ArrayList<String> innerList = loadedList.get(i);
                for (int j = 0; j < innerList.size(); j++) {
                    System.out.println("" + innerList.get(j));
                }
            }
            new Dashboard();
            this.dispose();
        }
    }

}
