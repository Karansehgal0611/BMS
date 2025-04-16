package BankManagement.src;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class transaction extends JFrame implements ActionListener {

    JButton deposit, withdraw, fastCash, miniStatement, pinchange, balance, exit;
    String pinnumber;
    transaction(String pinnumber)
    {
        this.pinnumber = pinnumber;

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("BankManagement/src/3923.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(210, 300, 400, 40);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);

        deposit = new JButton("DEPOSIT");
        deposit.setBackground(Color.white);
        deposit.setForeground(Color.BLACK);
        deposit.setBounds(170, 448, 150, 30);
        deposit.addActionListener(this);
        image.add(deposit);

        withdraw = new JButton("WITHDRAW");
        withdraw.setBackground(Color.white);
        withdraw.setForeground(Color.BLACK);
        withdraw.setBounds(350, 448, 150, 30);
        withdraw.addActionListener(this);
        image.add(withdraw);

        fastCash = new JButton("FAST CASH");
        fastCash.setBackground(Color.white);
        fastCash.setForeground(Color.BLACK);
        fastCash.setBounds(170, 483, 150, 30);
        fastCash.addActionListener(this);
        image.add(fastCash);

        miniStatement = new JButton("MINI STATEMENT");
        miniStatement.setBackground(Color.white);
        miniStatement.setForeground(Color.BLACK);
        miniStatement.setBounds(350, 483, 150, 30);
        miniStatement.addActionListener(this);
        image.add(miniStatement);

        pinchange = new JButton("PIN CHANGE");
        pinchange.setBackground(Color.white);
        pinchange.setForeground(Color.BLACK);
        pinchange.setBounds(170, 518, 150, 30);
        pinchange.addActionListener(this);
        image.add(pinchange);

        balance = new JButton("BALANCE ENQUIRY");
        balance.setBackground(Color.white);
        balance.setForeground(Color.BLACK);
        balance.addActionListener(this);
        balance.setBounds(350, 518, 150, 30);
        image.add(balance);
        
        exit = new JButton("EXIT");
        exit.setBackground(Color.white);
        exit.setForeground(Color.BLACK);
        exit.setBounds(260, 553, 150, 30);
        exit.addActionListener(this);
        image.add(exit);


        setTitle("Transaction");
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==exit)
        {
            System.exit(0);
        }
        if(e.getSource()==deposit)
        {
            new deposit(pinnumber).setVisible(true);
            setVisible(false);
        }
        if(e.getSource()==withdraw)
        {
            new withdrawal(pinnumber).setVisible(true);
            setVisible(false);
        }

    }
    public static void main(String[] args) {
        new transaction("   ");
    }


    
}
