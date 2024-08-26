package bin.Customer;


import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class MenFrame  
{

 JFrame frame;

  JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
  JButton b1,b2,b3,b4,b5,b6,b7,b8;
  JPanel p1;

  ClientAcc client;
  
  public MenFrame(ClientAcc c){

    client = c;
    
    frame = new JFrame("Mens collection");
    frame.setSize(800,630);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setLayout(null);
    
    p1 = new JPanel();
    p1.setBounds(0,0,800,630);
    p1.setBackground(Color.WHITE);
    p1.setLayout(null);
  
    l2 = new JLabel("COLLECTION -> Mens");
    l2.setBounds(18,65,500,25);
    l2.setFont(new Font("Segoe UI",Font.BOLD,20));
    p1.add(l2);
    
    l3 = new JLabel();
    l3.setBounds(180,290,500,19);
    l3.setFont(new Font("Segoe UI",Font.PLAIN,15));
    p1.add(l3);
    
    l4 = new JLabel();
    l4.setBounds(200,320,200,15);
    l4.setFont(new Font("Segoe UI",Font.PLAIN,15));
    p1.add(l4);
    
    l5 = new JLabel();
    l5.setBounds(520,295,120,19);
    l5.setFont(new Font("Segoe UI",Font.PLAIN,15));
    p1.add(l5);
    
    l8 = new JLabel();
    l8.setBounds(530,320,200,15);
    l8.setFont(new Font("Segoe UI",Font.PLAIN,15));
    p1.add(l8);
    
    l6 = new JLabel();
    l6.setBounds(190,535,100,19);
    l6.setFont(new Font("Segoe UI",Font.PLAIN,15));
    p1.add(l6);
    
    l9 = new JLabel();
    l9.setBounds(200,560,500,15);
    l9.setFont(new Font("Segoe UI",Font.PLAIN,15));
    p1.add(l9);
    
    l7 = new JLabel();
    l7.setBounds(525,535,100,18);
    l7.setFont(new Font("Segoe UI",Font.PLAIN,15));
    p1.add(l7);
    
    l1 = new JLabel();
    l1.setBounds(520,560,500,15);
    l1.setFont(new Font("Segoe UI",Font.PLAIN,15));
    p1.add(l1);
    
    
   
    b1 = new JButton("\u2190");
    b1.setBounds(600, 20, 64, 64);
    b1.setFont(new Font("Calibri", Font.PLAIN, 30));
    b1.setForeground(Color.WHITE);
    b1.setFocusPainted(false);
      b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      b1.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent ae)
        {
          home();
        }
      });
    p1.add(b1);
    
    ImageIcon icon3 = new ImageIcon("images/hoodie.jpg");
    b4 = new JButton(icon3);
    b4.setBounds(140,110,200,180);
      
      b4.setFocusable(false);
      b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      b4.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent ae)
        {
          payment();
        }
      });
      p1.add(b4);
    
    ImageIcon icon4 = new ImageIcon("images/jeans.jpg");
    b5 = new JButton(icon4);
    b5.setBounds(460,110,200,180);
      
      b5.setFocusable(false);
      b5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      b5.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent ae)
        {
          payment();
        }
      });
      p1.add(b5);
  
    ImageIcon icon6 = new ImageIcon("images/T-shirt.jpg");
    b6 = new JButton(icon6);
    b6.setBounds(140,350,200,180);

      b6.setFocusable(false);
      b6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      b6.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent ae)
        {
          payment();
        }
      });
      p1.add(b6);
  
      ImageIcon icon7 = new ImageIcon("images/shirt.jpg");
    b7 = new JButton(icon7);
    b7.setBounds(460,350,200,180);
      
      b7.setFocusable(false);
      b7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      b7.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent ae)
        {
          payment();
        }
      });
      p1.add(b7);
    
      

        
           File f = new File("data/ProductInfo.txt");

try (FileReader fr = new FileReader(f);
     BufferedReader br = new BufferedReader(fr)) {

    String line;
    while ((line = br.readLine()) != null) {
        String[] sp = line.split("/");

        if (sp.length >= 3) {
            if (sp[1].equals("1")) {
                l3.setText(sp[0]);
                l4.setText("BDT " + sp[2] + "tk");
            } else if (sp[1].equals("2")) {
                l5.setText(sp[0]);
                l8.setText("BDT " + sp[2] + "tk");
            } else if (sp[1].equals("3")) {
                l6.setText(sp[0]);
                l9.setText("BDT " + sp[2] + "tk");
            } else if (sp[1].equals("4")) {
                l7.setText(sp[0]);
                l1.setText("BDT " + sp[2] + "tk");
            }
        }
    }
} catch (IOException e) {
    System.out.println(e); 
}

          
          
        
    frame.add(p1);
    frame.setVisible(true);
  }


    void payment()
    {
      new CustomerPay(client);
      frame.setVisible(false);
    }
  

    void  home()
    {
      new Home(client);
      frame.setVisible(false);
    }

}
