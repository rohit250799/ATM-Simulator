package bank.management.system;

import java.awt.event.*;
import  java.util.*;
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame implements ActionListener {
   JButton login_button, clear_button, signup_button;
   JTextField first_textfield, second_textfield;
   Login(){
//The next 3 lines are to be written first as if it is not done, the image is not loaded.
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/Bank_image.jpg"));
        Image myImage = icon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon icon2 = new ImageIcon(myImage);
//With the help of Jlabel, we can write any content on the frame

        JLabel myLabel = new JLabel(icon2);
        myLabel.setBounds(70, 20, 240, 150);
        add(myLabel);
//To create buttons, we can use the JButton class in Java
        login_button = new JButton("LOGIN");
        login_button.setBackground(Color.LIGHT_GRAY);
        login_button.setBounds(450, 300, 80, 30);
        login_button.addActionListener(this);
        add(login_button);

        clear_button = new JButton("CLEAR");
        clear_button.setBackground(Color.LIGHT_GRAY);
        clear_button.setBounds(570, 300, 80, 30);
        clear_button.addActionListener(this);
        add(clear_button);

        signup_button = new JButton("SIGN UP");
        signup_button.setBackground(Color.LIGHT_GRAY);
        signup_button.setBounds(500, 350, 100, 30);
        signup_button.addActionListener(this);
        add(signup_button);

        getContentPane().setBackground(Color.WHITE);
//We can place an ImageIcon inside Jlabel but we cant place an image and to solve this problem, we convert an image into an imageIcon
        Font myFont1 = new Font("Serif", Font.ITALIC, 23);
        Font myFont2 = new Font("Raleway", Font.BOLD, 20);

        JLabel first_text = new JLabel("Welcome to State Bank ATM");
        first_text.setBounds(300, 30, 350, 100);
        first_text.setFont(myFont1);
        add(first_text);
//We can accept input from the user using a JTextField class inside a JLabel

        JLabel cardno_label = new JLabel("Card number: ");
        cardno_label.setBounds(150, 200, 200, 40);
        first_textfield = new JTextField("Enter the CARD Number");
        first_textfield.setBounds(450,200, 200, 40);
        first_textfield.setVisible(true);
        cardno_label.setFont(myFont2);
        add(cardno_label);
        add(first_textfield);

        JLabel pinno_label = new JLabel("PIN number: ");
        pinno_label.setBounds(150, 240, 320, 40);
        second_textfield = new JTextField("Enter the PIN Number");
        second_textfield.setBounds(450, 250, 200, 40);
        second_textfield.setVisible(true);
        pinno_label.setFont(myFont2);
        add(pinno_label);
        add(second_textfield);

        setLayout(null);
        setSize(800, 450);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLocation(150, 70);
        setLocationRelativeTo(null);
        setTitle("ATM Machine");
    }

   @Override
   public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == login_button){

        }
        if (ae.getSource() == clear_button){
             first_textfield.setText("");
             second_textfield.setText("");
        }
        if (ae.getSource() == signup_button){
             setVisible(false);
             new SignupOne().setVisible(true);
        }
   }

    public static void main(String[] args) {

        new Login(); //creating an object of class
    }


}
