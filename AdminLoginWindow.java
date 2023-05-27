package commerce;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class AdminLoginWindow extends JFrame implements ActionListener {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton backButton;

    public AdminLoginWindow() {
        setTitle("Admin Login");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(100,100,100));
        
       

        // Username Label
        JLabel usernameLabel = new JLabel("Admin");
        usernameLabel.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        usernameLabel.setFont(new Font("Arial",Font.BOLD,16));
        usernameLabel.setBackground(new Color(100,100,100));
        usernameLabel.setForeground(Color.ORANGE);	
        usernameLabel.setOpaque(true);
        usernameLabel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        usernameLabel.setBounds(70, 130, 100, 25);
        add(usernameLabel);

        // Username Field
        usernameField = new JTextField();
        usernameField.setFont(new Font("Arial",Font.BOLD,16));
       
        usernameField.setForeground(Color.ORANGE);
        usernameField.setOpaque(true);
        usernameField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        usernameField.setBounds(170, 130, 150, 25);
        add(usernameField);

        // Password Label
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial",Font.BOLD,16));
        passwordLabel.setBackground(new Color(100,100,100));
        passwordLabel.setForeground(Color.ORANGE);
        passwordLabel.setOpaque(true);
        passwordLabel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        passwordLabel.setBounds(70, 170, 100, 25);
        add(passwordLabel);

        // Password Field
        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial",Font.BOLD,16));
      
        passwordField.setForeground(Color.ORANGE);
        passwordField.setOpaque(true);
        passwordField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        passwordField.setBounds(170, 170, 150, 25);
        add(passwordField);

        // Login Button
        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial",Font.BOLD,16));
        loginButton.setBackground(new Color(100,100,100));
        loginButton.setForeground(Color.ORANGE);
        loginButton.setOpaque(true);
        loginButton.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        loginButton.setBounds(80, 220, 80, 25);
        loginButton.addActionListener(this);
        add(loginButton);

        // Back Button
        backButton = new JButton("Back");
        backButton.setFont(new Font("Arial",Font.BOLD,16));
        backButton.setBackground(new Color(100,100,100));
        backButton.setForeground(Color.ORANGE);
        backButton.setOpaque(true);
        backButton.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        backButton.setBounds(240, 220, 80, 25);
        backButton.addActionListener(this);
        add(backButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            
            if (username.equals("admin") && password.equals("password")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
                setVisible(false);
                new AdminPanelWindow();
                
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Credentials");
            }
        } else if (e.getSource() == backButton) {
            
            setVisible(false);
            new WelcomeWindow();
        }
    }

  
}