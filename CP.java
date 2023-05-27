package commerce;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
			
	static Connection connect;
	public static Connection createC() {
		try {
			//loading drivers
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//now making connection 
			String user ="root";
			String pasword="10205";
			String url="jdbc:mysql://127.0.0.1:3306/ecomerce";
			
			connect=DriverManager.getConnection(url,user,pasword);
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return connect;
		
		
	}
	
}
