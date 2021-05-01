package cadastro.lepon;

public enum RespostasQuestionario {
	SIM("Sim"), NAO("Não"), OUTRO("Outro");
	
	private String descricao;
	
	RespostasQuestionario(String descricao ){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
}