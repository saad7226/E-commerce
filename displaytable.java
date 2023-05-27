package commerce;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class displaytable  {
	JTable table;
	DefaultTableModel model;
	JScrollPane scrollpane;
	JPanel j;
	
	public JScrollPane displaytable1() {
		
	/*	setTitle("Detail Table ");
		
		
		setSize(600,300);
		setLocationRelativeTo(null);*/
		String [] columnName= {"id","name","username","phone","password","age","city"};
		
		DefaultTableModel model=new DefaultTableModel(columnName,0);
		table=new JTable(model);
		
		JScrollPane scrollpane=new JScrollPane(table);
		
		
		
		//getContentPane().add(scrollpane);
		
		try {
			Connection con=CP.createC();
			String query="Select id,name,username,phone,password,city,age FROM user";
			PreparedStatement ps =con.prepareStatement(query);
			
			ResultSet rsts=ps.executeQuery();
			
			while(rsts.next()) {
				
				int id=rsts.getInt("id");
				String name=rsts.getString("name");
				String username=rsts.getString("username");
				long phone=rsts.getLong("phone");
				String password=rsts.getString("password");
				int age=rsts.getInt("age");
				String city=rsts.getString("city");
				
				model.addRow(new Object[] {id,name,username,phone,password,age,city});
				/*setAlwaysOnTop(true);
		setVisible(true);*/
				
				
			}
			rsts.close();
			ps.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return scrollpane;
		
	}
	

}