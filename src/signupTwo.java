package BankManagement.src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class signupTwo extends JFrame implements ActionListener {

    private JComboBox<String> religionList, categoryList, incomeList, educationList, occupationList;
    private JTextField panField, adharField;
    private JRadioButton yes, no, existingYes, existingNo;
    private JButton next;
    String formno;

    signupTwo(String formno)
    {

        this.formno = formno;   
        setLayout(null);

        JLabel additionalDetails = new JLabel("Page 2: ADDITIONAL DETAILS");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 32));
        additionalDetails.setBounds(130, 10, 600, 150);
        add(additionalDetails);

        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 24));
        religion.setBounds(100, 150, 300, 30);
        add(religion);

        String rel[] = {"Hindu","Muslim","Sikh","Christian","Others"};
         religionList = new JComboBox<>(rel); // Creating a combo box for religion
        religionList.setFont(new Font("Arial", Font.BOLD, 24));
        religionList.setBounds(360, 150, 400, 35);
        add(religionList);

        JTextField religionField = new JTextField();
        religionField.setFont(new Font("Arial", Font.BOLD, 24));
        religionField.setBounds(360, 150, 400, 35);
        religionField.setBackground(Color.YELLOW);
        add(religionField);
        
        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 24));
        category.setBounds(100, 200, 300, 30);
        add(category);

        String cat[] = {"General","OBC","SC","ST","Others"};
        categoryList = new JComboBox<>(cat); // Creating a combo box for category
        categoryList.setFont(new Font("Arial", Font.BOLD, 24));
        categoryList.setBounds(360, 200, 400, 35);
        add(categoryList);


        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 24));
        income.setBounds(100, 250, 300, 30);
        add(income);

        String inc[]= {"NULL","< 1.5L","<2.5L","<5L","<10L",">10L"};
        incomeList = new JComboBox<>(inc); // Creating a combo box for income
        incomeList.setFont(new Font("Arial", Font.BOLD, 24));
        incomeList.setBounds(360, 250, 400, 35);
        add(incomeList);

        JLabel education = new JLabel("Educational");
        education.setFont(new Font("Raleway", Font.BOLD, 24));
        education.setBounds(100, 300, 300, 30);
        add(education);


        JLabel qualification = new JLabel("Qualification:");    
        qualification.setFont(new Font("Raleway", Font.BOLD, 24));
        qualification.setBounds(100, 330, 300, 30);
        add(qualification);

        String educa[]={"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        educationList = new JComboBox<>(educa); // Creating a combo box for education
        educationList.setFont(new Font("Arial", Font.BOLD, 24));
        educationList.setBounds(360, 330, 400, 35);
        add(educationList);

        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 24));
        occupation.setBounds(100, 400, 300, 30);
        add(occupation);

        String occu[]  = {"Salaried","Self-Employed","Business","Student","Retired","Others"};
        occupationList = new JComboBox<>(occu); // Creating a combo box for occupation
        occupationList.setFont(new Font("Arial", Font.BOLD, 24));
        occupationList.setBounds(360, 400, 400, 35);
        add(occupationList);

        JLabel pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway", Font.BOLD, 24));
        pan.setBounds(100, 450, 300, 30);
        add(pan);

        panField = new JTextField();
        panField.setFont(new Font("Arial", Font.BOLD, 24));
        panField.setBounds(360, 450, 400, 35);
        add(panField);

        JLabel adhar = new JLabel("Adhar Number:");
        adhar.setFont(new Font("Raleway", Font.BOLD, 24));
        adhar.setBounds(100, 500, 300, 30);
        add(adhar);

        adharField = new JTextField();
        adharField.setFont(new Font("Arial", Font.BOLD, 24));
        adharField.setBounds(360, 500, 400, 35);
        add(adharField);


        JLabel SeniorCitizen = new JLabel("Senior Citizen:");
        SeniorCitizen.setFont(new Font("Raleway", Font.BOLD, 24));
        SeniorCitizen.setBounds(100, 550, 300, 30);
        add(SeniorCitizen);

        yes = new JRadioButton("Yes");
        yes.setBounds(360, 550, 80, 45);
        yes.setBackground(Color.YELLOW);
        add(yes);

        no = new JRadioButton("No");
        no.setBounds(450, 550, 80, 45);
        no.setBackground(Color.YELLOW);
        add(no);

        ButtonGroup seniorCitizen = new ButtonGroup();
        seniorCitizen.add(yes);
        seniorCitizen.add(no);

        JLabel existingAccount = new JLabel("Existing Account:");
        existingAccount.setFont(new Font("Raleway", Font.BOLD, 24));
        existingAccount.setBounds(100, 600, 300, 30);
        add(existingAccount);

        existingYes = new JRadioButton("Yes");
        existingYes.setBounds(360, 600, 80, 45);
        existingYes.setBackground(Color.YELLOW);
        add(existingYes);

        existingNo = new JRadioButton("No");
        existingNo.setBounds(450, 600, 80, 45);
        existingNo.setBackground(Color.YELLOW);
        add(existingNo);

        ButtonGroup existingAccountGroup = new ButtonGroup();
        existingAccountGroup.add(existingYes);
        existingAccountGroup.add(existingNo);

        next = new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.YELLOW);
        next.setFont(new Font("Raleway",Font.BOLD,24));
        next.setBounds(600,680,150,45);
        next.addActionListener(this);
        add(next);

        setTitle("SIGNUP PAGE 2");
        setSize(850,800);
        setLocation(350,100);
        getContentPane().setBackground(Color.YELLOW);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==next)
        {
        String religion = (String)religionList.getSelectedItem();
        String category = (String)categoryList.getSelectedItem();
        String income = (String)incomeList.getSelectedItem();
        String education = (String)educationList.getSelectedItem();
        String occupation = (String)occupationList.getSelectedItem();
        String pan = panField.getText();
        String adhar = adharField.getText();
        String seniorCitizen = null;
        if(yes.isSelected())
        {
            seniorCitizen = "Yes";
        }
        else if(no.isSelected())
        {
            seniorCitizen = "No";
        }
        String existingAccount = null;
        if (existingYes.isSelected())
        {
            existingAccount = "Yes";
        }
        else if (existingNo.isSelected())
        {
            existingAccount = "No";
        }

        try{
            Conn c = new Conn(); // Ensure Conn class is correctly implemented and imported
            String query = "insert into signuptwo values('"+ formno + "','" + religion + "','" + category + "','"+ income +"','" + education +"','"+occupation+"','"+pan+"','"+adhar+"','"+seniorCitizen+"','"+existingAccount+"')";
            c.s.executeUpdate(query);
            setVisible(false);
            new signupThree(formno).setVisible(true);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        }

    }
    public static void main(String[] args) {
        new signupTwo("");
    }
    
}
