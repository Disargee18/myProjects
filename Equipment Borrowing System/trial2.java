import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;


public class trial2 extends JFrame implements ActionListener
{
    ImageIcon imageIcon = new ImageIcon("images\\logo.png");
    JLabel label = new JLabel();
    JLabel label2 = new JLabel();
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button = new JButton();

    public trial2()
    {
        this.setTitle("Equipment Borrowing System");
        this.setSize(1280,720);
        this.setVisible(true);
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(115, 43, 245));
        
       
       
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
