package bin.Frames;

import bin.Customer.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RegistrationType
 {


  JFrame frame;
  ImageIcon logo, bgimg;
  JLabel bglabel, imglabel, logolabel, titlelabel, textlabel1, textlabel2, textlabel3;
  JButton backbtn, proccedbtn;
  JPanel panel;
  Color clr1, clr2, clr3, clr4, clr5;
  Font myfont1, myfont2;
  


  private int btnwidth = 200, btnheight = 50, height = 30, width =
    50, clientbtnX = 600, ownerbtnX = clientbtnX + btnwidth, Yaxis = 30, Xaxis =
    100;

  public RegistrationType() {

    
    frame = new JFrame("Chose Type");
    frame.setSize(1600, 900);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //colors
    clr1 = new Color(25, 30, 41);
    clr2 = new Color(187, 187, 195);
    clr3 = new Color(105, 110, 121);
    clr4 = new Color(1, 195, 141);

    //font
    myfont1 = new Font("SansSerif", Font.BOLD, 80);
    myfont2 = new Font("SansSerif", Font.BOLD, 18);

    //panel
    panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(clr2);
    panel.setBounds(0, 0, 600, 1080);

    //logo

    logo = new ImageIcon("./logo.png");
    logolabel = new JLabel(logo);
    logolabel.setBounds(60, 50, 400, 100);
    panel.add(logolabel);

    // Back Button
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
          login();
      }

    });
   
    panel.add(backbtn);

    //Title
    titlelabel = new JLabel("Radiant");
    titlelabel.setFont(myfont1);
    titlelabel.setForeground(clr4);
    titlelabel.setBounds(Xaxis, Yaxis * 8, width * 8, btnheight * 2);
    panel.add(titlelabel);

    //Text 1
    textlabel1 = new JLabel("Want to Buy things? register as a Customer ");
    textlabel1.setForeground(clr3);
    textlabel1.setBounds(Xaxis, Yaxis * 12, width * 6, height);
    panel.add(textlabel1);

    //Text 2
    textlabel2 = new JLabel("Best products are found here ONLY");
    textlabel2.setForeground(clr3);
    textlabel2.setBounds(Xaxis, Yaxis * 13, width * 6, height);
    panel.add(textlabel2);

    //Text 3
    textlabel3 = new JLabel("Be a part of our Journey ");
    textlabel3.setForeground(clr3);
    textlabel3.setBounds(Xaxis, Yaxis * 14, width * 6, height);
    panel.add(textlabel3);

 
   
    //Credit Button
    proccedbtn = new JButton("Interested!");
    proccedbtn.setFont(myfont2);
    proccedbtn.setBounds(clientbtnX, Yaxis * 12, btnwidth, btnheight);
    proccedbtn.setBackground(clr1);
    proccedbtn.setForeground(Color.WHITE);
    proccedbtn.setFocusPainted(false);
    proccedbtn.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
          reg();
      }

    });

    panel.add(proccedbtn);

    //background
    bgimg = new ImageIcon("images/type.jpg");
    bglabel = new JLabel(bgimg);
    bglabel.setBounds(0, 0, 1600, 900);
    panel.add(bglabel);

    frame.add(panel);
    frame.setVisible(true);
  }

  void login()
  {
    new Login();
    frame.setVisible(false);
  }

  void reg()
  {
    new CustomerRegistration();
    frame.setVisible(false);
  }

  
}
