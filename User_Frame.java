package commerce;

import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class User_Frame extends JFrame implements ActionListener {
   
    private JButton closeButton,addButton,deleteButton;
    private JTable table;
    private JScrollPane pane;
   

    public User_Frame() {
        setTitle("User Details");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(100,100,100));
        
     
        
        closeButton= new JButton("Close");
        closeButton.setFont(new Font("Arial",Font.BOLD,16));
        closeButton.setBackground(new Color(100,100,100));
        closeButton.setForeground(Color.ORANGE);
        closeButton.setOpaque(true);
        closeButton.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        closeButton.setBounds(340, 400, 100, 30);
        closeButton.addActionListener(this); 
        add(closeButton);
        
     
        
        
        addButton= new JButton("Add");
        addButton.setFont(new Font("Arial",Font.BOLD,16));
        addButton.setBackground(new Color(100,100,100));
        addButton.setForeground(Color.ORANGE);
        addButton.setOpaque(true);
        addButton.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        addButton.setBounds(80, 400, 100, 30);
        addButton.addActionListener(this); 
        add(addButton);
        
        deleteButton= new JButton("Delete");
        deleteButton.setFont(new Font("Arial",Font.BOLD,16));
        deleteButton.setBackground(new Color(100,100,100));
        deleteButton.setForeground(Color.ORANGE);
        deleteButton.setOpaque(true);
        deleteButton.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        deleteButton.setBounds(210, 400, 100, 30);
        deleteButton.addActionListener(this); 
        add(deleteButton);
        
        displaytable dt=new displaytable();
       pane=dt.displaytable1();
       pane.setBounds(50, 50, 650, 300);
        add(pane);
       
     
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == closeButton) {
            setVisible(false);
           new AdminPanelWindow();
          
        } else if (e.getSource() == addButton) {
            // Handle Add button click
        	boolean b=true,c=false;
        	new Addition(b,c);
            // Add your code here
        } else if (e.getSource() == deleteButton) {
            // Handle Delete button click
        	boolean b=true,c=false;
        	new Addition(c,b);
            // Add your code here
        }
    }
}