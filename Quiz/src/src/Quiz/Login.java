package Quiz;

import javax.swing.*; // jframe class extended from here
import java.awt.*; //  for color class
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; // to import interface to work with onclick function

import java.sql.*;


public class Login extends JFrame implements ActionListener { // jframe to create frame



     JButton rules , back; // globally defined to be used in the actionPerformed function
     JTextField tfname; // to use in Rules heading
    Login(){
        // frame coding
        getContentPane().setBackground(Color.MAGENTA); // to pick whole frame and background give color
        // by default image is at center but we want to set layout for images , either we can use pre defined layouts by swing or can create our own

        // creating our own layout

        setLayout(null);

        ImageIcon iI = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));// to pick image from given location
        // classLoader to pick image and getSystemResource is static fn where we pass location

        JLabel image = new JLabel(iI); // we cannot pass directly the component , need to create JLabel object

        image.setBounds(0,0 ,600 , 500);


        add(image); // pass component over frame

        JLabel heading = new JLabel("Simple Minds"); // JLabel mainly used to give headings
        heading.setBounds(750,60 , 300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(30 , 144, 250)); // can pass color using rgb by creating color object
        add(heading);

        JLabel name = new JLabel("Enter your name"); // JLabel mainly used to give headings
        name.setBounds(810,150 , 300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(new Color(30 , 144, 250)); // can pass color using rgb by creating color object
        add(name);

        // To add textField

        tfname = new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman" , Font.BOLD ,20));
        add(tfname);

        // to create button

        rules = new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this); // onclick fn
        add(rules);

        back = new JButton("Back");
        back.setBounds(915,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);






        setSize(1000,500); //  change size of frame
        setLocation(400 , 200); // change location of frame

        setVisible(true); // to see frame
    }

    public void actionPerformed(ActionEvent ae) { // need to override abstract method to use implements

        // what action to be performed on click of which button
        if(ae.getSource() == rules) {
            String name = tfname.getText(); // to get value whatever user has entered
            setVisible(false);
            new Rules(name); // call Rules class

        } else if(ae.getSource() == back){ // differentiating back from rule button
            setVisible(false); // on back button click hide frame
        }

    }
    public static void main(String[] args) {

        Login userName = new Login(); // create object

        //String name = userName.tfname.getText();
    }

}
