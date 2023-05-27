package commerce;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeWindow extends JFrame implements ActionListener {
	
	private JLabel imageLabel;
    private JButton signUpButton;
    private JButton loginButton;
    private JButton adminLoginButton;

    public WelcomeWindow() {
        setTitle("E-commerce Application");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(100,100,100));
        
        
        
        
        
        

        // Centered welcome message
        JLabel welcomeLabel = new JLabel("Welcome to E-commerce Application");
        welcomeLabel.setFont(new Font("Arial",Font.BOLD,16));
        welcomeLabel.setBackground(new Color(100,100,100));
        welcomeLabel.setForeground(Color.ORANGE);
        welcomeLabel.setOpaque(true);
        welcomeLabel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
        welcomeLabel.setBounds(80, 50, 300, 30);
        add(welcomeLabel);
        
        
        //image icon
        
        imageLabel=new JLabel();
        ImageIcon i1=new ImageIcon("D:\\java\\E-Commerce\\src\\commerce/ECom.jpeg");
        Image originalImage=i1.getImage();
        Image scaledImage =originalImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        i1=new ImageIcon(scaledImage);
        imageLabel.setIcon(i1);
        imageLabel.setOpaque(true);
        imageLabel.setVisible(true);
        imageLabel.setBounds(180, 100, 100, 100);
        add(imageLabel);
        
        
        

        // Sign Up button
        signUpButton = new JButton("Sign Up");
        signUpButton.setFont(new Font("Arial",Font.BOLD,16));
        signUpButton.setBackground(new Color(100,100,100));
        signUpButton.setForeground(Color.ORANGE);
        signUpButton.setOpaque(true);
        signUpButton.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        signUpButton.setBounds(40, 250, 150, 30);
        signUpButton.addActionListener(this);
        add(signUpButton);

        // Login button
        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial",Font.BOLD,16));
        loginButton.setBackground(new Color(100,100,100));
        loginButton.setForeground(Color.ORANGE);
        loginButton.setOpaque(true);
        loginButton.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        loginButton.setBounds(300, 250, 150, 30);
        loginButton.addActionListener(this);
        add(loginButton);

        // Admin Login button
        adminLoginButton = new JButton("Admin Login");
        adminLoginButton.setFont(new Font("Arial",Font.BOLD,16));
        adminLoginButton.setBackground(new Color(100,100,100));
        adminLoginButton.setForeground(Color.ORANGE);
        adminLoginButton.setOpaque(true);
        adminLoginButton.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        adminLoginButton.setBounds(170, 300, 150, 30);
        adminLoginButton.addActionListener(this);
        add(adminLoginButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == signUpButton) {
            // Open Sign Up window
        	setVisible(false);
        	new SignUpWindow();
            ;
        } else if (e.getSource() == loginButton) {
            // Open Login window
        	setVisible(false);
        	new LoginWindow()
            ;
        } else if (e.getSource() == adminLoginButton) {
            // Open Admin Login window
        	setVisible(false);
        	new AdminLoginWindow();
        	
          
        }
    }

   
}