package cadastro.lepon;

import java.time.LocalDate;
import java.util.Date;

public class Cliente {
	private String nome;
	private String cpf; // id
	private String endereco;
	private String telefone;
	private String email;
	private LocalDate nascimento;
	
	public Cliente(String Nome, String CPF, String Endereco, String Telefone, String Email, LocalDate Nascimento){
		this.nome = Nome;
		this.cpf = CPF;
		this.endereco = Endereco;
		this.telefone = Telefone;
		this.email = Email;
		this.nascimento = Nascimento;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEmail() {
		return email;
	}
	public String getEndereco() {
		return endereco;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public String getTelefone() {
		return telefone;
	}
	
}
   