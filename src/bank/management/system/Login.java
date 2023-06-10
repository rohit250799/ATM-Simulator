package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    Login(){
//The next 3 lines are to be written first as if it is not done, the image is not loaded.
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/Bank_image.jpg"));
        JLabel myLabel = new JLabel(icon);
        add(myLabel);
        Image myImage = icon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon icon2 = new ImageIcon(myImage);
//We can place an ImageIcon inside Jlabel but we cant place an image and to solve this problem, we convert an image into an imageIcon

        setSize(800, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(150, 70);
        setTitle("ATM Machine");
    }
    public static void main(String[] args) {
        new Login(); //creating an object of class
    }
}
