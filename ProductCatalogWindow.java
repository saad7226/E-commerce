package commerce;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductCatalogWindow extends JFrame implements ActionListener {

	private JLabel imageLabel1,imageLabel2,imageLabel3;
    private JButton allButton;
    private JButton smartphoneButton;
    private JButton sportsButton;
    private JButton laptopButton;
    private JButton myCartButton;
    private JButton cricketBat;
    private JButton smartphone;
    private JButton laptop;
    private  int cric=0;
    private  int phone=0;
    private  int lap=0;
    private boolean cricket=false;
    private boolean newLaptop=false;
    private boolean smartPhone=false;
    

    public ProductCatalogWindow() {
        setTitle("Product Catalog");
        //setLocationRelativeTo(null);
        setSize(650, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Buttons on the left side
        allButton = new JButton("All");
        allButton.setFont(new Font("Arial",Font.BOLD,16));
        allButton.setBackground(new Color(100,100,100));
        allButton.setForeground(Color.ORANGE);
        allButton.setOpaque(true);
        allButton.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        allButton.setBounds(10, 60, 130, 30);
        add(allButton);

        smartphoneButton = new JButton("Smart Phones");
        smartphoneButton.setFont(new Font("Arial",Font.BOLD,16));
        smartphoneButton.setBackground(new Color(100,100,100));
        smartphoneButton.setForeground(Color.ORANGE);
        smartphoneButton.setOpaque(true);
        smartphoneButton.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        smartphoneButton.setBounds(10, 110, 130, 30);
        add(smartphoneButton);

        sportsButton = new JButton("Sports");
        sportsButton.setFont(new Font("Arial",Font.BOLD,16));
        sportsButton.setBackground(new Color(100,100,100));
        sportsButton.setForeground(Color.ORANGE);
        sportsButton.setOpaque(true);
        sportsButton.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        sportsButton.setBounds(10, 160, 130, 30);
        add(sportsButton);
        
        laptopButton = new JButton("Laptops");
        laptopButton.setFont(new Font("Arial",Font.BOLD,16));
        laptopButton.setBackground(new Color(100,100,100));
        laptopButton.setForeground(Color.ORANGE);
        laptopButton.setOpaque(true);
        laptopButton.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        laptopButton.setBounds(10, 210, 130, 30);
        add(laptopButton);

        imageLabel1=new JLabel();
        ImageIcon i1=new ImageIcon("D:\\java\\E-Commerce\\src\\commerce\\cricket.jpeg");
        Image originalImage1=i1.getImage();
        Image scaledImage1 =originalImage1.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        i1=new ImageIcon(scaledImage1);
        imageLabel1.setIcon(i1);
        imageLabel1.setOpaque(true);
        imageLabel1.setVisible(true);
        imageLabel1.setBounds(220, 100, 100, 100);
        add(imageLabel1);
        
        // Icons with labels in the middle
        cricketBat = new JButton("Cricket Bat");
        cricketBat.setHorizontalTextPosition(JLabel.CENTER);
        cricketBat.setVerticalTextPosition(JLabel.BOTTOM);
        cricketBat.setBounds(220, 220, 100, 30);
        cricketBat.addActionListener(this);
        add(cricketBat);
    
        imageLabel2=new JLabel();
        ImageIcon i2=new ImageIcon("D:\\java\\E-Commerce\\src\\commerce\\smart phone.jpeg");
        Image originalImage2=i2.getImage();
        Image scaledImage2 =originalImage2.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        i2=new ImageIcon(scaledImage2);
        imageLabel2.setIcon(i2);
        imageLabel2.setOpaque(true);
        imageLabel2.setVisible(true);
        imageLabel2.setBounds(350, 100, 100, 100);
        add(imageLabel2);
        
        smartphone = new JButton("Phone");
        smartphone.setHorizontalTextPosition(JLabel.CENTER);
        smartphone.setVerticalTextPosition(JLabel.BOTTOM);
        smartphone.setBounds(360, 220, 80, 30);
        smartphone.addActionListener(this);
        add(smartphone);

        
        imageLabel3=new JLabel();
        ImageIcon i3=new ImageIcon("D:\\java\\E-Commerce\\src\\commerce\\laptop.jpeg");
        Image originalImage3=i3.getImage();
        Image scaledImage3 =originalImage3.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        i3=new ImageIcon(scaledImage3);
        imageLabel3.setIcon(i3);
        imageLabel3.setOpaque(true);
        imageLabel3.setVisible(true);
        imageLabel3.setBounds(490, 100, 120, 120);
        add(imageLabel3);
        
        
        laptop = new JButton("Laptop");
        
        laptop.setHorizontalTextPosition(JLabel.CENTER);
        laptop.setVerticalTextPosition(JLabel.BOTTOM);
        laptop.setBounds(510, 220, 80, 30);
        laptop.addActionListener(this);
        add(laptop);

        // My Cart button on the top right corner
        myCartButton = new JButton("My Cart");
        myCartButton.setFont(new Font("Arial",Font.BOLD,16));
        myCartButton.setBackground(new Color(100,100,100));
        myCartButton.setForeground(Color.ORANGE);
        myCartButton.setOpaque(true);
        myCartButton.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        myCartButton.setBounds(500, 10, 100, 30);
        myCartButton.addActionListener(this);
        add(myCartButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {


     
         if (e.getSource() == cricketBat) {
        	 
        	 cric++;
        	 cricket=true;
        	
        		
        	}
                  
        	else if (e.getSource() == smartphone) {
        		phone++;
        		smartPhone=true;
        		 
        	}
                        
       else if (e.getSource() == laptop) {
    	   lap++;
    		newLaptop=true;
        	
        }
        else if(e.getSource()==myCartButton) {
        	// Handle My Cart button click
        	 new MyCart(cricket,smartPhone,newLaptop,cric,phone,lap);
        	 setVisible(false);
        }
         myCartButton.setText("My Cart ("+String.valueOf(cric+phone+lap)+")");
         
    	
    }

}