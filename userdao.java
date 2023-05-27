package commerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class userdao {
	public static boolean  insertUserOdb(UserDetails st) {
		boolean f=false;
		
		try {
			Connection con=CP.createC();
			
			String query="insert into user(name,username,password,phone,city,age) values(?,?,?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1, st.getName());
			pstmt.setString(2, st.getUsername());
			pstmt.setString(3, st.getPassword());
			pstmt.setLong(4, st.getPhone());
			pstmt.setString(5, st.getCity());
			pstmt.setInt(6, st.getAge());
	
					
			
			
			pstmt.executeUpdate();
			
			f=true;
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return f;
	}
	
	public  boolean delete(UserDetails s1) {
	    Connection con = CP.createC();
	    boolean f;
	    try {
	    		String query = "DELETE FROM user WHERE name=?";
	    		PreparedStatement ps = con.prepareStatement(query);
	    		ps.setString(1, s1.getName());
	    		ps.executeUpdate();
	    		f=true;
	    	} catch (Exception e) {
	   
	    	
	    		f=false;
	    	e.printStackTrace();
	    }
	    
	    return f;
	}

	
	
}
