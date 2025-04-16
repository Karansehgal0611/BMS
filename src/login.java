package BankManagement.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class login extends JFrame implements ActionListener {

    JButton login, clear, signup;   //buttons globally defined to be used in actionPerformed method
    JTextField CardText;   //textboxes globally defined to be used in actionPerformed method
    JPasswordField pinText;
    login()
    {
        setTitle("ATM Management System");

        setLayout(null);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("BankManagement/src/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label1 = new JLabel(i3);
        label1.setBounds(10,10,100,100);
        add(label1);
        
        //welcome to ATM header
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,50);
        add(text);
        getContentPane().setBackground(Color.YELLOW);

        
        //Card No. label
        JLabel cardno = new JLabel("Card No. ");
        cardno.setFont(new Font("Raleway",Font.BOLD,24));
        cardno.setBounds(150,160,400,50);
        add(cardno);
        
        //pin no. label
        JLabel pin = new JLabel("PIN No. ");
        pin.setFont(new Font("Raleway",Font.BOLD,24));
        pin.setBounds(150,240,400,50);
        add(pin);

        //textbox for card no.
        CardText = new JTextField();
        CardText.setBounds(300, 160, 300,40);
        CardText.setFont(new Font("Arial",Font.BOLD,20));
        add(CardText);

        //textbox for pin no.
        pinText = new JPasswordField();
        pinText.setBounds(300, 240, 300,40);
        add(pinText);

        //Buttons
        login = new JButton("LOGIN");   //login button
        login.setBackground(Color.BLACK);   
        login.setForeground(Color.WHITE);
        login.setBounds(300, 320, 100, 40);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");   //signup button
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.setBounds(430, 320, 100, 40);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");   //signup button
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.setBounds(300, 380, 230, 40);
        signup.addActionListener(this);
        add(signup);


        setSize(800,480);
        setLocation(350,200); // frame location
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == login)
        {
            System.out.println("Login Button Clicked");
            Conn c = new Conn();
            String CardNo = CardText.getText();
            String pin = new String(pinText.getPassword());
            String query = "select * from login where cardnumber = '"+CardNo+"' and pin = '"+pin+"'";
            try
            {
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next())
                {
                    new transaction(pin).setVisible(true);
                    setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Invalid Card No. or Pin");
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

        }
        else if(ae.getSource() == clear)
        {
            CardText.setText("");
            pinText.setText("");
            System.out.println("Clear Button Clicked");
        }
        else if(ae.getSource() == signup)
        {
            System.out.println("Signup Button Clicked");
            setVisible(false);
            new signupOne().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new login();
    }
}
