package bin.Customer;


import bin.Frames.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Home
   {


   JFrame frame; 
  ImageIcon bgimg, logo;
  JLabel logolabel, bglabel, usernameLabel, welcomeLabel1, welcomeLabel2;
  JComboBox<String> collectionlist;
  JButton editProfileBtn, signoutBtn, searchbtn;
  JPanel panel;
  Color clr1, clr2, clr3, clr4, clr5;
  Font myfont1, myfont2;
  String selectedOption;
  ClientAcc client;
  
  int h = 30, w = 150, Xaxis = 900, btnH = 50, btw = 100;
  

  String[] collection = {
    "Select Your Prefered Collection ",
    "Ladies",
    "Men's",
    "Kids",
   
  };

  public Home(ClientAcc c) {
    client = c;
    frame = new JFrame("Home");
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
    panel.setBounds(900, 0, 1600, 900);

    //welcome message
    welcomeLabel1 = new JLabel("Welcome");
    welcomeLabel1.setFont(new Font("SansSerif", Font.BOLD, 80));
    welcomeLabel1.setForeground(clr4);
    welcomeLabel1.setBounds(600, 200, w * 3, h * 2);
    panel.add(welcomeLabel1);

    welcomeLabel2 = new JLabel("We are Happy you are here");
    welcomeLabel2.setFont(new Font("SansSerif", Font.BOLD, 25));
    welcomeLabel2.setForeground(clr3);
    welcomeLabel2.setBounds(610, 280, w * 3, h);
    panel.add(welcomeLabel2);

    // Username
    usernameLabel = new JLabel(client.getUsername());
    usernameLabel.setFont(myfont2);
    usernameLabel.setHorizontalAlignment(SwingConstants.CENTER);
    usernameLabel.setBackground(clr4);
    usernameLabel.setForeground(clr1);
    usernameLabel.setOpaque(true);
    usernameLabel.setFont(myfont1);
    usernameLabel.setBounds(Xaxis + 400, 20 + h, btw * 2, h);
    panel.add(usernameLabel);

   
    signoutBtn = new JButton("Signout");
    signoutBtn.setFont(myfont2);
    signoutBtn.setBounds(Xaxis + 400, 20, btw * 2, h);
    signoutBtn.setBackground(clr1);
    signoutBtn.setForeground(clr2);
    signoutBtn.setFocusPainted(false);
    signoutBtn.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae)
      {
        switchToLogin();
      }
    });
   
    panel.add(signoutBtn);

    //logo
    logo = new ImageIcon("./logo.png");
    logolabel = new JLabel(logo);
    logolabel.setBounds(60, 50, 400, 100);
    panel.add(logolabel);

    

    collectionlist = new JComboBox<>(collection);
    collectionlist.setFont(myfont1);
    collectionlist.setBounds(Xaxis - w * 3, btnH * 7, w * 4, btnH);
    collectionlist.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selectedOption = (String) collectionlist.getSelectedItem();
               
            }
        });

    panel.add(collectionlist);

    //Search button
    searchbtn = new JButton("Search");
    searchbtn.setFont(myfont2);
    searchbtn.setBounds(Xaxis, btnH * 8, w, btnH - 10);
    searchbtn.setBackground(clr1);
    searchbtn.setForeground(clr2);
    searchbtn.setFocusPainted(false);
    searchbtn.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae)
      {
        switchToFrame();
      }
    });

    

    panel.add(searchbtn);

    //background
    bgimg = new ImageIcon("images/Home.jpg");
    bglabel = new JLabel(bgimg);
    bglabel.setBounds(0, 0, 1600, 900);
    panel.add(bglabel);


    

    frame.add(panel);
    frame.setVisible(true);
  }


void switchToLogin()
{
  new Login();
  frame.setVisible(false);
}
 

 void switchToFrame()
 {

    if(selectedOption.equals("Men's"))
    {
      new MenFrame(client);
      frame.setVisible(false);
    }

    else if(selectedOption.equals("Ladies"))
    {
      new Ladies(client);
      frame.setVisible(false);
    }

    else if(selectedOption.equals("Kids"))
    {
      new Kids(client);
      frame.setVisible(false);
    }


 }

  
}
