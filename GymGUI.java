import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.awt.Font;
import java.io.FileReader;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.awt.Color;




public class GymGUI implements ActionListener
{
    ArrayList <Gymmember> members = new ArrayList <Gymmember>();
    JFrame fr;
    JPanel p1,p2,p3;
    JLabel Id,Name,Location,Phone,Email,ReferalSource,PaidAmount,Gender,DateofBirth,MembershipStartDate,RemovalReason,TrainerName,Heading,RegularPlan,PremiumPlan,Discount,Standard,Deluxe,Plan;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,t14,t15;
    
    JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7;
    JRadioButton rb1,rb2;
    ButtonGroup bg;
    JButton AddaRegularMember,AddaPremiumMember,ActivateMembership,DeactivateMembership,MarkAttendance,RevertMemeber,Display,Clear,UpgradePlan,CalculateDiscount,RevertMember,PayDueamount,SavetoFile,ReadfromFile;
    private JTextArea textArea; 
    private JScrollPane scrollPane; 
    public GymGUI()
    {
        
        p1 = new JPanel();
        p1.setBounds(10, 400, 650, 150);
        p1.setBackground(Color.YELLOW);
        p1.setLayout(new BorderLayout());
        textArea = new JTextArea();
        textArea.setFont(new Font("Courier New", Font.PLAIN, 12));
        textArea.setEditable(false);
        scrollPane = new JScrollPane(textArea);
        p1.add(scrollPane, BorderLayout.CENTER);
        
       
        
        
        fr=new JFrame("GYM GUI SYSTEM");
        Heading=new JLabel("Gym Membership System");
        Id=new JLabel("ID");
        Name=new JLabel("Name");
        Location=new JLabel("Location");
        Phone=new JLabel("Phone number");
        Email=new JLabel("Email Address");
        Gender=new JLabel("Gender");
        ReferalSource=new JLabel("Referal Source");
        PaidAmount=new JLabel("Paid Amount");
        DateofBirth=new JLabel("Date of Birth");
        MembershipStartDate=new JLabel("Membership Start Date");
        RemovalReason=new JLabel("Removal Reason");
        TrainerName=new JLabel("Trainer Name");
        
        
        
        String[] plan={"Basic","Standard","Deluxe"};
        cb7=new JComboBox(plan);
        Plan=new JLabel("Plan[for regular member]");
        Plan.setBounds(10,164,200,15);
        cb7.setBounds(155,164,100,18);
       
        fr.add(Plan);
        fr.add(cb7);
        
       
        
        
        
        tf1=new JTextField("");
        tf2=new JTextField("");
        tf3=new JTextField("");
        tf4=new JTextField("");
        tf5=new JTextField("");
        tf6=new JTextField("");
        tf7=new JTextField("");
        tf8=new JTextField("");
        tf9=new JTextField("");
        tf10=new JTextField("");
       
        
        
        
        
        
        
        AddaRegularMember=new JButton("Add a regular member");
        AddaPremiumMember=new JButton("Add a premium member");
        ActivateMembership=new JButton("Activate Membership");
        DeactivateMembership=new JButton("Deactivate Membership");
        RevertMemeber=new JButton("Revert Memeber");
        MarkAttendance=new JButton("Mark Attendance");
        Display=new JButton("Display");
        Clear=new JButton("Clear");
        
        UpgradePlan=new JButton("Upgrade Plan");
        UpgradePlan.setBounds(10,350,200,30);
        fr.add(UpgradePlan);
        CalculateDiscount=new JButton("CalculateDiscount");
        CalculateDiscount.setBounds(240,350,200,30);
        fr.add(CalculateDiscount);
        PayDueamount=new JButton("PayDueamount");
        PayDueamount.setBounds(470,350,200,30);
        fr.add(PayDueamount);
        
        
        SavetoFile=new JButton("Save to File"); 
        ReadfromFile=new JButton("Read from file");
        
        
        
        rb1=new JRadioButton("Male");
        rb2=new JRadioButton("Female");
        ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(rb1);
        gendergroup.add(rb2);
        
        
        
        String[] month={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] year={"1997" ,"1998", "1999", "2000" ,"2001", "2002", "2003", "2004", "2005" ,"2006", "2007" ,"2008" ,"2009", "2010", "2011", "2012" ,"2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025"};
        String[] day={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        cb1=new JComboBox(month);
        cb2=new JComboBox(year);
        cb3= new JComboBox(day);
        cb4=new JComboBox(month);
        cb5=new JComboBox(year);
        cb6=new JComboBox(day);
        
        
        
       
    
        
    
        
    
        
        
        
        
        
        
        //Set Bounds ...............for label
        Id.setBounds(500,20,50,15);
        Name.setBounds(10,60,200,15);
        Location.setBounds(350,60,200,15);
        Phone.setBounds(10,80,100,15);
        Email.setBounds(350,80,100,15);
        ReferalSource.setBounds(10,100,100,15);
        PaidAmount.setBounds(350,100,100,15);
        Gender.setBounds(10,120,100,15);
        DateofBirth.setBounds(350,120,100,15);
        MembershipStartDate.setBounds(10,140,160,15);
        RemovalReason.setBounds(350,140,100,15);
        TrainerName.setBounds(350,160,100,15);
        Heading.setBounds(250,10,300,40);
              
        
        //Set Bounds................for TextField
        tf1.setBounds(550,20,80,20);
        tf2.setBounds(150,60,150,20);
        tf3.setBounds(450,60,150,20);
        tf4.setBounds(150,80,150,20);
        tf5.setBounds(450,80,150,20);
        tf6.setBounds(150,100,150,20);
        tf7.setBounds(450,100,150,20);
        tf9.setBounds(450,160,160,20);
        tf8.setBounds(450,140,150,20);
        
        
        
       
        
        rb1.setBounds(150,120,80,15);
        rb2.setBounds(250,120,80,15);
        
        cb1.setBounds(450,120,80,20);
        cb2.setBounds(530,120,80,20);
        cb3.setBounds(610,120,80,20);
        cb4.setBounds(150,140,80,20);
        cb5.setBounds(230,140,60,20);
        cb6.setBounds(290,140,50,20);
        fr.add(cb4);
        fr.add(cb5);
        fr.add(cb6);
        
        
  
        
        //SetBounds for Button
        AddaRegularMember.setBounds(10,200,200,30);
        AddaPremiumMember.setBounds(470,200,200,30);
        ActivateMembership.setBounds(240,200,200,30);
        DeactivateMembership.setBounds(10,250,200,30);
        MarkAttendance.setBounds(470,250,200,30);
        RevertMemeber.setBounds(240,250,200,30);
       
        SavetoFile.setBounds(10,305,150,30);
        Display.setBounds(190,305,150,30);
        Clear.setBounds(370,305,150,30);
        ReadfromFile.setBounds(550,305,130,30);
        
        fr.add(Id);
        
        fr.add(Name);
        fr.add(Location);
        fr.add(Phone);
        fr.add(Email);
        fr.add(Gender);
        fr.add(ReferalSource);
        fr.add(PaidAmount);
        fr.add(DateofBirth);
        fr.add(MembershipStartDate);
        fr.add(p1);
        
        fr.add(tf1);
        fr.add(tf2);
        fr.add(tf3);
        fr.add(tf4);
        fr.add(tf5);
        fr.add(tf6);
        fr.add(tf7);
        fr.add(tf8);
        fr.add(tf9);
        fr.add(tf10);
        
        fr.add(cb1);
        fr.add(cb2);
        fr.add(cb3);
        
        fr.add(rb1);
        fr.add(rb2);
        fr.add(AddaRegularMember);
        fr.add(AddaPremiumMember);
        fr.add(ActivateMembership);
        fr.add(DeactivateMembership);
        fr.add(MarkAttendance);
        fr.add(RevertMemeber);
        fr.add(RemovalReason);
        fr.add(TrainerName);
        fr.add(Display);
        fr.add(Clear);
        fr.add(Heading);
        fr.add(SavetoFile);
        fr.add(ReadfromFile);
        
        
        
        
        fr.setLayout(null);
        fr.setVisible(true);
        fr.setSize(700,600);
        

       AddaRegularMember.addActionListener(this); 
       AddaPremiumMember.addActionListener(this);
       SavetoFile.addActionListener(this);
       ReadfromFile.addActionListener(this);
       ActivateMembership.addActionListener(this);
       DeactivateMembership.addActionListener(this);
       RevertMemeber.addActionListener(this);
       MarkAttendance.addActionListener(this);
       Display.addActionListener(this);
       Clear.addActionListener(this);
       UpgradePlan.addActionListener(this);
       CalculateDiscount.addActionListener(this);
       PayDueamount.addActionListener(this);
       
    }
    @Override
    public void actionPerformed(ActionEvent e) {
     if (e.getSource() == AddaRegularMember) {
            try {
                
                int id = Integer.parseInt(tf1.getText());
                String name = tf2.getText();
                String location = tf3.getText();
                String phone = tf4.getText();
                String email = tf5.getText();
                String gender = rb1.isSelected() ? "Male" : "Female";
                String dob = cb1.getSelectedItem() + "/" + cb3.getSelectedItem() + "/" + cb2.getSelectedItem();
                String membershipStartDate = tf10.getText();
                String referralSource = tf6.getText();

                
                boolean idExists = false;
                for (Gymmember member : members) {
                    if (member.getid() == id) {
                        idExists = true;
                        break;
                    }
                }

                if (idExists) {
                    JOptionPane.showMessageDialog(fr, " Member ID already exists!", "Duplicate ID", JOptionPane.ERROR_MESSAGE);
                } else {
                    
                    RegularMember newMember = new RegularMember(id, name, location, phone, email, gender, dob, membershipStartDate, referralSource);
                    members.add(newMember);
                    JOptionPane.showMessageDialog(fr, "Regular member added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(fr, "Error: Invalid ID format. Please enter a number.", "Input Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(fr, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            }
     else if (e.getSource() == AddaPremiumMember) {
            try {
                
                int id = Integer.parseInt(tf1.getText());
                String name = tf2.getText();
                String location = tf3.getText();
                String phone = tf4.getText();
                String email = tf5.getText();
                String gender = rb1.isSelected() ? "Male" : "Female";
                String dob = cb1.getSelectedItem() + "/" + cb3.getSelectedItem() + "/" + cb2.getSelectedItem();
                String membershipStartDate = tf10.getText();
                String personalTrainer = tf9.getText();

                
                boolean idExists = false;
                for (Gymmember member : members) {
                    if (member.getid() == id) {
                        idExists = true;
                        break;
                    }
                }

                if (idExists) {
                    JOptionPane.showMessageDialog(fr, "Error: Member ID already exists!", "Duplicate ID", JOptionPane.ERROR_MESSAGE);
                } else {
                   
                    PremiumMember newMember = new PremiumMember(id, name, location, phone, email, gender, dob, membershipStartDate, personalTrainer);
                    members.add(newMember);
                    JOptionPane.showMessageDialog(fr, "Premium member added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(fr, "Error: Invalid ID format. Please enter a number.", "Input Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(fr, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
     else if (e.getSource() == ActivateMembership) {
            try {
                
                int memberId = Integer.parseInt(tf1.getText());
                boolean memberFound = false;

                for (Gymmember member : members) {
                    if (member.getid() == memberId) {
                        member.activatemembership();
                        memberFound = true;
                        JOptionPane.showMessageDialog(fr, "Membership activated successfully for ID: " + memberId, 
                            "Success", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                }

                if (!memberFound) {
                    JOptionPane.showMessageDialog(fr, "Member ID not found!", "Not Found", 
                        JOptionPane.ERROR_MESSAGE);
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(fr, " Please enter a valid numeric ID", 
                    "Input Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(fr, "Error: " + ex.getMessage(), 
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
     else if (e.getSource() == DeactivateMembership) {
            try {
                
                int memberId = Integer.parseInt(tf1.getText());
                boolean memberFound = false;

                
                for (Gymmember member : members) {
                    if (member.getid() == memberId) {
                        member.deactivemembership();
                        memberFound = true;
                        JOptionPane.showMessageDialog(fr, "Membership deactivated successfully for ID: " + memberId, 
                            "Success", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                }

                if (!memberFound) {
                    JOptionPane.showMessageDialog(fr, " Member ID not found!", "Not Found", 
                        JOptionPane.ERROR_MESSAGE);
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(fr, " Please enter a valid numeric ID", 
                    "Input Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(fr, "Error: " + ex.getMessage(), 
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
     else if (e.getSource() == MarkAttendance) {
            try {
                
                int memberId = Integer.parseInt(tf1.getText());
                boolean memberFound = false;

                
                for (Gymmember member : members) {
                    if (member.getid() == memberId) {
                        if (member.getactiveStatus()) {
                            member.markAttendance();
                            memberFound = true;
                            JOptionPane.showMessageDialog(fr, "Attendance marked successfully for ID: " + memberId + 
                                "\nTotal Attendance: " + member.getattendance() + 
                                "\nLoyalty Points: " + member.getloyaltyPoints(), 
                                "Success", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(fr, "Error: Membership is inactive!", 
                                "Inactive Member", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    }
                }

                if (!memberFound) {
                    JOptionPane.showMessageDialog(fr, "Error: Member ID not found!", 
                        "Not Found", JOptionPane.ERROR_MESSAGE);
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(fr, "Error: Please enter a valid numeric ID", 
                    "Input Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(fr, "Error: " + ex.getMessage(), 
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
     else if (e.getSource() == Display) {
            displayMemberDetails();
        }
     else if(e.getSource()==Clear){
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
            tf6.setText("");
            tf7.setText("");
            tf8.setText("");
            tf9.setText("");
            rb1.setSelected(false);
            rb2.setSelected(false);
            cb1.setSelectedIndex(0);
            cb2.setSelectedIndex(0);
            cb3.setSelectedIndex(0);
            cb4.setSelectedIndex(0);
            cb5.setSelectedIndex(0);
            cb6.setSelectedIndex(0);
            cb7.setSelectedIndex(0);
            JOptionPane.showMessageDialog(fr, "Form cleared!", 
            "Success", JOptionPane.INFORMATION_MESSAGE);
        }
     else if(e.getSource()==RevertMemeber)
        {
         try {
        int memberId = Integer.parseInt(tf1.getText());
        boolean memberFound = false;

        for (Gymmember member : members) {
            if (member.getid() == memberId) {
                memberFound = true;
                String removalReason = tf8.getText().isEmpty() ? "Reverted by user" : tf8.getText();
                if (member instanceof RegularMember) {
                    ((RegularMember) member).revertRegularMember(removalReason);
                    tf8.setText(removalReason);
                } else if (member instanceof PremiumMember) {
                    ((PremiumMember) member).revertPremiumMember();
                    tf8.setText("");
                }
                JOptionPane.showMessageDialog(fr, "Member reverted successfully for ID: " + memberId, 
                    "Success", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }

        if (!memberFound) {
            JOptionPane.showMessageDialog(fr, "Error: Member ID not found!", 
                "Not Found", JOptionPane.ERROR_MESSAGE);
        }
        } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(fr, "Error: Please enter a valid numeric ID", 
            "Input Error", JOptionPane.ERROR_MESSAGE);
         } catch (Exception ex) {
        JOptionPane.showMessageDialog(fr, "Error: " + ex.getMessage(), 
            "Error", JOptionPane.ERROR_MESSAGE);
       }
       
        }
     else if (e.getSource() == UpgradePlan) {
         try {
          int memberId = Integer.parseInt(tf1.getText());
         boolean memberFound = false;

            for (Gymmember member : members) {
            if (member.getid() == memberId) {
                memberFound = true;
                if (!(member instanceof RegularMember)) {
                    JOptionPane.showMessageDialog(fr, "Error: Only Regular Members can upgrade plans!", 
                        "Invalid Member Type", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (!member.getactiveStatus()) {
                    JOptionPane.showMessageDialog(fr, "Error: Membership is inactive!", 
                        "Inactive Member", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                RegularMember regularMember = (RegularMember) member;
                String selectedPlan = cb7.getSelectedItem().toString().toLowerCase();
                String result = regularMember.upgradePlan(selectedPlan);
                JOptionPane.showMessageDialog(fr, result, 
                    "Upgrade Plan Result", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }

        if (!memberFound) {
            JOptionPane.showMessageDialog(fr, "Error: Member ID not found!", 
                "Not Found", JOptionPane.ERROR_MESSAGE);
        }
            } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(fr, "Error: Please enter a valid numeric ID", 
            "Input Error", JOptionPane.ERROR_MESSAGE);
          } catch (Exception ex) {
        JOptionPane.showMessageDialog(fr, "Error: " + ex.getMessage(), 
            "Error", JOptionPane.ERROR_MESSAGE);
          }
               
     
     
    
        }
     else if (e.getSource() == CalculateDiscount) {
            try {
            int memberId = Integer.parseInt(tf1.getText());
            boolean memberFound = false;

            for (Gymmember member : members) {
            if (member.getid() == memberId) {
                memberFound = true;
                if (!(member instanceof PremiumMember)) {
                    JOptionPane.showMessageDialog(fr, "Error: Discounts are only available for Premium Members!", 
                        "Invalid Member Type", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                PremiumMember premiumMember = (PremiumMember) member;
                String result = premiumMember.calculateDiscount();
                JOptionPane.showMessageDialog(fr, result, 
                    "Discount Result", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            }

            if (!memberFound) {
            JOptionPane.showMessageDialog(fr, "Error: Member ID not found!", 
                "Not Found", JOptionPane.ERROR_MESSAGE);
            }
            } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(fr, "Error: Please enter a valid numeric ID", 
            "Input Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
            JOptionPane.showMessageDialog(fr, "Error: " + ex.getMessage(), 
            "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
     else if (e.getSource() == PayDueamount) 
        {
        try {
        int memberId = Integer.parseInt(tf1.getText());
        double paidAmount = Double.parseDouble(tf7.getText());
        boolean memberFound = false;

        if (paidAmount <= 0) {
            JOptionPane.showMessageDialog(fr, "Error: Paid amount must be greater than zero!", 
                "Invalid Amount", JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (Gymmember member : members) {
            if (member.getid() == memberId) {
                memberFound = true;
                if (!(member instanceof PremiumMember)) {
                    JOptionPane.showMessageDialog(fr, "Error: Payments are only available for Premium Members!", 
                        "Invalid Member Type", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                PremiumMember premiumMember = (PremiumMember) member;
                String result = premiumMember.payDueAmount(paidAmount);
                JOptionPane.showMessageDialog(fr, result, 
                    "Payment Result", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }

        if (!memberFound) {
            JOptionPane.showMessageDialog(fr, "Error: Member ID not found!", 
                "Not Found", JOptionPane.ERROR_MESSAGE);
        }
            } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(fr, "Error: Please enter a valid numeric ID and amount", 
            "Input Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
        JOptionPane.showMessageDialog(fr, "Error: " + ex.getMessage(), 
            "Error", JOptionPane.ERROR_MESSAGE);
             }
            
        
        }
        else if (e.getSource() == SavetoFile) {
            try {
                FileWriter writer = new FileWriter("MemberDetails.txt");
                String header = String.format("%-5s %-15s %-15s %-15s %-25s %-20s %-10s %-10s %-10s %-15s %-10s %-15s %-15s %-15s\n",
                    "ID", "Name", "Location", "Phone", "Email", "Start Date", "Plan", "Price",
                    "Attend", "Loyalty", "Active", "Full Pay", "Discount", "Net Paid");
                writer.write(header);
                for (Gymmember member : members) {
                    String plan = "N/A";
                    String price = "N/A";
                    String fullPayment = "N/A";
                    String discount = "N/A";
                    String netPaid = "N/A";
                    if (member instanceof RegularMember) {
                        RegularMember rm = (RegularMember) member;
                        plan = rm.getplan();
                        price = String.format("%.2f", rm.getprice());
                    } else if (member instanceof PremiumMember) {
                        PremiumMember pm = (PremiumMember) member;
                        fullPayment = String.valueOf(pm.getisFullPayment());
                        discount = String.format("%.2f", pm.getdiscountAmount());
                        netPaid = String.format("%.2f", pm.getpaidAmount());
                    }
                    String line = String.format("%-5d %-15s %-15s %-15s %-25s %-20s %-10s %-10s %-10d %-15.2f %-10s %-15s %-15s %-15s\n",
                        member.getid(), member.getname(), member.getlocation(), member.getphone(),
                        member.getemail(), member.getmembershipStartDate(), plan, price,
                        member.getattendance(), member.getloyaltyPoints(), member.getactiveStatus(),
                        fullPayment, discount, netPaid);
                    writer.write(line);
                }
                writer.close();
                JOptionPane.showMessageDialog(fr, "Member details saved to MemberDetails.txt in the program folder!", 
                    "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(fr, "Error saving to file: " + ex.getMessage(), 
                    "File Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (e.getSource() == ReadfromFile) {
            try {
                textArea.setText("");
                BufferedReader reader = new BufferedReader(new FileReader("MemberDetails.txt"));
                String line;
                while ((line = reader.readLine()) != null) {
                    textArea.append(line + "\n");
                }
                reader.close();
                JOptionPane.showMessageDialog(fr, "Member details loaded in display panel from MemberDetails.txt!", 
                    "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(fr, "Error: MemberDetails.txt not found in the program folder!", 
                    "File Not Found", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(fr, "Error reading file: " + ex.getMessage(), 
                    "File Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
            
       
     
      
      
      
        
        
        
        
        

         

    }

    private void displayMemberDetails() {
        try {
            int memberId = Integer.parseInt(tf1.getText());
            boolean memberFound = false;

            for (Gymmember member : members) {
                if (member.getid() == memberId) {
                    memberFound = true;
                    
                    
                    String memberInfo = String.format(
                        "=== Member Details ===\n" +
                        "ID: %d\nName: %s\nLocation: %s\n" +
                        "Phone: %s\nEmail: %s\nGender: %s\n" +
                        "DOB: %s\nMembership Start: %s\n" +
                        "Attendance: %d\nLoyalty Points: %.1f\n" +
                        "Status: %s\n",
                        member.getid(), member.getname(), member.getlocation(),
                        member.getphone(), member.getemail(), member.getgender(),
                        member.getDOB(), member.getmembershipStartDate(),
                        member.getattendance(), member.getloyaltyPoints(),
                        member.getactiveStatus() ? "Active" : "Inactive"
                    );

                    
                    if (member instanceof RegularMember) {
                        RegularMember rm = (RegularMember) member;
                        memberInfo += String.format(
                            "Type: Regular Member\nPlan: %s\nPrice: %.2f\n" +
                            "Eligible for Upgrade: %s\n",
                            rm.getplan(), rm.getprice(), 
                            rm.getisEligibleForUpgrade() ? "Yes" : "No"
                        );
                    } 
                    
                    JOptionPane.showMessageDialog(fr, memberInfo, 
                        "Member Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }

            if (!memberFound) {
                JOptionPane.showMessageDialog(fr, 
                    "Member ID " + memberId + " not found!",
                    "Not Found", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(fr, 
                "Please enter a valid numeric ID!",
                "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(fr, 
                "Error displaying member: " + ex.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
        }
      
    }
       
    public static void main(String []args){
        new GymGUI();
    }
    
        
}

       

   
 

   



        
           