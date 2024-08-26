package bin.Customer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CustomerPay  {

  JFrame frame;

  private JPanel panel;
  private JButton backButton, makePaymentButton, mobileBankingPaymentButton;
  private JRadioButton mobileBankingRadioButton, bKashRadioButton, nagadRadioButton, rocketRadioButton, bankRadioButton;
  private JLabel mobileBankingLabel, paymentLabel, bankLabel, accountLabel, amountLabel, bglabel, paybglabel;
  private ImageIcon bgimg, paybgimg;
  private JTextField mobileBankingTextField, amountTextField, accountTextField;
  private ButtonGroup mobileBankingGroup;

  private Color clr1, clr2, clr3, clr4;
  private Font myfont1, myfont2;

  ClientAcc client;

  int X = 500, Y = 100, W = 200, h = 50;

  public CustomerPay(ClientAcc c) {

    client = c;
    frame =  new JFrame("Payment");
    frame.setSize(1600, 900);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    clr1 = new Color(25, 30, 41);
    clr2 = new Color(187, 187, 195);
    clr3 = new Color(105, 110, 121);
    clr4 = new Color(1, 195, 141);

    myfont1 = new Font("SansSerif", Font.PLAIN, 16);
    myfont2 = new Font("SansSerif", Font.BOLD, 18);

    panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(clr2);
    panel.setBounds(0, 0, 500, 600);

    backButton = new JButton("\u2190");
    backButton.setBounds(20, 20, 64, 64);
    backButton.setFont(new Font("Calibri", Font.PLAIN, 30));
    backButton.setBackground(clr1);
    backButton.setForeground(Color.WHITE);
    backButton.setFocusPainted(false);
    backButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        home();
      }
    });

    panel.add(backButton);

    mobileBankingRadioButton = new JRadioButton("Mobile Banking");
    mobileBankingRadioButton.setBounds(X - W / 2, Y + Y / 2, W, h);
    mobileBankingRadioButton.setFont(myfont2);
    mobileBankingRadioButton.setForeground(clr1);
    mobileBankingRadioButton.setOpaque(false);
    mobileBankingRadioButton.setFocusPainted(false);
    panel.add(mobileBankingRadioButton);

    bKashRadioButton = new JRadioButton("bKash");
    bKashRadioButton.setBounds(X, Y * 2, W, h);
    bKashRadioButton.setForeground(clr1);
    bKashRadioButton.setOpaque(false);

    nagadRadioButton = new JRadioButton("Nagad");
    nagadRadioButton.setBounds(X + W, Y * 2, W, h);
    nagadRadioButton.setForeground(clr1);
    nagadRadioButton.setOpaque(false);

    rocketRadioButton = new JRadioButton("Rocket");
    rocketRadioButton.setBounds(X + 2 * W, Y * 2, W, h);
    rocketRadioButton.setForeground(clr1);
    rocketRadioButton.setOpaque(false);

    mobileBankingGroup = new ButtonGroup();
    mobileBankingGroup.add(bKashRadioButton);
    mobileBankingGroup.add(nagadRadioButton);
    mobileBankingGroup.add(rocketRadioButton);

    bKashRadioButton.setFocusPainted(false);
    nagadRadioButton.setFocusPainted(false);
    rocketRadioButton.setFocusPainted(false);

    panel.add(bKashRadioButton);
    panel.add(nagadRadioButton);
    panel.add(rocketRadioButton);

    mobileBankingLabel = new JLabel("Amount:");
    mobileBankingLabel.setFont(myfont1);
    mobileBankingLabel.setBounds(X, Y * 2 + Y / 2, W, h);
    mobileBankingLabel.setForeground(clr1);
    panel.add(mobileBankingLabel);

    mobileBankingTextField = new JTextField();
    mobileBankingTextField.setBounds(X + W, Y * 2 + Y / 2, W, h);
    panel.add(mobileBankingTextField);

    mobileBankingPaymentButton = new JButton("Make Payment");
    mobileBankingPaymentButton.setBounds(X + 2 * W, Y * 2 + Y / 2, W, h);
    mobileBankingPaymentButton.setFont(myfont2);
    mobileBankingPaymentButton.setBackground(clr1);
    mobileBankingPaymentButton.setForeground(clr2);
    mobileBankingPaymentButton.setFocusPainted(false);
    mobileBankingPaymentButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        JOptionPane.showMessageDialog(frame, "Your payment has been Completed Taka: " + mobileBankingTextField.getText() , "Attempt", JOptionPane.INFORMATION_MESSAGE);
      }
    });

    panel.add(mobileBankingPaymentButton);

    bankRadioButton = new JRadioButton("Bank Payment");
    bankRadioButton.setBounds(X - W / 2, Y * 3 + Y / 2, W, h);
    bankRadioButton.setFont(myfont2);
    bankRadioButton.setForeground(clr1);
    bankRadioButton.setBackground(clr2);
    bankRadioButton.setFocusPainted(false);
    bankRadioButton.setOpaque(false);
    panel.add(bankRadioButton);

    paymentLabel = new JLabel("Enter Account Information");
    paymentLabel.setFont(myfont2);
    paymentLabel.setBounds(X + W, Y * 3 + Y / 2, Y * 3, h);
    paymentLabel.setForeground(clr1);
    panel.add(paymentLabel);

    accountLabel = new JLabel("Account Number:");
    accountLabel.setFont(myfont1);
    accountLabel.setBounds(X + W / 2, Y * 4, W, h);
    accountLabel.setForeground(clr1);
    panel.add(accountLabel);

    accountTextField = new JTextField();
    accountTextField.setBounds(X + W + h, Y * 4, W, h);
    panel.add(accountTextField);

    amountLabel = new JLabel("Amount:");
    amountLabel.setFont(myfont1);
    amountLabel.setBounds(X + W / 2, Y * 4 + Y / 2, W, h);
    amountLabel.setForeground(clr1);
    panel.add(amountLabel);

    amountTextField = new JTextField();
    amountTextField.setBounds(X + W + h, Y * 4 + Y / 2, W, h);
    panel.add(amountTextField);

    makePaymentButton = new JButton("Make Payment");
    makePaymentButton.setBounds(X + W + h, Y * 5, W, h);
    makePaymentButton.setFont(myfont2);
    makePaymentButton.setBackground(clr1);
    makePaymentButton.setForeground(clr2);
    makePaymentButton.setFocusPainted(false);
    makePaymentButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        JOptionPane.showMessageDialog(frame, "Your payment has been Completed Taka: " + amountTextField.getText() , "Attempt", JOptionPane.INFORMATION_MESSAGE);
      }
    });
  
    panel.add(makePaymentButton);

    //background
    bgimg = new ImageIcon("images/pay.png");
    bglabel = new JLabel(bgimg);
    bglabel.setBounds(X - W / 2, Y * 6, 825, 220);
    panel.add(bglabel);

    paybgimg = new ImageIcon("images/paybg.jpg");
    paybglabel = new JLabel(paybgimg);
    paybglabel.setBounds(0, 0, 1600, 900);
    panel.add(paybglabel);

    frame.add(panel);
    frame.setVisible(true);
  }


void  home()
{
  new Home(client);
  frame.setVisible(false);
}
 
}
