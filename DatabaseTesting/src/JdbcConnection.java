import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection 
{

	public static void main(String[] args) throws SQLException 
	{
		String host="localhost";
		String port="3306";
		String user="root";
		String password="your_password";
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + 
		"/qadb", user,password);
		
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from EmployeeInfo where name='a1';");
		while(rs.next()) 
		{
			
			System.out.println(rs.getString("id"));
			System.out.println(rs.getString("location"));
		
		}
	}

}
