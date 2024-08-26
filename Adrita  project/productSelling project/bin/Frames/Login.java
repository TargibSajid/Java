package bin.Frames;




import bin.Customer.*;
import  bin.Inferface.IloginActions;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Login implements IloginActions {

  JFrame frame;
  ImageIcon bgimg, logo;
  JLabel logolabel, bglabel, unamelabel, passlabel, forgotlabel;
  JTextField unameTF;
  JPasswordField passPF;
  JButton backbtn, loginbtn, createbtn;
  JRadioButton ownerRB, clientRB;
  ButtonGroup groupRB;
  JPanel panel, bgpanel;
  Color clr1, clr2, clr3, clr4, clr5;
  Font myfont1, myfont2;
  

  //Resizing label & Fields
  int lw = 100, fw = 200, h = 30, w = lw + fw, labelX = 150, fieldX =
    labelX + lw, btnH = 50;

 
  public Login() {

    
    frame = new JFrame("Login");
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
        switchBackToWelcome();
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
    unamelabel.setBounds(labelX, btnH * 5, lw, h);
    panel.add(unamelabel);

    unameTF = new JTextField();
    unameTF.setBounds(fieldX, btnH * 5, fw, h);
    panel.add(unameTF);

    //password
    passlabel = new JLabel("Password: ");
    passlabel.setFont(myfont1);
    passlabel.setBounds(labelX, btnH * 6, lw, h);
    panel.add(passlabel);

    passPF = new JPasswordField();
    passPF.setBounds(fieldX, btnH * 6, fw, h);
    panel.add(passPF);

    //Login button
    loginbtn = new JButton("Login");
    loginbtn.setFont(myfont2);
    loginbtn.setBounds(labelX, btnH * 7, w, btnH);
    loginbtn.setBackground(clr4);
    loginbtn.setForeground(clr1);
    loginbtn.setFocusPainted(false);
    loginbtn.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
          login();
      }

    });

    {

    }
   
    panel.add(loginbtn);

    //Forgot Pass Label

    forgotlabel = new JLabel("Forgot Password");
    forgotlabel.setHorizontalAlignment(SwingConstants.CENTER); // Center the text
    forgotlabel.setFont(myfont1);
    forgotlabel.setForeground(clr3);
    forgotlabel.setBounds(labelX, btnH * 8, w, btnH);
    forgotlabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    forgotlabel.addMouseListener(
      new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          openForgotPass();
          
        }
      }
    );
    panel.add(forgotlabel);

    //Create button
    createbtn = new JButton("Create New Account");
    createbtn.setFont(myfont2);
    createbtn.setBounds(labelX, btnH * 9, w, btnH);
    createbtn.setBackground(clr4);
    createbtn.setForeground(clr1);
    createbtn.setFocusPainted(false);
    createbtn.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
          regFrame();
      }

    });

  
    panel.add(createbtn);

    //background
    bgimg = new ImageIcon("images/login.jpg");
    bglabel = new JLabel(bgimg);
    bglabel.setBounds(0, 0, 900, 900);
    bgpanel.add(bglabel);

    frame.add(panel);
    frame.add(bgpanel);
    frame.setVisible(true);
  }


 

  void openForgotPass() {

   new ForgotPass();

   frame.setVisible(false);

  }

  public void login()
  {
      File file = new File("data/client.txt");

try {
    FileReader fr = new FileReader(file);
    BufferedReader br = new BufferedReader(fr);

    boolean flag = false;

    String line;
    while ((line = br.readLine()) != null) {
        String[] string = line.split("\\*");

        if ( string[4].equals(unameTF.getText()) && string[5].equals(passPF.getText())) {
            
            JOptionPane.showMessageDialog(frame, "Loggedd in succesfully!" , "Attempt", JOptionPane.INFORMATION_MESSAGE);
            flag = true;
            break; 
    }

   
    
} 
 br.close(); 



if (flag == true) {
        switchToHome();
    } else {
        JOptionPane.showMessageDialog(frame, "Wrong username or Password", "Attempt", JOptionPane.ERROR_MESSAGE);
    }
}

catch (Exception io) {
    
    System.out.println(io);
}
  }



  public void switchBackToWelcome()
  {
    new Welcome();
    frame.setVisible(false);
  }


  public void regFrame()
  {
    new RegistrationType();
    frame.setVisible(false);
  }


  public void switchToHome()
  {
    ClientAcc client = new ClientAcc(unameTF.getText(),passPF.getText());
    new Home(client);
    frame.setVisible(false);
  }
}
