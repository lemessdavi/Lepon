package lepon.repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
		
	public Connection criaConexao() throws SQLException{
		return DriverManager
				.getConnection("jdbc:mysql://127.0.0.1:3306/lepon","root","Slytherin8");
	}
		
	
}