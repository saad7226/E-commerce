package commerce;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginWindow extends JFrame implements ActionListener {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton backButton;

    public LoginWindow() {
        setTitle("Login");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(100,100,100));

        // Username field
        JLabel usernameLabel = new JLabel(" Username:");
        usernameLabel.setFont(new Font("Arial",Font.BOLD,16));
        usernameLabel.setBackground(new Color(100,100,100));;
        usernameLabel.setForeground(Color.ORANGE);
        usernameLabel.setOpaque(true);
        usernameLabel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        usernameLabel.setBounds(90, 130, 100, 30);
        add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setFont(new Font("Arial",Font.BOLD,16));
        usernameField.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        usernameField.setForeground(Color.ORANGE);
        usernameField.setOpaque(true);
        usernameField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        usernameField.setBounds(190, 130, 200, 30);
        add(usernameField);

        // Password field
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial",Font.BOLD,16));
        passwordLabel.setBackground(new Color(100,100,100));
        passwordLabel.setForeground(Color.ORANGE);
        passwordLabel.setOpaque(true);
        passwordLabel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        passwordLabel.setBounds(90, 180, 100, 30);
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial",Font.BOLD,16));
        passwordField.setForeground(Color.ORANGE);
        passwordField.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        passwordField.setOpaque(true);
        passwordField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        passwordField.setBounds(190, 180, 200, 30);
        add(passwordField);

        // Login button
        loginButton= new JButton("Login");
        loginButton.setFont(new Font("Arial",Font.BOLD,16));
        loginButton.setBackground(new Color(100,100,100));
        loginButton.setForeground(Color.ORANGE);
        loginButton.setOpaque(true);
        loginButton.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        loginButton.setBounds(100,250, 100, 30);
        loginButton.addActionListener(this);
        add(loginButton);

        // Back button
        backButton = new JButton("Back");
        backButton.setFont(new Font("Arial",Font.BOLD,16));
        backButton.setBackground(new Color(100,100,100));
        backButton.setForeground(Color.ORANGE);
        backButton.setOpaque(true);
        backButton.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        backButton.setBounds(250, 250, 100, 30);
        backButton.addActionListener(this);
        add(backButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            // Perform login logic here
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            
            UserDetails user1=new UserDetails();
             user1= RetreiveData.retreiveFromDatabase(username);
            	if (user1 != null) {
            					String checkName=user1.getUsername();
            						String checkpassword=user1.getPassword();
           
            						if(username.equals(checkName) && password.equals(checkpassword)) {
        	   
           							setVisible(false);  // Close the login window
           							JOptionPane.showMessageDialog(this, "Login Successful!");
           							new ProductCatalogWindow();
        	  
            
           							
            						}
           				else {
           							JOptionPane.showMessageDialog(this, "Invalid Cereditials");
           								
           						}
            				}
            	else
            			{
            	
            		JOptionPane.showMessageDialog(this, "Record not Found. Please Sign Up");
            		}
 
        	}
        else if (e.getSource() == backButton) {
        							new WelcomeWindow(); // Go back to the welcome window
        	
        								setVisible(false); // Close the login window
        									}
    }


}