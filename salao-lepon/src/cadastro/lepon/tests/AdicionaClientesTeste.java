
package cadastro.lepon.tests;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import lepon.repository.ConnectionFactory;

public class AdicionaClientesTeste {
	public static void main(String[] args) throws SQLException {
		
		//cria / chama a cnocexao com o BD
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.criaConexao();
		
		// faz so chamar stm. para escrever no BD
		Statement stm = connection.createStatement();
	
		
		//apaguei os testes feitos
		
		
		
		
	}
}
