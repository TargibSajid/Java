package bin.Customer;

import bin.Frames.Login;
import bin.Frames.RegistrationType;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class CustomerRegistration
   {


  JFrame frame;  
  ImageIcon bgimg, logo;
  JLabel logolabel, bglabel, registerlabel, namelabel, numberlabel, doblabel, nidlabel, typelabel, unamelabel, passlabel, conpasslabel;
  JTextField nameTF, numberTF, dobTF, nidTF, unameTF, passTF, conpassTF;
  JButton registerbtn, backbtn;
  JComboBox<String> vehicleType;
  JPanel panel, bgpanel;
  Color clr1, clr2, clr3, clr4, clr5;
  Font myfont1, myfont2;

  //Resizing label & Fields
  int lw = 200, fw = 200, h = 30, w = lw + fw, labelX = 125, fieldX =
    labelX + lw, btnH = 50;
  

  String[] vehicleTypes = {
    "Choose Your Vehicle Type",
    "Car",
    "Motorcycle",
    "Three Wheeler",
    "MicroBus",
  };

  public CustomerRegistration() {
    frame = new JFrame("Client Registration");
    frame.setSize(1600, 900);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //colors
    clr1 = new Color(25, 30, 41);
    clr2 = new Color(187, 187, 195);
    clr3 = new Color(105, 110, 121);
    clr4 = new Color(1, 195, 141);

    //font
    myfont1 = new Font("SansSerif", Font.PLAIN, 15);
    myfont2 = new Font("SansSerif", Font.BOLD, 16);

    //panel
    panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(clr2);
    panel.setBounds(900, 0, 700, 900);

    bgpanel = new JPanel();
    bgpanel.setLayout(null);
    bgpanel.setBackground(null);
    bgpanel.setBounds(0, 0, 1600, 900);

    //Back Button
    backbtn = new JButton("\u2190");
    backbtn.setBounds(20, 20, 64, 64);
    backbtn.setFont(new Font("Calibri", Font.PLAIN, 30));
    backbtn.setBackground(clr1);
    backbtn.setForeground(Color.WHITE);
    backbtn.setFocusPainted(false);
    backbtn.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        switchBackToregFrame();
      }
    });
    panel.add(backbtn);

    //logo
    logo = new ImageIcon("./logo.png");
    logolabel = new JLabel(logo);
    logolabel.setBounds(60, 50, 400, 100);
    panel.add(logolabel);

    // Register label
    registerlabel = new JLabel("Radiant Customer Registration");
    registerlabel.setFont(myfont2);
    registerlabel.setBounds(labelX, btnH * 3 - 20, w, btnH);
    registerlabel.setHorizontalAlignment(SwingConstants.CENTER);
    registerlabel.setBackground(clr1);
    registerlabel.setOpaque(true);
    registerlabel.setForeground(Color.WHITE);
    panel.add(registerlabel);

    //name
    namelabel = new JLabel("Enter Name: ");
    namelabel.setFont(myfont1);
    namelabel.setBounds(labelX, btnH * 4, lw, h);
    panel.add(namelabel);

    nameTF = new JTextField();
    nameTF.setBounds(fieldX, btnH * 4, fw, h);
    panel.add(nameTF);

    //number
    numberlabel = new JLabel("Enter E-mail: ");
    numberlabel.setFont(myfont1);
    numberlabel.setBounds(labelX, btnH * 5, lw, h);
    panel.add(numberlabel);

    numberTF = new JTextField();
    numberTF.setBounds(fieldX, btnH * 5, fw, h);
    panel.add(numberTF);

    //NID
    nidlabel = new JLabel("NID Number: ");
    nidlabel.setFont(myfont1);
    nidlabel.setBounds(labelX, btnH * 6, lw, h);
    panel.add(nidlabel);

    nidTF = new JTextField();
    nidTF.setBounds(fieldX, btnH * 6, fw, h);
    panel.add(nidTF);

    //Date of Birth
    doblabel = new JLabel("Date of Birth (dd/mm/yyyy): ");
    doblabel.setFont(myfont1);
    doblabel.setBounds(labelX, btnH * 7, lw, h);
    panel.add(doblabel);

    dobTF = new JTextField();
    dobTF.setBounds(fieldX, btnH * 7, fw, h);
    panel.add(dobTF);

    
    //User Name
    unamelabel = new JLabel("User Name: ");
    unamelabel.setFont(myfont1);
    unamelabel.setBounds(labelX, btnH * 9, lw, h);
    panel.add(unamelabel);

    unameTF = new JTextField();
    unameTF.setBounds(fieldX, btnH * 9, fw, h);
    panel.add(unameTF);

    //password
    passlabel = new JLabel("Password: ");
    passlabel.setFont(myfont1);
    passlabel.setBounds(labelX, btnH * 10, lw, h);
    panel.add(passlabel);

    passTF = new JTextField();
    passTF.setBounds(fieldX, btnH * 10, fw, h);
    panel.add(passTF);

    //Confirm Password
    conpasslabel = new JLabel("Confirm Password: ");
    conpasslabel.setBounds(labelX, btnH * 11, lw, h);
    panel.add(conpasslabel);

    conpassTF = new JTextField();
    conpassTF.setBounds(fieldX, btnH * 11, fw, h);
    panel.add(conpassTF);

    //Register button
    registerbtn = new JButton("Register");
    registerbtn.setFont(myfont2);
    registerbtn.setBounds(labelX, btnH * 12, w, btnH);
    registerbtn.setBackground(clr1);
    registerbtn.setForeground(Color.WHITE);
    registerbtn.setFocusPainted(false);
    registerbtn.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        register();
      }
    });


    panel.add(registerbtn);

    //background
    bgimg = new ImageIcon("./bg.jpg");
    bglabel = new JLabel(bgimg);
    bglabel.setBounds(0, 0, 1920, 1080);
    bgpanel.add(bglabel);

    frame.add(panel);
    frame.add(bgpanel);
    frame.setVisible(true);
  }

  void switchBackToregFrame()
  {
    
    new RegistrationType();
    frame.setVisible(false);
  }


  void register()
  {
    String name = nameTF.getText();
    String email = numberTF.getText();
    String dob = dobTF.getText();
    String uname = unameTF.getText();
    String pass = passTF.getText();
    String nid = nidTF.getText();
    String conpass = conpassTF.getText();

    
    if(name.equals("") || email.equals("") || dob.equals("") || uname.equals("") || pass.equals("") ||nid.equals(""))
    {


     JOptionPane.showMessageDialog(frame, "Fill the gaps","Attempts", JOptionPane.INFORMATION_MESSAGE);


    }


    else
      {
        
    File file = new File("data/client.txt");

    try 
    {
      FileWriter fw = new FileWriter(file,true);


      if(pass.equals(conpass))
      {
         fw.write(name + "*" +email+ "*" + nid + "*" +dob +"*" + uname + "*" +pass + "\n");

      fw.close();

      JOptionPane.showMessageDialog(frame, "Registration done!\nThank you for being a part of us", "Attempt", JOptionPane.INFORMATION_MESSAGE);
      switchBackToregFrame();

      



      }

      else 
      {

        JOptionPane.showMessageDialog(frame, "wrong confirm Password", "Attempt", JOptionPane.INFORMATION_MESSAGE);
        
      }
      
     


    }

    catch(Exception io)
    {
      System.out.println("Error while eriting the file");
    }
  }

  }

 
  
}
