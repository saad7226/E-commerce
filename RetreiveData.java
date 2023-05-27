package commerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetreiveData {
	
static	UserDetails user2=null;
	public static  UserDetails retreiveFromDatabase(String user_name)  {
		try {
				Connection con=CP.createC();
				
				String query="Select id,name,username, age,phone,password,city from user where username=?";
				PreparedStatement ps= con.prepareStatement(query);
				ps.setString(1, user_name);
				ResultSet rs= ps.executeQuery();
				// id | name  | username | phone      | password | city  | age
				while (rs.next()) {
					
						int id=rs.getInt("id");
						String name= rs.getString("name");
						int age=rs.getInt("age");
						long phone=rs.getLong("phone");
						String city=rs.getString("city");
						String username=rs.getString("username");
						String password=rs.getString("password");
						
						
						//UserDetails(String name,String username,String password,String city,int age,long phone)
						
						user2=new UserDetails(name,username,password,city,age,phone);
						
									}
				
				rs.close();
				ps.close();
				con.close();
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
		return user2;
				
		
	}
}
