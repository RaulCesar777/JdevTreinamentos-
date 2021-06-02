package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojavaclasses.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		
		///////////////////////////////////////////////////////////////////////////
		
		String nome = JOptionPane.showInputDialog("Nome do aluno");
		String idade = JOptionPane.showInputDialog("Idade do aluno");
		String nascimento = JOptionPane.showInputDialog("Data de nascimento");
		String dataMatricula = JOptionPane.showInputDialog("Data da matricula");		
		String nomeMae = JOptionPane.showInputDialog("Nome da mae");		
		String nomePai = JOptionPane.showInputDialog("Nome do Pai");
		String CPF = JOptionPane.showInputDialog("CPF do aluno");
		String RegistroGeral = JOptionPane.showInputDialog("Registro Geral do aluno");
		String nota1 = JOptionPane.showInputDialog("Nota 1");
		String nota2 = JOptionPane.showInputDialog("Nota 2");
		String nota3 = JOptionPane.showInputDialog("Nota 3");
		String nota4 = JOptionPane.showInputDialog("Nota 4");
		
		
		
		
		
		/////////////////////////////////////////////////////////////////////////

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setDataNascimento(nascimento);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setNumeroCPF(CPF);
		aluno1.setRegistroGeral(RegistroGeral);
		aluno1.setNota1(Double.valueOf(nota1));
		aluno1.setNota2(Double.valueOf(nota2));
		aluno1.setNota3(Double.valueOf(nota3));
		aluno1.setNota4(Double.valueOf(nota4));
		
		
		
		
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("Nome :" + aluno1.getNome() + "  Idade :" + aluno1.getIdade());
		System.out.println(aluno1.getMediaNota());

		System.out.println("Situação do Aluno : " + aluno1.getAlunoAprovado2());
		System.out.println("Situação do Aluno : " + (aluno1.getAlunoAprovado() ? "aprovado" : "reprovado"));

	}

}
