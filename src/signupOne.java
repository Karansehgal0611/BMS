package BankManagement.src;

import javax.swing.*;  //importing swing package
import java.awt.*;   //importing awt package
import java.awt.event.*;  //importing event package
import java.util.*;
import com.toedter.calendar.JDateChooser; //importing JDateChooser package


public class signupOne extends JFrame implements ActionListener {

    long g;

    private JTextField nameField, FatherNameField, emailField, addressField, cityField, stateField, pincodeField;
    private JDateChooser dateChooser;
    private JRadioButton male, female, married, unmarried, other;
    private JButton next;

    signupOne()
    {
        setLayout(null); // Setting layout to null for absolute positioning

        Random ran = new Random();
        g = Math.abs(ran.nextLong() % 9000L) + 1000L;

        JLabel label1 = new JLabel("APPLICATION FORM NO. " + g); // Changed text); Random Application NUmber Each Time
        label1.setFont(new Font("Osward", Font.BOLD, 38));
        label1.setBounds(130, 10, 600, 150); // Adjusted position and size
        add(label1);
        
        JLabel personalDetails = new JLabel("Page 1: PERSONAL DETAILS");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 28));
        personalDetails.setBounds(240, 120, 600, 50);
        add(personalDetails);

        JLabel name = new JLabel("NAME: ");
        name.setFont(new Font("Raleway", Font.BOLD, 24));
        name.setBounds(80,180,300,50);
        add(name);

        nameField = new JTextField();
        nameField.setFont(new Font("Arial", Font.BOLD, 24));
        nameField.setBounds(350,180,400,40);
        add(nameField);

        JLabel FatherName = new JLabel("FATHER'S NAME: ");
        FatherName.setFont(new Font("Raleway", Font.BOLD, 24));
        FatherName.setBounds(80,230,300,50);
        add(FatherName);  
        
        FatherNameField = new JTextField();
        FatherNameField.setFont(new Font("Arial", Font.BOLD, 24));
        FatherNameField.setBounds(350,230,400,40);
        add(FatherNameField);   

        JLabel DOB = new JLabel("DATE OF BIRTH: ");
        DOB.setFont(new Font("Raleway", Font.BOLD, 24));
        DOB.setBounds(80,280,300,50);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(350, 280, 200, 40);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        

        JLabel gender = new JLabel("GENDER: ");
        gender.setFont(new Font("Raleway", Font.BOLD,24));
        gender.setBounds(80,330,300,50);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(350,330,80,45);
        male.setBackground(Color.YELLOW);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450,330,80,45);
        female.setBackground(getForeground());
        add(female);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        JLabel email = new JLabel("EMAIL ADDRESS: ");
        email.setFont(new Font("Raleway", Font.BOLD,24));
        email.setBounds(80,380,300,50);
        add(email);

        emailField = new JTextField();
        emailField.setFont(new Font("Arial", Font.BOLD, 24));
        emailField.setBounds(350,380,400,40);
        add(emailField);

        JLabel marital = new JLabel("MARITAL STATUS: ");
        marital.setFont(new Font("Raleway", Font.BOLD,24));
        marital.setBounds(80,430,300,50);
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(350, 430, 100, 45);
        married.setBackground(Color.YELLOW);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(460, 430, 120, 45);
        unmarried.setBackground(Color.YELLOW);
        add(unmarried);

        other = new JRadioButton("Other");
        other.setBounds(600,430,100,45);
        other.setBackground(Color.YELLOW);
        add(other);

        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);

        JLabel address = new JLabel("ADDRESS: ");
        address.setFont(new Font("Raleway", Font.BOLD,24));
        address.setBounds(80,480,300,50);
        add(address);

        addressField = new JTextField();
        addressField.setFont(new Font("Arial", Font.BOLD, 24));
        addressField.setBounds(350,480,400,40);
        add(addressField);

        JLabel city = new JLabel("CITY: ");
        city.setFont(new Font("Raleway", Font.BOLD,24));
        city.setBounds(80,530,300,50);
        add(city);
        
        cityField = new JTextField();
        cityField.setFont(new Font("Arial", Font.BOLD, 24));
        cityField.setBounds(350,530,400,40);
        add(cityField);


        JLabel state = new JLabel("STATE: ");
        state.setFont(new Font("Raleway", Font.BOLD,24));
        state.setBounds(80,580,300,50);
        add(state);

        stateField = new JTextField();
        stateField.setFont(new Font("Arial", Font.BOLD, 24));
        stateField.setBounds(350,580,400,40);
        add(stateField);

        JLabel pincode = new JLabel("PIN CODE: ");
        pincode.setFont(new Font("Raleway", Font.BOLD,24));
        pincode.setBounds(80,630,300,50);
        add(pincode);

        pincodeField = new JTextField();
        pincodeField.setFont(new Font("Arial", Font.BOLD, 24));
        pincodeField.setBounds(350,630,400,40);
        add(pincodeField);


        next = new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.YELLOW);
        next.setFont(new Font("Raleway",Font.BOLD,24));
        next.setBounds(600,680,150,45);
        next.addActionListener(this);
        add(next);
        
        setTitle("SIGNUP PAGE 1");
        setSize(850,800);
        setLocation(350,100);
        getContentPane().setBackground(Color.YELLOW);
        setVisible(true);

    }
    @Override
    public void  actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == next)
        {
            String formno = "" + g;
            String name = nameField.getText();
            String fatherName = FatherNameField.getText();
            String email = emailField.getText();
            String gender = "";
            if(male.isSelected())
            {
                gender ="Male";
            }
            else if(female.isSelected())
            {
                gender="Female";
            }
            String address = addressField.getText();
            String maritalStatus = "";
            if (married.isSelected()) {
                maritalStatus = "Married";
            } else if (unmarried.isSelected()) {
                maritalStatus = "Unmarried";
            } else if (other.isSelected()) {
                maritalStatus = "Other";
            }
            String city = cityField.getText();
            String state = stateField.getText();
            String pincode = pincodeField.getText();
            String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();


            try{
                if(name.equals("") || fatherName.equals("") || email.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Name is Required");
                }
                else{
                    Conn c = new Conn();
                        String query = "insert into signup values('"+ formno + "','" + name + "','" + fatherName + "','"+ gender +"','" + dob +"','"+email+"','"+maritalStatus+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                        c.s.executeUpdate(query);
                        setVisible(false);
                        new signupTwo(formno).setVisible(true);
                }

            }catch(Exception e)
            {
                System.out.println(e);
            }
        }

    }
    public static void main(String[] args) {
        new signupOne();
    }
    
}
