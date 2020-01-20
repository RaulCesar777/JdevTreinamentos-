package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		List<Aluno> alunosAprovados = new ArrayList<Aluno>();

		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();

		List<Aluno> alunosReprovados = new ArrayList<Aluno>();

		for (int qtd = 0; qtd <= 5; qtd++) {

			String NOME = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
			//Integer IDADE = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do aluno ?"));
			/*
			 * String DNASC = JOptionPane.showInputDialog("Qual a data de nascimento ?");
			 * String RG = JOptionPane.showInputDialog("Qual o RG do aluno ?"); String CPF =
			 * JOptionPane.showInputDialog("Qual o CPFdo aluno ?"); String NMAE =
			 * JOptionPane.showInputDialog("Qual o nome da mae do aluno ?"); String NPAI =
			 * JOptionPane.showInputDialog("Qual o nome do pai do aluno ?"); String DMATR =
			 * JOptionPane.showInputDialog("Qual a data de matricula ?"); String SERIE =
			 * JOptionPane.showInputDialog("Qual a serie  ?"); String NOMEESCOLA =
			 * JOptionPane.showInputDialog("Qual o nome da escola ?");
			 */

			Aluno aluno1 = new Aluno();
			aluno1.setNome(NOME);
			//aluno1.setIdade(IDADE);
			/*
			 * aluno1.setDataNascimento(DNASC); aluno1.setRegitroGeral(RG);
			 * aluno1.setNumeroCPF(CPF); aluno1.setNomeMae(NMAE); aluno1.setNomePai(NPAI);
			 * aluno1.setDataMatricula(DMATR); aluno1.setSerieMatriculado(SERIE);
			 * aluno1.setNomeEscola(NOMEESCOLA);
			 */

			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("QUAL A DISCIPLINA  " + pos + " ");
				String notaDisciplina = JOptionPane.showInputDialog("QUAL A NOTA " + pos + " ");
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));
				aluno1.getDisciplinas().add(disciplina);
			}

			/*int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
			if (escolha == 0) {

				int continuarremover = 0;
				int posicao = 1;
				while (continuarremover == 0) {

					String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina deseja remover ? 1,2,3 ou 4 ?");
					aluno1.getDisciplinas().remove(Integer.parseInt(disciplinaRemover) - posicao);
					posicao++;
					continuarremover = JOptionPane.showConfirmDialog(null, "deseja remover outra disciplina ?");

				}

			}*/

			alunos.add(aluno1);
		}
		for (Aluno aluno : alunos) {

			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);
			} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				alunosRecuperacao.add(aluno);
			} else {
				alunosReprovados.add(aluno);
			}

		}
		System.out.println(".....................");
		System.out.println("lista dos aprovados");
		for (Aluno aluno : alunosAprovados) {
			System.out.println("Nome = "+ aluno.getNome()+"Resultado = "+aluno.getAlunoAprovado2());
		}
		System.out.println(".....................");
		System.out.println("lista dos Recuperação");

		for (Aluno aluno : alunosRecuperacao) {
			System.out.println("Nome = "+ aluno.getNome()+"Resultado = "+aluno.getAlunoAprovado2());
		}

		System.out.println(".....................");
		System.out.println("lista dos Reprovados");

		for (Aluno aluno : alunosReprovados) {
			System.out.println("Nome = "+ aluno.getNome()+"Resultado = "+aluno.getAlunoAprovado2());
		}

	}

}
