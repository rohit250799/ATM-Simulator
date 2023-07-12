package bank.management.system;

import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class SignupOne extends JFrame implements ActionListener{
    long random_num;
    JTextField first_textField,second_textfield,fifth_textfield,sixth_textfield,seventh_textfield,eighth_textfield;
    JButton next_button;
    JRadioButton male_button, female_button;
    JDateChooser dc;
    SignupOne(){
        setLayout(null);
        random_num = (long)Math.abs(Math.random()*1000);
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
        first_textField = new JTextField();
        first_textField.setBounds(330, 170, 200, 20);
        first_textField.setFont(myFont2);
        add(name);
        add(first_textField);

        JLabel guardian_name = new JLabel("Guardian's Name: ");
        guardian_name.setBounds(180, 220, 140, 20);
        second_textfield = new JTextField();
        second_textfield.setBounds(330, 220, 200, 20);
        second_textfield.setFont(myFont2);
        add(guardian_name);
        add(second_textfield);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setBounds(180, 260, 140, 20);
        dc = new JDateChooser();
        dc.setBounds(330, 260, 200, 20);
        dc.setForeground(new Color(100, 18, 43));
        add(dob);
        add(dc);

        JLabel gender = new JLabel("Gender: ");
        gender.setBounds(180, 300, 140, 20);
        male_button = new JRadioButton("Male");
        male_button.setBounds(330, 300, 100, 20);
        male_button.setBackground(Color.LIGHT_GRAY);
        female_button = new JRadioButton("Female");
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
        fifth_textfield = new JTextField();
        fifth_textfield.setBounds(330, 340, 200, 20);
        add(email_id);
        add(fifth_textfield);

        JLabel address = new JLabel("Address: ");
        address.setBounds(180, 380, 140, 20);
        sixth_textfield = new JTextField();
        sixth_textfield.setBounds(330, 380, 200, 20);
        add(address);
        add(sixth_textfield);

        JLabel city = new JLabel("City: ");
        city.setBounds(180, 420, 140, 20);
        seventh_textfield = new JTextField();
        seventh_textfield.setBounds(330, 420, 200, 20);
        add(city);
        add(seventh_textfield);

        JLabel state = new JLabel("State: ");
        state.setBounds(180, 460, 140, 20);
        eighth_textfield = new JTextField();
        eighth_textfield.setBounds(330, 460, 200, 20);
        add(state);
        add(eighth_textfield);

        next_button = new JButton("NEXT");
        next_button.setBounds(500, 500, 100, 30);
        next_button.setBackground(Color.BLACK);
        next_button.setForeground(Color.WHITE);
        add(next_button);
        next_button.addActionListener(this);

        getContentPane().setBackground(Color.LIGHT_GRAY);
        setBounds(200, 30, 700, 600);
        setTitle("SIGN UP");
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        String form_no = "" +random_num;
        String name = first_textField.getText();
        String fr_name = second_textfield.getText();

        String dob = ((JTextField) dc.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male_button.isSelected()) gender = "Male";
        else gender = "Female";

        String email =  fifth_textfield.getText();
        String address = sixth_textfield.getText();
        String city = seventh_textfield.getText();
        String state = eighth_textfield.getText();

        try {
            if (name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is required");
            }
            else{
                Conn c = new Conn();
                String query = "insert into signup values('"+form_no+"', '"+name+"', '"+fr_name+"', '"+dob+"', '"+gender+"', '"+email+"', '"+address+"', '"+city+"', '"+state+"');";
                //The above line is used to run a string query as a SQL command to insert data into the database with table name "signup" and '"+form_no+"' etc. is used to store the
                //form_no inside a variable which again in turn is stored inside a string variable as its value
                c.s.executeUpdate(query); //executing the
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new SignupOne();
    }
}
