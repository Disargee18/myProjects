import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.awt.image.*;
class FadeJLabel extends JFrame
{
JLabel l;
ImageIcon icon;
Timer t;
int x;

    public FadeJLabel()
    {
        createAndShowGUI();
    }
    
    private void createAndShowGUI()
    {
        // Set frame properties
        setTitle("Fade JLabel");
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Set a white background for the JFrame
        getContentPane().setBackground(Color.WHITE);
        
        // Create an ImageIcon        
        
        // Create a JLabel
        l=new JLabel("Java-Demos.blogspot.com");
        
        // Set the text position bottom center relative
        // to the icon so that the icon appears as a
        // a desktop icon
        l.setVerticalTextPosition(SwingConstants.BOTTOM);
        l.setHorizontalTextPosition(SwingConstants.CENTER);
        
        // Set the icon to the JLabel
        
        // Set foreground
        l.setForeground(new Color(0,0,0,0));
        
        l.setOpaque(true);
        
        // Set some font
        l.setFont(new Font("Myriad Pro",Font.PLAIN,28));
        
        // Add the JLabel
        add(l);
            
        // Create a Timer with that executes
        // each 1ms
        t=new Timer(5,new ActionListener(){
        
            public void actionPerformed(ActionEvent ae)
            {
                // Increase the alpha value by time
                // so that transparency decreases for each
                // actionPerformed() call
                l.setForeground(new Color(0,0,0,x++));
                l.setBackground(new Color(255,255,255,x));
                if(x==255) t.stop();
            }
        });
        
        // Set some initial delay, optional
        t.setInitialDelay(200);
        
        // Start the timer
        t.start();
        
        // Set size and show the frame
        setSize(500,500);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String args[])
    {
        SwingUtilities.invokeLater(new Runnable(){
            public void run()
            {
                new FadeJLabel();
            }
        });
    }
}