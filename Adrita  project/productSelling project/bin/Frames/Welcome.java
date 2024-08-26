package bin.Frames;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Welcome extends JFrame   {


  ImageIcon logo, bgimg;
  JLabel bglabel, imglabel, logolabel;
  JButton startbtn, creditbtn;
  JPanel panel;
  Color clr1, clr2, clr3, clr4;
  Font myfont1, myfont2;

  private int width = 200, height = 50, creditbtnX = 600, startbtnX =
    creditbtnX + width, Yaxis = 500;

  public Welcome() {
    
    super("Welcome");

    this.setSize(1600, 900);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //colors
    clr1 = new Color(25, 30, 41);
    clr2 = new Color(187, 187, 195);
    clr3 = new Color(105, 110, 121);
    clr4 = new Color(1, 195, 141);

    //font
    myfont1 = new Font("SansSerif", Font.PLAIN, 15);
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

    //Get Started Button
    startbtn = new JButton("Get Started");
    startbtn.setFont(myfont2);
    startbtn.setBounds(startbtnX, Yaxis, width, height);
    startbtn.setBackground(clr1);
    startbtn.setForeground(Color.WHITE);

    startbtn.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        
        switchToLogin();

      }
    });
    panel.add(startbtn);

    //Credit Button
    creditbtn = new JButton("Credit");
    creditbtn.setFont(myfont2);
    creditbtn.setBounds(creditbtnX, Yaxis, width, height);
    creditbtn.setBackground(clr1);
    creditbtn.setForeground(Color.WHITE);
    creditbtn.setFocusPainted(false);
    creditbtn.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {

        System.exit(0);

      }
    });
  
    panel.add(creditbtn);

    //background
    bgimg = new ImageIcon("images/welcome.png");
    bglabel = new JLabel(bgimg);
    bglabel.setBounds(0, 0, 1600, 900);
    panel.add(bglabel);

    this.add(panel);
    this.setVisible(true);
  }

  void switchToLogin()
  {
     new Login();
     this.setVisible(false);
  }


  // Mouse Events
  
  
}
