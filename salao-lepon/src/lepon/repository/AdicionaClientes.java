package lepon.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public abstract class AdicionaClientes {

	public void addCliente(String Nome, String CPF, String Endereco, String Telefone, String Email, LocalDate Nascimento) throws SQLException{
		//cria / chama a cnocexao com o BD
				ConnectionFactory factory = new ConnectionFactory();
				Connection connection = factory.criaConexao();
				
				// faz so chamar stm. para escrever no BD
				Statement stm = connection.createStatement();
				
				
				stm.execute("INSERT INTO `lepon`.`Cliente`\n"
						+ "(`CPF`,\n"
						+ "`Nome`,\n"
						+ "`Endereco`,\n"
						+ "`Telefone`,\n"
						+ "`Email`,\n"
						+ "`Nascimento`)\n"
						+ "VALUES ("
						+ "`" + CPF + "`" + ","
						+"`" + Nome + "`" + ","
						+ "`" + Endereco + "`" + ","
						+ "`" + Telefone + "`" + ","
						+ "`" + Email + "`" + ","
						+ "`" + Nascimento + "`" 
						+ ")");
	}
}
