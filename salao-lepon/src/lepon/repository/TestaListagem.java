package lepon.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.criaConexao();
		
		Statement stm = connection.createStatement();
		
		stm.execute("SELECT `Cliente`.`CPF`,\n"
				+ "    `Cliente`.`Nome`,\n"
				+ "    `Cliente`.`Endereco`,\n"
				+ "    `Cliente`.`Telefone`,\n"
				+ "    `Cliente`.`Email`,\n"
				+ "    `Cliente`.`Nascimento`\n"
				+ "FROM `lepon`.`Cliente`;\n"
				+ "");
		
		ResultSet rst = stm.getResultSet();	
		
		while(rst.next()) {
			String CPF = rst.getString("CPF");
			String nome = rst.getString("Nome");
			String endereco = rst.getString("Endereco");
			String telefone = rst.getString("Telefone");
			String email = rst.getString("Email");
			Date nascimento = rst.getDate("Nascimento");
			
			System.out.println(CPF);
			System.out.println(nome);
			System.out.println(endereco);
			System.out.println(telefone);
			System.out.println(email);
			System.out.println(nascimento);
		}
		
	}
	
}
