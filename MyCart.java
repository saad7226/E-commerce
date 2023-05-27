package commerce;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyCart extends JFrame implements ActionListener {

    JPanel p;
    JLabel titleLabel, priceLabel; 
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton closeButton, checkoutButton;
    boolean cricke, phon, lapto;
    int crc, pho, la;

    public MyCart(boolean cricket, boolean phone, boolean laptop, int cric, int ph, int lap) {
        setTitle("My Cart");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(100, 100, 100));

        crc = cric;
        pho = ph;
        la = lap;
        cricke = cricket;
        phon = phone;
        lapto = laptop;

        titleLabel = new JLabel("Items"); 
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setBackground(new Color(100, 100, 100));
        titleLabel.setForeground(Color.ORANGE);
        titleLabel.setOpaque(true);
        //titleLabel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        titleLabel.setBounds(120, 95, 60, 20);
        add(titleLabel);

        priceLabel = new JLabel("Price"); 
        priceLabel.setFont(new Font("Arial", Font.BOLD, 18));
        priceLabel.setBackground(new Color(100, 100, 100));
        priceLabel.setForeground(Color.ORANGE);
        priceLabel.setOpaque(true);
        //priceLabel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        priceLabel.setBounds(250, 95, 60, 20);
        add(priceLabel);

        p = new JPanel();
        p.setFont(new Font("Arial", Font.BOLD, 16));
        p.setBackground(new Color(100, 100, 100));
        p.setForeground(Color.ORANGE);
        p.setOpaque(true);

        p.setLayout(new GridLayout(3, 2));

        l1 = new JLabel("Cricket Bat");
        l1.setFont(new Font("Arial", Font.BOLD, 16));
        l1.setBackground(new Color(100, 100, 100));
        l1.setForeground(Color.ORANGE);
        l1.setOpaque(true);
        l1.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        l1.setVisible(cricket);

        t1 = new JTextField("  PKR 1000");
        t1.setFont(new Font("Arial", Font.BOLD, 16));
        t1.setBackground(new Color(100, 100, 100));
        t1.setForeground(Color.ORANGE);
        t1.setOpaque(true);
        t1.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        t1.setEditable(false);
        t1.setVisible(cricket);

        l2 = new JLabel("Smart Phone");
        l2.setFont(new Font("Arial", Font.BOLD, 16));
        l2.setBackground(new Color(100, 100, 100));
        l2.setForeground(Color.ORANGE);
        l2.setOpaque(true);
        l2.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        l2.setVisible(phone);

        t2 = new JTextField("  PKR 20000");
        t2.setFont(new Font("Arial", Font.BOLD, 16));
        t2.setBackground(new Color(100, 100, 100));
        t2.setForeground(Color.ORANGE);
        t2.setOpaque(true);
        t2.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        t2.setEditable(false);
        t2.setVisible(phone);

        l3 = new JLabel("Laptop");
        l3.setFont(new Font("Arial", Font.BOLD, 16));
        l3.setBackground(new Color(100, 100, 100));
        l3.setForeground(Color.ORANGE);
        l3.setOpaque(true);
        l3.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        l3.setVisible(laptop);

        t3 = new JTextField("  PKR 25000");
        t3.setFont(new Font("Arial", Font.BOLD, 16));
        t3.setBackground(new Color(100, 100, 100));
        t3.setForeground(Color.ORANGE);
        t3.setOpaque(true);
        t3.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        t3.setEditable(false);
        t3.setVisible(laptop);

        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(l3);
        p.add(t3);

        closeButton = new JButton("Close");
        closeButton.setFont(new Font("Arial", Font.BOLD, 16));
        closeButton.setBackground(new Color(100, 100, 100));
        closeButton.setForeground(Color.ORANGE);
        closeButton.setOpaque(true);
        closeButton.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        closeButton.addActionListener(this);

        checkoutButton = new JButton("Checkout");
        checkoutButton.setFont(new Font("Arial", Font.BOLD, 16));
        checkoutButton.setBackground(new Color(100, 100, 100));
        checkoutButton.setForeground(Color.ORANGE);
        checkoutButton.setOpaque(true);
        checkoutButton.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        checkoutButton.addActionListener(this);

        p.setBounds(100, 120, 250, 100);
        closeButton.setBounds(250, 250, 100, 30);
        checkoutButton.setBounds(100, 250, 100, 30);

        // Add components to the container
        add(p);
        add(closeButton);
        add(checkoutButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == closeButton) {
            setVisible(false);
            new ProductCatalogWindow();
        } else if (e.getSource() == checkoutButton) {
        	setVisible(false);
            new Bill(cricke, lapto, phon, crc, pho, la);
        }
    }

   
}