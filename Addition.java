package commerce;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Addition extends JFrame implements ActionListener{



	
	    private JTextField nameField;
	    private JTextField usernameField;
	    private JPasswordField passwordField;
	    private JTextField cityField;
	    private JTextField phoneNumberField;
	    private JComboBox<String> ageComboBox;
	    private JButton signUpButton;
	    private JButton backButton;
	 JButton ad,delete;
	
	
	public Addition(boolean a,boolean b){
			
		

		   
		        setTitle("Details");
		        setSize(500, 600);
		        setLocationRelativeTo(null);
		        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        setLayout(null);
		        getContentPane().setBackground(new Color(100,100,100));

		        // Name field
		        JLabel nameLabel = new JLabel("Name:");
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
		        usernameLabel.setVisible(a);
		        usernameLabel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		        usernameLabel.setBounds(70, 150, 130, 30);
		        add(usernameLabel);

		        usernameField = new JTextField();
		        usernameField.setFont(new Font("Arial",Font.BOLD,16));
		        usernameField.setForeground(Color.ORANGE);
		        usernameField.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		        usernameField.setVisible(a);
		        usernameField.setOpaque(true);
		        usernameField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		        usernameField.setBounds(210, 150, 200, 30);
		        add(usernameField);

		        // Password field
		        JLabel passwordLabel = new JLabel(" Password:");
		        passwordLabel.setFont(new Font("Arial",Font.BOLD,16));
		        passwordLabel.setBackground(new Color(100,100,100));
		        passwordLabel.setForeground(Color.ORANGE);
		        passwordLabel.setVisible(a);
		        passwordLabel.setOpaque(true);
		        passwordLabel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		        passwordLabel.setBounds(70, 200, 130, 30);
		        add(passwordLabel);

		        passwordField = new JPasswordField();
		        passwordField.setVisible(a);
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
		        cityLabel.setVisible(a);
		        cityLabel.setForeground(Color.ORANGE);
		        cityLabel.setOpaque(true);
		        cityLabel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		        cityLabel.setBounds(70, 250, 130, 30);
		        add(cityLabel);

		        cityField = new JTextField();
		        cityField.setFont(new Font("Arial",Font.BOLD,16));
		        cityField.setVisible(a);
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
		        phoneNumberLabel.setVisible(a);
		        phoneNumberLabel.setOpaque(true);
		        phoneNumberLabel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		        phoneNumberLabel.setBounds(70, 300, 130, 30);
		        add(phoneNumberLabel);

		        phoneNumberField = new JTextField();
		        phoneNumberField.setFont(new Font("Arial",Font.BOLD,16));
		        phoneNumberField.setForeground(Color.ORANGE);
		        phoneNumberField.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		        phoneNumberField.setVisible(a);
		        phoneNumberField.setOpaque(true);
		        phoneNumberField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		        phoneNumberField.setBounds(210, 300, 200, 30);
		        add(phoneNumberField);
		    
		        
		        // Age combo box
		        JLabel ageLabel = new JLabel(" Age:");
		        ageLabel.setFont(new Font("Arial",Font.BOLD,16));
		        ageLabel.setBackground(new Color(100,100,100));
		        ageLabel.setForeground(Color.ORANGE);
		        ageLabel.setVisible(a);
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
		        ageComboBox.setVisible(a);
		        ageComboBox.setForeground(Color.ORANGE);
		        ageComboBox.setBounds(210, 350, 130, 30);
		        add(ageComboBox);

		        ad=new JButton ("Add");
		        ad.setBounds(100, 490, 100, 30);
		        ad.setBackground(new Color(100,100,100));
		        ad.setForeground(Color.ORANGE);
		        ad.setOpaque(true);
		        ad.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		        ad.setFont(new Font("Arial",Font.BOLD,16));

		        ad.setVisible(a);
		        ad.addActionListener(this);
		      add(ad);
		        delete=new JButton ("Delete");
		        delete.setBounds(100, 490, 100, 30);
		        delete.setFont(new Font("Arial",Font.BOLD,16));
		        delete.addActionListener(this);
		        delete.setBackground(new Color(100,100,100));
		        delete.setForeground(Color.ORANGE);
		        delete.setOpaque(true);
		        delete.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

		        delete.setVisible(b);
		       add(delete);
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
		// TODO Auto-generated method stub
		if (e.getSource()==ad) {
			
			String name=nameField.getText();
			String username=usernameField.getText();
			String password=new String(passwordField.getPassword());
			String city=cityField.getText();
			 long phoneNumber = Long.parseLong( phoneNumberField.getText());
	         int age = Integer.parseInt((String) ageComboBox.getSelectedItem());
			
			
			
			
	         UserDetails d1=new UserDetails(name, username, password, city, age, phoneNumber);
			
			userdao dd=new userdao();
			boolean f=dd.insertUserOdb(d1);
			if(f) {
			JOptionPane.showMessageDialog(null, "Record Added");
			}
			
		}
		
		
		else if (e.getSource()==delete) {
			
			String name=nameField.getText();
			String username=usernameField.getText();
			String password=new String(passwordField.getPassword());
			String city=cityField.getText();
			 long phoneNumber = 0;
	         int age = Integer.parseInt((String) ageComboBox.getSelectedItem());
			
			 
	         UserDetails d1=new UserDetails(name,username,password,city, age,phoneNumber);
			userdao dd=new userdao();
			boolean f=dd.delete(d1);
			if(f) {
				JOptionPane.showMessageDialog(null, "Record Deleted");
				}
		
	}
else if (e.getSource() == backButton) {
        	
        	
            setVisible(false); // Close the sign-up window
            new User_Frame(); // Go back to the welcome window
        }
		
	

}}

