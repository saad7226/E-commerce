package commerce;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpWindow extends JFrame implements ActionListener {

    private JTextField nameField;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField cityField;
    private JTextField phoneNumberField;
    private JComboBox<String> ageComboBox;
    private JButton signUpButton;
    private JButton backButton;

    public SignUpWindow() {
        setTitle("Sign Up");
        setSize(500, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(100,100,100));

        // Name field
        JLabel nameLabel = new JLabel("     Name:");
        nameLabel.setFont(new Font("Arial",Font.BOLD,16));
        nameLabel.setBackground(new Color(100,100,100));
        nameLabel.setForeground(Color.ORANGE);
        nameLabel.setOpaque(true);
        nameLabel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        nameLabel.setBounds(70, 100, 130, 30);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setFont(new Font("Arial",Font.BOLD,16));
        nameField.setForeground(Color.ORANGE);
        nameField.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        nameField.setOpaque(true);
        nameField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        nameField.setBounds(210, 100, 200, 30);
        add(nameField);

        // Username field
        JLabel usernameLabel = new JLabel(" Username:");
        usernameLabel.setFont(new Font("Arial",Font.BOLD,16));
        usernameLabel.setBackground(new Color(100,100,100));
        usernameLabel.setForeground(Color.ORANGE);
        usernameLabel.setOpaque(true);
        usernameLabel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        usernameLabel.setBounds(70, 150, 130, 30);
        add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setFont(new Font("Arial",Font.BOLD,16));
        usernameField.setForeground(Color.ORANGE);
        usernameField.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        usernameField.setOpaque(true);
        usernameField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        usernameField.setBounds(210, 150, 200, 30);
        add(usernameField);

        // Password field
        JLabel passwordLabel = new JLabel(" Password:");
        passwordLabel.setFont(new Font("Arial",Font.BOLD,16));
        passwordLabel.setBackground(new Color(100,100,100));
        passwordLabel.setForeground(Color.ORANGE);
        passwordLabel.setOpaque(true);
        passwordLabel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        passwordLabel.setBounds(70, 200, 130, 30);
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial",Font.BOLD,16));
        passwordField.setForeground(Color.ORANGE);
        passwordField.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        passwordField.setOpaque(true);
        passwordField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        passwordField.setBounds(210, 200, 200, 30);
        add(passwordField);
        
        // City field
        JLabel cityLabel = new JLabel(" City:");
        cityLabel.setFont(new Font("Arial",Font.BOLD,16));
        cityLabel.setBackground(new Color(100,100,100));
        cityLabel.setForeground(Color.ORANGE);
        cityLabel.setOpaque(true);
        cityLabel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        cityLabel.setBounds(70, 250, 130, 30);
        add(cityLabel);

        cityField = new JTextField();
        cityField.setFont(new Font("Arial",Font.BOLD,16));
        cityField.setForeground(Color.ORANGE);
        cityField.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        cityField.setOpaque(true);
        cityField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        cityField.setBounds(210, 250, 200, 30);
        add(cityField);
        
        // Phone number field
        JLabel phoneNumberLabel = new JLabel(" Phone Number:");
        phoneNumberLabel.setFont(new Font("Arial",Font.BOLD,14));
        phoneNumberLabel.setBackground(new Color(100,100,100));
        phoneNumberLabel.setForeground(Color.ORANGE);
        phoneNumberLabel.setOpaque(true);
        phoneNumberLabel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        phoneNumberLabel.setBounds(70, 300, 130, 30);
        add(phoneNumberLabel);

        phoneNumberField = new JTextField();
        phoneNumberField.setFont(new Font("Arial",Font.BOLD,16));
        phoneNumberField.setForeground(Color.ORANGE);
        phoneNumberField.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        phoneNumberField.setOpaque(true);
        phoneNumberField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        phoneNumberField.setBounds(210, 300, 200, 30);
        add(phoneNumberField);
    
        
        // Age combo box
        JLabel ageLabel = new JLabel(" Age:");
        ageLabel.setFont(new Font("Arial",Font.BOLD,16));
        ageLabel.setBackground(new Color(100,100,100));
        ageLabel.setForeground(Color.ORANGE);
        ageLabel.setOpaque(true);
        ageLabel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        ageLabel.setBounds(70, 350, 130, 30);
        add(ageLabel);

        String[] ageOptions = new String[65];
        for (int i = 0; i < 65; i++) {
            ageOptions[i] = String.valueOf(i + 1);
        }

        ageComboBox = new JComboBox<>(ageOptions);
        ageComboBox.setFont(new Font("Arial",Font.BOLD,16));
        ageComboBox.setForeground(Color.ORANGE);
        ageComboBox.setBounds(210, 350, 130, 30);
        add(ageComboBox);

        // Sign Up button
        signUpButton = new JButton("Sign Up");
        signUpButton.setFont(new Font("Arial",Font.BOLD,16));
        signUpButton.setBackground(new Color(100,100,100));
        signUpButton.setForeground(Color.ORANGE);
        signUpButton.setOpaque(true);
        signUpButton.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        signUpButton.setBounds(120, 490, 100, 30);
        signUpButton.addActionListener(this);
        add(signUpButton);

        // Back button
        backButton = new JButton("Back");
        backButton.setFont(new Font("Arial",Font.BOLD,16));
        backButton.setBackground(new Color(100,100,100));
        backButton.setForeground(Color.ORANGE);
        backButton.setOpaque(true);
        backButton.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        backButton.setBounds(240, 490, 100, 30);
        backButton.addActionListener(this);
        add(backButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == signUpButton) {
            // Perform sign-up logic here
            String name = nameField.getText();
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            String city = cityField.getText();
            long phoneNumber = Long.parseLong( phoneNumberField.getText());
            int age = Integer.parseInt((String) ageComboBox.getSelectedItem());
            
            // Add your sign-up logic or call appropriate methods here
            
            UserDetails user1=new UserDetails(name,username,password,city,age,phoneNumber);
          
          //  String name,String username,String password,String city,int age,int phone
            
            userdao.insertUserOdb(user1);
            
            // For example, you can store the user's information in a database
            // After successful sign-up, you can redirect the user to a different window or perform any desired action

            JOptionPane.showMessageDialog(this, "Sign Up Successful!");
            setVisible(false); // Close the sign-up window
            new ProductCatalogWindow();
        } else if (e.getSource() == backButton) {
        	
        	
            setVisible(false); // Close the sign-up window
            new WelcomeWindow(); // Go back to the welcome window
        }
    }
}