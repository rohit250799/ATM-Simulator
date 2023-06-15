package bank.management.system;

import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionListener;
import java.util.*;

public class SignupOne extends JFrame {
    SignupOne(){
        setLayout(null);
        int random_num = (int)Math.abs(Math.random()*1000);
        Font myFont1 = new Font("Serif", Font.ITALIC, 18);
        Font myFont2 = new Font("TimesRoman", Font.PLAIN, 18);

        JLabel form_number = new JLabel("Application form number: "+random_num);
        form_number.setBounds(210, 50, 300, 40);
        form_number.setFont(myFont1);
        form_number.setForeground(Color.BLUE);
        add(form_number);

        JLabel personal_details = new JLabel("Page 1: Personal Details");
        personal_details.setFont(myFont1);
        personal_details.setBounds(230, 100, 350, 30);
        add(personal_details);

        JLabel name = new JLabel("NAME: ");
        name.setBounds(180, 170, 140, 20);
        JTextField first_textField = new JTextField("Enter name: ");
        first_textField.setBounds(330, 170, 200, 20);
        first_textField.setFont(myFont2);
        add(name);
        add(first_textField);

        JLabel guardian_name = new JLabel("Guardian's Name: ");
        guardian_name.setBounds(180, 220, 140, 20);
        JTextField second_textfield = new JTextField("Guardian's name: ");
        second_textfield.setBounds(330, 220, 200, 20);
        second_textfield.setFont(myFont2);
        add(guardian_name);
        add(second_textfield);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setBounds(180, 260, 140, 20);
        JDateChooser dc = new JDateChooser();
        dc.setBounds(330, 260, 200, 20);
        dc.setForeground(new Color(167, 40, 78));
        add(dob);
        add(dc);

        JLabel gender = new JLabel("Gender: ");
        gender.setBounds(180, 300, 140, 20);
        JRadioButton male_button = new JRadioButton("Male");
        male_button.setBounds(330, 300, 100, 20);
        male_button.setBackground(Color.LIGHT_GRAY);
        JRadioButton female_button = new JRadioButton("Female");
        female_button.setBounds(450, 300, 80, 20);
        female_button.setBackground(Color.LIGHT_GRAY);
        ButtonGroup gender_group = new ButtonGroup();
        gender_group.add(male_button);
        gender_group.add(female_button);
        add(gender);
        add(male_button);
        add(female_button);

        JLabel email_id = new JLabel("Email: ");
        email_id.setBounds(180, 340, 140, 20);
        JTextField fifth_textfield = new JTextField("Mail id: ");
        fifth_textfield.setBounds(330, 340, 200, 20);
        add(email_id);
        add(fifth_textfield);

        JLabel address = new JLabel("Address: ");
        address.setBounds(180, 380, 140, 20);
        JTextField sixth_textfield = new JTextField("Enter Address: ");
        sixth_textfield.setBounds(330, 380, 200, 20);
        add(address);
        add(sixth_textfield);

        JLabel city = new JLabel("City: ");
        city.setBounds(180, 420, 140, 20);
        JTextField seventh_textfield = new JTextField("Enter City: ");
        seventh_textfield.setBounds(330, 420, 200, 20);
        add(city);
        add(seventh_textfield);

        JLabel state = new JLabel("State: ");
        state.setBounds(180, 460, 140, 20);
        JTextField eighth_textfield = new JTextField("Enter DOB: ");
        eighth_textfield.setBounds(330, 460, 200, 20);
        add(state);
        add(eighth_textfield);

        JButton next_button = new JButton("NEXT");
        next_button.setBounds(500, 500, 100, 30);
        next_button.setBackground(Color.BLACK);
        next_button.setForeground(Color.WHITE);
        add(next_button);

        getContentPane().setBackground(Color.LIGHT_GRAY);
        setBounds(200, 30, 700, 600);
        setTitle("SIGN UP");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new SignupOne();
    }
}
