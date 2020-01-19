package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		String NOME = JOptionPane.showInputDialog("Qual o nome do aluno ?");
		Integer IDADE = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do aluno ?"));
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
		aluno1.setIdade(IDADE);
		/*
		 * aluno1.setDataNascimento(DNASC); aluno1.setRegitroGeral(RG);
		 * aluno1.setNumeroCPF(CPF); aluno1.setNomeMae(NMAE); aluno1.setNomePai(NPAI);
		 * aluno1.setDataMatricula(DMATR); aluno1.setSerieMatriculado(SERIE);
		 * aluno1.setNomeEscola(NOMEESCOLA);
		 */

		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("QUAL A DISCIPLINA  " + pos + " ");
			String notaDisciplina = JOptionPane.showInputDialog("QUAL A NOTA " + pos + " ");
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			aluno1.getDisciplina().add(disciplina);
		}

		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
		if (escolha == 0) {

			int continuarremover = 0;
			int posicao = 1;
			while (continuarremover == 0) {

				String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina deseja remover ? 1,2,3 ou 4 ?");
				aluno1.getDisciplina().remove(Integer.parseInt(disciplinaRemover) - posicao);
				posicao++;
				continuarremover = JOptionPane.showConfirmDialog(null, "deseja remover outra disciplina ?");

			}

		}

		System.out.println(aluno1.toString() + " Media notas  " + aluno1.getMediaNota() + aluno1.getAlunoAprovado2());

	}

}
