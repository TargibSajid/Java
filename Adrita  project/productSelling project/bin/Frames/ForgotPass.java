package bin.Frames;

import bin.Customer.ClientAcc;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class ForgotPass
 {

  JFrame frame ;

   ImageIcon bgimg, logo;
  JLabel logolabel, bglabel, loginlabel, userTypelabel, unamelabel, nidlabel;
  JTextField unameTF, nidTF;
  JButton backbtn, getPassbtn;
  JRadioButton ownerRB, clientRB;
  ButtonGroup groupRB;
  JPanel panel;
  Color clr1, clr2, clr3, clr4, clr5;
  Font myfont1, myfont2;

  //Resizing label & Fields
  int lw = 100, fw = 200, h = 50, w = lw + fw, labelX = 150, fieldX =
    labelX + lw, btnH = 50;

  

  public ForgotPass() {
    frame = new JFrame("Forgot Password");
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
    panel.setBounds(300, 0, 100, 900);

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
        switchBackToLogin();
      }
    });
 
    panel.add(backbtn);

    //logo
    logo = new ImageIcon("./logo.png");
    logolabel = new JLabel(logo);
    logolabel.setBounds(60, 50, 400, 100);
    panel.add(logolabel);

   

    //User Name
    unamelabel = new JLabel("User Name: ");
    unamelabel.setFont(myfont1);
    unamelabel.setBackground(clr1);
    unamelabel.setForeground(Color.WHITE);
    unamelabel.setHorizontalAlignment(SwingConstants.CENTER);
    unamelabel.setOpaque(true);
    unamelabel.setBounds(labelX, btnH * 5, w, h);
    panel.add(unamelabel);

    unameTF = new JTextField();
    unameTF.setBounds(labelX, btnH * 6, w, h);
    panel.add(unameTF);

    //NID NUMBER
    nidlabel = new JLabel("Enter Nid Number: ");
    nidlabel.setFont(myfont1);
    nidlabel.setBackground(clr1);
    nidlabel.setForeground(Color.WHITE);
    nidlabel.setOpaque(true);
    nidlabel.setHorizontalAlignment(SwingConstants.CENTER);
    nidlabel.setBounds(labelX, btnH * 7, w, h);
    panel.add(nidlabel);

    nidTF = new JTextField();
    nidTF.setBounds(labelX, btnH * 8, w, h);
    panel.add(nidTF);

    //get pass button
    getPassbtn = new JButton("Get Password");
    getPassbtn.setFont(myfont2);
    getPassbtn.setBounds(labelX, btnH * 9, w, btnH);
    getPassbtn.setBackground(clr1);
    getPassbtn.setForeground(clr2);
    getPassbtn.setFocusPainted(false);
    getPassbtn.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
          getPass();
      }

    });
   
    panel.add(getPassbtn);

    //background
    bgimg = new ImageIcon("./bg.jpg");
    bglabel = new JLabel(bgimg);
    bglabel.setBounds(0, 0, 1600, 900);
    panel.add(bglabel);

    frame.add(panel);
    frame.setVisible(true);
  }


  public void getPass()
  {

   File file = new File("data/client.txt");

try {
    FileReader fr = new FileReader(file);
    BufferedReader br = new BufferedReader(fr);

    boolean flag = false;

    String line;
    while ((line = br.readLine()) != null) {
        String[] string = line.split("\\*");

        if ( string[0].equals(unameTF.getText()) && string[2].equals(nidTF.getText())) {
            
            JOptionPane.showMessageDialog(frame, "Your Password is: " + string[5], "Attempt", JOptionPane.INFORMATION_MESSAGE);
            flag = true;
            break; 
    }

    br.close(); 
    if (flag) {
        JOptionPane.showMessageDialog(frame, "Don't forget it again mate!", "Attempt", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(frame, "Invalid input", "Attempt", JOptionPane.ERROR_MESSAGE);
    }
} 

}

catch (Exception io) {
    
    System.out.println("Error while working with the file");
}

  
}




  void switchBackToLogin()
  {
    new Login();

    frame.setVisible(false);
  }
 
}
