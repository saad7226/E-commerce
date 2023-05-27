package commerce;
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	public class AdminPanelWindow extends JFrame implements ActionListener {
		private JLabel imageLabel;
	    private JButton userButton;
	    
	    private JButton closeButton;

	    public AdminPanelWindow() {
	        setTitle("Admin Panel");
	        setSize(500, 500);
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(null);
	        getContentPane().setBackground(new Color(100,100,100));

	        // User Button
	        userButton = new JButton("User");
	        userButton.setFont(new Font("Arial",Font.BOLD,16));
	        userButton.setBackground(new Color(100,100,100));
	        userButton.setForeground(Color.ORANGE);
	        userButton.setOpaque(true);
	        userButton.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
	        userButton.setBounds(10, 320, 150, 40);
	        userButton.addActionListener(this);
	        add(userButton);
	        
	        //image icon
	        imageLabel=new JLabel();
	        ImageIcon i1=new ImageIcon("D:\\java\\E-Commerce\\src\\commerce/AdminPanel.jpeg");
	        Image originalImage=i1.getImage();
	        Image scaledImage =originalImage.getScaledInstance(180, 180, Image.SCALE_SMOOTH);
	        i1=new ImageIcon(scaledImage);
	        imageLabel.setIcon(i1);
	        imageLabel.setOpaque(true);
	        imageLabel.setVisible(true);
	        imageLabel.setBounds(150, 100, 180, 180);
	        add(imageLabel);

	        
	      

	        
	        closeButton = new JButton("Close");
	        closeButton.setFont(new Font("Arial",Font.BOLD,16));
	        closeButton.setBackground(new Color(100,100,100));
	        closeButton.setForeground(Color.ORANGE);
	        closeButton.setOpaque(true);
	        closeButton.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
	        closeButton.setBounds(330, 320, 150, 40);
	        closeButton.addActionListener(this);
	        add(closeButton);

	        setVisible(true);
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == userButton) {
	            
	        	
	        	dispose();
	        	

	              new User_Frame();
	        
	            
	        } 
	        else if (e.getSource() == closeButton) {
	            
	        	new WelcomeWindow();
	        	 
	             };

	             

	             
	             
	            
	        }
	    }
	