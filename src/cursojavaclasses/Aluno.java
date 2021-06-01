package cursojavaclasses;



public class Aluno {
	
	public String nome;
	int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCPF;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	
	public Aluno() {
		
	}
	
	public Aluno(String nomePadrao) {
		nome=nomePadrao;		
		
	}
	
	public Aluno(String nomePadrao, int IdadePadrao) {
		nome=nomePadrao;		
		idade=IdadePadrao;
	}


}
