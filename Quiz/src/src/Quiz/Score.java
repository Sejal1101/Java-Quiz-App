package Quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {

    Score(String name , int score){

        setBounds(400,150,750,550); // mixture of setsize and setlocation

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon iI = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));// to pick image from given location
        Image i2 = iI.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);


        JLabel image = new JLabel(i3);
        image.setBounds(0,200 ,300 , 250);
        add(image);


        JLabel heading =  new JLabel("Thankyou "+name + " for playing Simple Minds");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(heading);

        JLabel scoreText =  new JLabel("Your score is "+ score);
        scoreText.setBounds(350,200,300,30);
        scoreText.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(scoreText);

        JButton submit = new JButton("Play Again");
        submit.setBounds(380,270,120,30);
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);

        add(submit);

        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){

        setVisible(false);
        new Login();

    }
    public static void main(String[] args) {
        Score sc = new Score("User", 0);


    }
}
