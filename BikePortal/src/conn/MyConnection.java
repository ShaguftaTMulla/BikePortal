package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class MyConnection {
	private Connection con;
	public Connection getConn()
	{
		try {
			if(con==null || con.isClosed())
			{
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bikeportal","root","");
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return con;
	}
}
