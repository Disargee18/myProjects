import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
import java.util.TimerTask;

public class SimonGame extends JFrame implements ActionListener
{
    //data fields
    JLabel title = new JLabel();

    JButton bluePane = new JButton();
    JButton redPane = new JButton();
    JButton yellowPane = new JButton();
    JButton greenPane = new JButton();
    JButton button1 = new JButton();
    JButton button2 = new JButton();

    ArrayList<String> answerKey = new ArrayList<String>();
    ArrayList<String> playerAnswer = new ArrayList<String>();
    int rounds = 1;
    boolean isGameOver = false;
    int numClick=0;
    int countMain=0;

    Timer timer;
    Timer mainTimer;
    int count=0;
    TimerTask task;
    Timer timer1,timer2,timer3,timer4;


    public SimonGame()
    {
        button1.setBounds(100,200,125,50);
        button1.setAlignmentX(CENTER_ALIGNMENT);
        button1.setText("Start Game");
        button1.addActionListener(this);

        button2.setBounds(290,200,125,50);
        button2.setAlignmentX(CENTER_ALIGNMENT);
        button2.setText("Exit");
        button2.addActionListener(this);

        bluePane.setBackground(Color.BLUE);
        bluePane.setBounds(0,0,250,250);
        bluePane.addActionListener(this);

        redPane.setBackground(Color.RED);
        redPane.setBounds(0,250,250,250);
        redPane.addActionListener(this);

        yellowPane.setBackground(Color.YELLOW);
        yellowPane.setBounds(250,0,250,250);
        yellowPane.addActionListener(this);

        greenPane.setBackground(Color.GREEN);
        greenPane.setBounds(250,250,250,250);
        greenPane.addActionListener(this);

        this.setVisible(true);
        this.setResizable(true);
        this.setSize(515,535);
        this.setLayout(null);
        this.setTitle("Simon Game");

    }

    public void HomePage()
    {
        title.setText("Welcome to Simon Game");
        title.setBounds(100,-150,500,500);
        
        title.setFont(new Font("Times New Roman",Font.PLAIN,30));

        this.add(button1);
        this.add(button2);
        this.add(title);
        button1.setVisible(true);
        button2.setVisible(true);
        title.setVisible(true);

    }

    public void StartGame()
    {
        this.add(bluePane);
        this.add(yellowPane);
        this.add(redPane);
        this.add(greenPane);
        // FlashOut();
        // FlashSequence();
    }

    public void addSequence()
    {
        int rand = (int)(Math.random()*(4-1+1))+1;

        switch(rand)
        {
            case 1 -> answerKey.add("Blue");
            case 2 -> answerKey.add("Red");
            case 3 -> answerKey.add("Yellow");
            case 4 -> answerKey.add("Green");
        }
        FlashSequence();
    }

    public boolean validateAnswer()
    {
        boolean isRight = true;
        for(int i=0; i<playerAnswer.size();i++)
        {
            if(playerAnswer.get(i).equals(answerKey.get(i)))
            {

            }
            else
            {
                isRight=false;
                numClick=0;
                rounds=1;
                playerAnswer.clear();
                answerKey.clear();
                bluePane.setVisible(false);
                yellowPane.setVisible(false);
                greenPane.setVisible(false);
                redPane.setVisible(false);
                HomePage();
            }

        }
        return isRight;
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==bluePane)
        {
            playerAnswer.add("Blue");
            numClick++;
            // System.out.println("Player Answer: "+playerAnswer);
            validateAnswer();
            if (numClick==rounds) 
            {
                rounds++;
                numClick=0;
                addSequence();
                playerAnswer.clear();
                System.out.println("Random Colors: "+answerKey);           
            }
            StartGame();
        }
        if(e.getSource()==greenPane)
        {
            playerAnswer.add("Green");
            numClick++;
            // System.out.println("Player Answer: "+playerAnswer);
            validateAnswer();
            if (numClick==rounds) 
            {
                rounds++;
                numClick=0;
                addSequence();
                playerAnswer.clear();
                System.out.println("Random Colors: "+answerKey);
            }
            StartGame();
        }
        if(e.getSource()==redPane)
        {
            playerAnswer.add("Red");
            numClick++;
            // System.out.println("Player Answer: "+playerAnswer);
            validateAnswer();
            if (numClick==rounds) 
            {
                rounds++;
                numClick=0;
                addSequence();
                playerAnswer.clear();
                System.out.println("Random Colors: "+answerKey);            
            }
            StartGame();
        }
        if(e.getSource()==yellowPane)
        {
            playerAnswer.add("Yellow");
            numClick++;
            // System.out.println("Player Answer: "+playerAnswer);
            validateAnswer();
            if (numClick==rounds) 
            {
                rounds++;
                numClick=0;
                addSequence();
                playerAnswer.clear();
                System.out.println("Random Colors: "+answerKey);
            }
            StartGame();
        }

        if(e.getSource()==button1)
        {
            button1.setVisible(false);
            button1.invalidate();
            button2.setVisible(false);
            button1.invalidate();
            title.setVisible(false);

            bluePane.setVisible(true);
            yellowPane.setVisible(true);
            greenPane.setVisible(true);
            redPane.setVisible(true);

            addSequence();
            System.out.println("Random Colors: "+answerKey);
            StartGame();
        }

        if(e.getSource()==button2)
        {
            this.dispose();
        }

    }

    // public void FlashOut()
    // {
    //     timer = new Timer(100, new ActionListener()
    //     {
    //         int x = 0;
    //         public void actionPerformed(ActionEvent ae)
    //         {
    //             switch (answerKey.get(numClick)) {
    //                 case "Blue":
    //                     bluePane.setBackground(Color.BLACK);
    //                     x++;
    //                     if(x==10)
    //                     {
    //                         FlashIn();
    //                         // FlashSequence();
    //                         timer.stop();
    //                     } 
    //                     break;
    //                 case "Red":
    //                     redPane.setBackground(Color.BLACK);
    //                     x++;
    //                     if(x==10)
    //                     {
    //                         FlashIn();
    //                         // FlashSequence();
    //                         timer.stop();
    //                     } 
    //                     break;
    //                 case "Yellow":
    //                     yellowPane.setBackground(Color.BLACK);
    //                     x++;
    //                     if(x==10)
    //                     {
    //                         FlashIn();
    //                         // FlashSequence();
    //                         timer.stop();
    //                     } 
    //                     break;
    //                 case "Green":
    //                     greenPane.setBackground(Color.BLACK);
    //                     x++;
    //                     if(x==10)
    //                     {
    //                         FlashIn();
    //                         // FlashSequence();
    //                         timer.stop();
    //                     }
    //                     break;
                        
    //             }
    //         }
    //     });
    //     timer.start();
    // }

    // public void FlashIn()
    // {
    //     switch (answerKey.get(numClick)) {
    //         case "Blue" -> bluePane.setBackground(Color.BLUE);
    //         case "Red" -> redPane.setBackground(Color.RED);
    //         case "Green" -> greenPane.setBackground(Color.GREEN);
    //         case "Yellow" -> yellowPane.setBackground(Color.YELLOW);
    //     }
    // }

    public void FlashSequence()
    {
        mainTimer = new Timer(1000, new ActionListener() 
        {
            int i=0;
            int x=0;
            public void actionPerformed(ActionEvent ae)
            {
                switch(answerKey.get(i))
                {
                    case "Blue":
                        bluePane.setBackground(Color.BLACK);
                        timer1 = new Timer(1000, new ActionListener() 
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                bluePane.setBackground(Color.blue);
                                timer1.stop();
                            }
                        });timer1.start();
                        break;
                    case "Red":
                        redPane.setBackground(Color.BLACK);
                        timer2 = new Timer(1000, new ActionListener() 
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                redPane.setBackground(Color.red);
                                timer2.stop();
                            }
                        });timer2.start();
                        break;
                    case "Green":
                        greenPane.setBackground(Color.BLACK);
                        timer3 = new Timer(1000, new ActionListener() 
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                greenPane.setBackground(Color.green);
                                timer3.stop();
                            }
                        });timer3.start();                        
                        break;
                    case "Yellow":
                        yellowPane.setBackground(Color.BLACK);
                        timer4 = new Timer(1000, new ActionListener() 
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                yellowPane.setBackground(Color.yellow);
                                timer4.stop();
                            }
                        });timer4.start();
                        break;
                }
                i++;

                if(i==answerKey.size())
                {
                    mainTimer.stop();
                }
                
            }
        });
        mainTimer.start();
    }
}

