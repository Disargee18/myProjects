import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.Timer;

public class TrialTimer extends JFrame
{
    public static void main(String[]args)
    {
        

        // JFrame frame = new JFrame();
        // frame.setVisible(true);
        // frame.setLayout(null);
        // frame.setSize(500, 500);
        

        // JPanel panel = new JPanel();
        // panel.setBounds(0,0,250,250);
        
        // panel.setOpaque(true);
        // panel.setForeground(new Color(0,0,0,0));
        // // panel.setBackground(Color.BLUE);

        // frame.add(panel);

        // Timer timer = new Timer();
        // TimerTask task = new TimerTask()
        // {
        //     int count=0;
        //     int x=40;
        //     @Override
        //     public void run()
        //     {
        //         count++;
        //         if(count%2==1)
        //         {
        //             System.out.println(count);
        //             panel.setBackground(Color.BLUE);
        //         }
        //         if(count%2==0)
        //         {
        //             System.out.println(count);
        //             panel.setBackground(Color.black);
        //         }
        //         if(count==10)
        //         {
        //             timer.cancel();
        //         }
        //     }
        // };

        // timer.scheduleAtFixedRate(task, 0, 1000);


        
        Timer timer = new Timer(1000, new ActionListener()
        {
            int i=0;
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                System.out.println("wow");    
            } 
        });

        Scanner sc = new Scanner(System.in);
        if(sc.nextLine().equals("Yes"))
        {
            timer.start();
        }
        
    }
}
