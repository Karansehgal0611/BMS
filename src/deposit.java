package BankManagement.src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.util.*;


public class deposit extends JFrame implements ActionListener{

    JButton deposit, back;
    JTextField amount;
    String pinnumber;

    deposit(String pinnumber)
    {
        this.pinnumber = pinnumber;
        setLayout(null);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("BankManagement/src/3923.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel l1 = new JLabel("Enter Amount you want to Deposit:");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(200, 300, 400, 40);
        image.add(l1);

        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 22));
        amount.setBounds(200, 350, 300, 30);
        image.add(amount);

        deposit = new JButton("DEPOSIT");
        deposit.setBackground(Color.WHITE);
        deposit.setForeground(Color.BLACK);
        deposit.setBounds(350, 525, 150, 30);
        deposit.addActionListener(this);
        image.add(deposit);

        back = new JButton("BACK");
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setBounds(350, 560, 150, 30);
        back.addActionListener(this);
        image.add(back);




        setTitle("Deposit");
        setSize(900, 900);
        setLocation(300, 0);
        //setUndecorated(true);
        setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == back)
        {
            new transaction(pinnumber).setVisible(true);
            setVisible(false);
        }
        else if(e.getSource()== deposit)
        {
            String dep =  amount.getText();
            Date date = new Date();
            if(dep.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Deposit");
            }
            else{
                Conn c = new Conn();
                String query ="insert into bank values('"+pinnumber+"', '"+date+"', 'Deposit', '"+dep+"')";
                try{
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs. "+dep+" Deposited Successfully");
                    setVisible(false);
                    new transaction(pinnumber).setVisible(true);    
                }
                catch(Exception ex)
                {
                    System.out.println(ex);
                }
            }


        }

        
    }
    public static void main(String[] args) {
        System.out.println("Deposit");
        new deposit("");
    }
}
