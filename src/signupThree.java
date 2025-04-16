package BankManagement.src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class signupThree extends JFrame implements ActionListener {

    JRadioButton saving, current , fixed, recurring;
    JCheckBox cheque, internet, mobile, email, cardBox, eBox, h1;
    JButton submit , cancel;
    String formno;

    signupThree(String formno)
    { this.formno = formno;

        setLayout(null);

        JLabel l1 = new JLabel("Page 3: ACCOUNT DETAILS");
        l1.setFont(new Font("Raleway", Font.BOLD, 32));
        l1.setBounds(220, 20, 600, 50);
        add(l1);

        JLabel type = new JLabel("Account Type:");
        type.setFont(new Font("Raleway", Font.BOLD, 24));
        type.setBounds(100, 100, 200, 30);
        add(type);

        saving = new JRadioButton("Saving Account");
        saving.setFont(new Font("Raleway", Font.BOLD, 16));
        saving.setBackground(Color.YELLOW);
        saving.setBounds(100, 140, 200, 30);
        add(saving);

        current = new JRadioButton("Current Account");
        current.setFont(new Font("Raleway", Font.BOLD, 16));
        current.setBackground(Color.YELLOW);
        current.setBounds(350, 140, 200, 30);
        add(current);

        fixed = new JRadioButton("Fixed Deposit Account");
        fixed.setFont(new Font("Raleway", Font.BOLD, 16));
        fixed.setBackground(Color.YELLOW);
        fixed.setBounds(100, 180, 250, 30);
        add(fixed);

        recurring = new JRadioButton("Recurring Deposit Account");
        recurring.setFont(new Font("Raleway", Font.BOLD, 16));
        recurring.setBackground(Color.YELLOW);
        recurring.setBounds(350, 180, 250, 30);
        add(recurring);

        ButtonGroup group = new ButtonGroup();
        group.add(saving);
        group.add(current);
        group.add(fixed);
        group.add(recurring);

        JLabel card = new JLabel("Card Number:");
        card.setBounds(100, 240, 200, 30);
        card.setFont(new Font("Raleway", Font.BOLD, 24));
        add(card);

        JLabel dummy = new JLabel("XXXX-XXXX-XXXX-5679");
        dummy.setBounds(320, 240, 300, 30);
        dummy.setFont(new Font("Raleway", Font.BOLD, 24));
        add(dummy);

        JLabel l2 = new JLabel("Your 16 digit card number");
        l2.setBounds(100, 270, 600, 20);
        l2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(l2);


        JLabel pin = new JLabel("PIN:");
        pin.setBounds(100, 310, 200, 30);
        pin.setFont(new Font("Raleway", Font.BOLD, 24));
        add(pin);

        JLabel pindummy = new JLabel("XXXX");
        pindummy.setBounds(320, 310, 200, 30);
        pindummy.setFont(new Font("Raleway", Font.BOLD, 24));
        add(pindummy);

        JLabel l3 = new JLabel("Your 4 digit password");
        l3.setBounds(100, 340, 600, 20);
        l3.setFont(new Font("Raleway", Font.BOLD, 14));
        add(l3);

        JLabel services = new JLabel("Services Required:");
        services.setBounds(100, 380, 250, 30);
        services.setFont(new Font("Raleway", Font.BOLD, 24));
        add(services);

        cheque = new JCheckBox("Cheque Book");
        cheque.setBackground(Color.YELLOW);
        cheque.setFont(new Font("Raleway", Font.BOLD, 16));
        cheque.setBounds(100, 420, 200, 30);
        add(cheque);

        internet = new JCheckBox("Internet Banking");
        internet.setBackground(Color.YELLOW);
        internet.setFont(new Font("Raleway", Font.BOLD, 16));
        internet.setBounds(350, 420, 200, 30);
        add(internet);

        mobile = new JCheckBox("Mobile Banking");
        mobile.setBackground(Color.YELLOW);
        mobile.setFont(new Font("Raleway", Font.BOLD, 16));
        mobile.setBounds(100, 460, 200, 30);
        add(mobile);

        email = new JCheckBox("Email Alerts");
        email.setBackground(Color.YELLOW);
        email.setFont(new Font("Raleway", Font.BOLD, 16));
        email.setBounds(350, 460, 200, 30);
        add(email);

        cardBox = new JCheckBox("ATM Card");
        cardBox.setBackground(Color.YELLOW);
        cardBox.setFont(new Font("Raleway", Font.BOLD, 16));
        cardBox.setBounds(100, 500, 200, 30);
        add(cardBox);

        eBox = new JCheckBox("Email Statement");
        eBox.setBackground(Color.YELLOW);
        eBox.setFont(new Font("Raleway", Font.BOLD, 16));
        eBox.setBounds(350, 500, 200, 30);
        add(eBox);

        h1 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge.");
        h1.setBackground(Color.YELLOW);
        h1.setFont(new Font("Raleway", Font.BOLD, 14));
        h1.setBounds(100, 540, 650, 30);
        add(h1);

        submit = new JButton("SUBMIT");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(250, 600, 100, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("CANCEL");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(400, 600, 100, 30);
        cancel.addActionListener(this);
        add(cancel);

        setVisible(true);
        setSize(850, 800);
        setLocation(350,100);
        getContentPane().setBackground(Color.YELLOW);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == submit)
       {
        String accountType = null;
        if(saving.isSelected())
        {
            accountType="Saving Account";
        }
        else if(fixed.isSelected())
        {
            accountType="Fixed Deposit Account";
        }
        else if(current.isSelected())
        {
            accountType="Current Account";
        }
        else if(recurring.isSelected())
        {
            accountType="Recurring Deposit Account";
        }

        Random rand = new Random();
        String cardnumber = String.format("%016d", Math.abs(rand.nextLong() % 9000000000000000L) + 1000000000000000L);
        String pinnumber = String.format("%04d", Math.abs(rand.nextInt(9000) + 1000));

        String services = "";
        if(cheque.isSelected()) {
            services += " Cheque Book";
        }
        if(internet.isSelected()) {
            services += " Internet Banking";
        }
        if(mobile.isSelected()) {
            services += " Mobile Banking";
        }
        if(email.isSelected()) {
            services += " Email Alerts";
        }
        if(cardBox.isSelected()) {
            services += " ATM Card";
        }
        if(eBox.isSelected()) {
            services += " Email Statement";
        }

        // You can now use the accountType, cardnumber, pinnumber, and services variables as needed
        // For example, you might want to print them or save them to a database
        System.out.println("Account Type: " + accountType);
        System.out.println("Card Number: " + cardnumber);
        System.out.println("PIN Number: " + pinnumber);
        System.out.println("Services: " + services);


        try{
            if(accountType.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }
            else
            {
            Conn c = new Conn(); // Ensure Conn class is correctly implemented and imported
            String query = "insert into signupthree values('"+ formno + "','" + accountType + "','" + cardnumber + "','"+ pinnumber +"','" + services +"')";
            String query2 = "insert into login values('" + formno + "','" + cardnumber + "','" + pinnumber + "')";
            c.s.executeUpdate(query);
            c.s.executeUpdate(query2);
            setVisible(false);

            JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n PIN: " + pinnumber);
            setVisible(false);
            new deposit(pinnumber).setVisible(true);

            }
            
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
       }else if(e.getSource()==cancel)
       {
            setVisible(false);
            new login().setVisible(true);
       }
        
    }
    public static void main(String[] args) {
        new signupThree(" ");
    }
    
    
}
