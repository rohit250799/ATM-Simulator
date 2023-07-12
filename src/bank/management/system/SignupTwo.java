package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupTwo extends JFrame implements ActionListener {
    long random_num;
    JComboBox religion_dropdown, category_dropdown, income_dropdown, qualification_dropdown, occupation_dropdown;
    JTextField pan_textfield,aadhar_textfield;
    JButton next_button;
    JRadioButton yes_button, no_button;
    SignupTwo(){
        setLayout(null);
        setTitle("New Account Application Form Page - 2");
        Font myFont1 = new Font("Serif", Font.ITALIC, 18);
        Font myFont2 = new Font("TimesRoman", Font.PLAIN, 18);

        JLabel additionalDetails  = new JLabel("Page 2 - Additional Details");
        additionalDetails.setFont(myFont2);
        additionalDetails.setBounds(230, 50, 250, 30);
        add(additionalDetails);

        JLabel religion = new JLabel("Religion: ");
        religion.setBounds(180, 140, 140, 20);
        String[] value_religion = {"Hindu", "Muslim", "Christian", "Sikh", "Others"};
        religion_dropdown = new JComboBox(value_religion);
        religion_dropdown.setBounds(330, 140, 200, 20);
        religion_dropdown.setBackground(Color.WHITE);
        add(religion);
        add(religion_dropdown);

        JLabel category = new JLabel("Category: ");
        category.setBounds(180, 190, 140, 20);
        String[] value_category = {"General", "Sc", "St", "OBC"};
        category_dropdown = new JComboBox(value_category);
        category_dropdown.setBounds(330, 190, 200, 20);
        category_dropdown.setBackground(Color.WHITE);
        add(category);
        add(category_dropdown);

        JLabel income = new JLabel("Income: ");
        income.setBounds(180, 230, 140, 20);
        String[] value_incomes = {"Null", "<1,50,000", "<=2,50,000", ">2,50,000"};
        income_dropdown = new JComboBox(value_incomes);
        income_dropdown.setBounds(330, 230, 200, 20);
        income_dropdown.setBackground(Color.WHITE);
        add(income);
        add(income_dropdown);

        JLabel qualification = new JLabel("Qualification: ");
        qualification.setBounds(180, 270, 140, 20);
        String[] value_qualifications = {"Matric Pass", "Graduate", "Post Graduate", "Ph. D", "Others"};
        qualification_dropdown = new JComboBox(value_qualifications);
        qualification_dropdown.setBounds(330, 270, 200, 20);
        qualification_dropdown.setBackground(Color.WHITE);
        add(qualification);
        add(qualification_dropdown);

        JLabel occupation = new JLabel("Occupation");
        occupation.setBounds(180, 350, 140, 20);
        String[] val_occupation = {"Student","Retired","Doctor", "Engineer", "Business", "Service", "Unemployed", "Other"};
        occupation_dropdown = new JComboBox(val_occupation);
        occupation_dropdown.setBounds(330, 350, 200, 20);
        occupation_dropdown.setBackground(Color.WHITE);
        add(occupation);
        add(occupation_dropdown);

        JLabel pan_number = new JLabel("Pan Number: ");
        pan_number.setBounds(180, 390, 140, 20);
        pan_textfield = new JTextField();
        pan_textfield.setBounds(330, 390, 200, 20);
        add(pan_number);
        add(pan_textfield);

        JLabel aadhar_number = new JLabel("Aadhar Number: ");
        aadhar_number.setBounds(180, 430, 140, 20);
        aadhar_textfield = new JTextField();
        aadhar_textfield.setBounds(330, 430, 200, 20);
        add(aadhar_number);
        add(aadhar_textfield);

        JLabel senior_citizen = new JLabel("Senior Citizen: ");
        senior_citizen.setBounds(180, 470, 140, 20);
        yes_button = new JRadioButton("YES");
        yes_button.setBounds(330, 470, 100, 20);
        yes_button.setBackground(Color.LIGHT_GRAY);
        no_button = new JRadioButton("NO");
        no_button.setBackground(Color.LIGHT_GRAY);
        no_button.setBounds(450, 470, 100, 20);
        ButtonGroup senior_citizenGroup = new ButtonGroup();
        senior_citizenGroup.add(yes_button);
        senior_citizenGroup.add(no_button);
        add(senior_citizen);
        add(yes_button);
        add(no_button);

        next_button = new JButton("NEXT");
        next_button.setBounds(500, 500, 100, 30);
        next_button.setBackground(Color.BLACK);
        next_button.setForeground(Color.WHITE);
        add(next_button);
        next_button.addActionListener(this);

        getContentPane().setBackground(Color.LIGHT_GRAY);
        setBounds(200, 30, 700, 600);
        //setTitle("SIGN UP");
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        String religion = (String) religion_dropdown.getSelectedItem();
        String category = (String) category_dropdown.getSelectedItem();

        /*String gender = null;
        if (male_button.isSelected()) gender = "Male";
        else gender = "Female";*/

        String income = (String) income_dropdown.getSelectedItem();
        String qualification = (String) qualification_dropdown.getSelectedItem();
        String occupation = (String) occupation_dropdown.getSelectedItem();
        String pan_number = pan_textfield.getText();
        String aadhar_number = aadhar_textfield.getText();
        String senior_citizen = null;
        if (yes_button.isSelected()) senior_citizen = "Yes";
        senior_citizen = "No";

        try {
            if (income.equals("")||pan_number.equals("")||aadhar_number.equals("")){
                JOptionPane.showMessageDialog(null, "Income/Pan/Aadhar is required");
            }
            else{
                Conn c = new Conn();
                String query = "insert into signupTwo values('"+religion+"', '"+category+"', '"+income+"', '"+qualification+"', '"+occupation+"', '"+pan_number+"', '"+aadhar_number+"', '"+senior_citizen+"');";
                //The above line is used to run a string query as a SQL command to insert data into the database with table name "signup" and '"+form_no+"' etc. is used to store the
                //form_no inside a variable which again in turn is stored inside a string variable as its value
                c.s.executeUpdate(query); //executing the
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new SignupTwo();
    }
}
