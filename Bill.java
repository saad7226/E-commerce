package commerce;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Bill extends JFrame implements ActionListener {
    private JLabel titleLabel,quantityLabel,priceLabel,sumLabel,productNameLabel1,productNameLabel2,productNameLabel3;
    private JTextField priceField1,priceField2,priceField3;  
    private JTextField quantityField1,quantityField2,quantityField3;  
    private JTextField sumField1,sumField2,sumField3;
    private JLabel totalBillsLabel;
    private JTextField totalSumField;
    private JButton closeButton;

    public Bill(boolean cricket,boolean laptop,boolean phone,int cric,int ph,int lap) {
        // Set frame properties
        setTitle("Your Bill");
        setSize(600, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Set layout manager to null

        // Create and add components to the frame
        titleLabel = new JLabel("Your Bill");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setBounds(150, 10, 100, 30); // Set position and size
        add(titleLabel);

        quantityLabel = new JLabel("Quantity");
        quantityLabel.setBounds(255, 30, 100, 20);
        add(quantityLabel);

        priceLabel = new JLabel("Price");
        priceLabel.setBounds(370, 30, 100, 20);
        add(priceLabel);

        sumLabel = new JLabel("Sum");
        sumLabel.setBounds(480, 30, 100, 20);
        add(sumLabel);

        productNameLabel1 = new JLabel("Cricket Bat");
        productNameLabel1.setBounds(10, 50, 100, 20);
        productNameLabel1.setVisible(cricket);
        add(productNameLabel1);
        priceField1 = new JTextField("PKR 1000");
        priceField1.setEditable(false);
        priceField1.setBounds(340, 50, 100, 20);
        priceField1.setVisible(cricket);
        add(priceField1);
        quantityField1 = new JTextField(String.valueOf(cric));
        quantityField1.setBounds(230, 50, 100, 20);
        quantityField1.setEditable(false);
        quantityField1.setVisible(cricket);
        add(quantityField1);
        int sumcric=cric*1000;
        sumField1 = new JTextField("PKR "+String.valueOf(sumcric));
        sumField1.setBounds(450, 50, 100, 20);
        sumField1.setEditable(false);
        sumField1.setVisible(cricket);
        add(sumField1);

        productNameLabel2 = new JLabel("SmartPhone");
        productNameLabel2.setBounds(10, 80, 100, 20);
        productNameLabel2.setVisible(phone);
        add(productNameLabel2);
        priceField2 = new JTextField("PKR 20000");
        priceField2.setBounds(340, 80, 100, 20);
        priceField2.setEditable(false);
        priceField2.setVisible(phone);
        add(priceField2);
        quantityField2 = new JTextField(String.valueOf(ph));
        quantityField2.setBounds(230, 80, 100, 20);
        quantityField2.setEditable(false);
        quantityField2.setVisible(phone);
        add(quantityField2);
        int sumph=ph*20000;
        sumField2 = new JTextField("PKR "+String.valueOf(sumph));
        sumField2.setBounds(450, 80, 100, 20);
        sumField2.setEditable(false);
        sumField2.setVisible(phone);
        add(sumField2);

        productNameLabel3 = new JLabel("Laptop");
        productNameLabel3.setBounds(10, 110, 100, 20);
        productNameLabel3.setVisible(laptop);
        add(productNameLabel3);
        priceField3 = new JTextField("PKR 25000");
        priceField3.setBounds(340, 110, 100, 20);
        priceField3.setEditable(false);
        priceField3.setVisible(laptop);
        add(priceField3);
        quantityField3 = new JTextField(String.valueOf(lap));
        quantityField3.setBounds(230, 110, 100, 20);
        quantityField3.setEditable(false);
        quantityField3.setVisible(laptop);
        add(quantityField3);
        int sumLap=25000*lap;
        sumField3 = new JTextField("PKR "+String.valueOf(sumLap));
        sumField3.setBounds(450, 110, 100, 20);
        sumField3.setVisible(laptop);
        sumField3.setEditable(false);
        add(sumField3);

        totalBillsLabel = new JLabel("Total Bills");
        totalBillsLabel.setBounds(10, 140, 100, 20);
        add(totalBillsLabel);
        int totalSum=sumLap+sumph+sumcric;
        totalSumField = new JTextField("PKR "+String.valueOf(totalSum));
        totalSumField.setEditable(false);
        totalSumField.setBounds(450, 140, 100, 20);
        add(totalSumField);

        closeButton = new JButton("Close");
        closeButton.setBounds(270, 200, 100, 30);
        closeButton.addActionListener(this);
        add(closeButton);

        // Set frame size and visibility
        
        setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource()==closeButton) {
			new WelcomeWindow();
		}
		
	}
	


}