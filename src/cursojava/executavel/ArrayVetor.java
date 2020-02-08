package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
    public static void main(String[] args) {

        Double[] notas = { 8.8, 9.9, 7.7, 3.1 };
        Double[] notasLOGICA = { 6.8, 4.9, 7.4, 5.6, 10.0, 5.9, 9.8 };

        Aluno aluno = new Aluno();
        aluno.setNome("RAUL CESAR ");
        aluno.setNomeEscola("JDEVTreinamentos");

        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("JAVA");
        disciplina.setNota(notas);
        aluno.getDisciplinas().add(disciplina);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("lOGICA DE PROGRAMAÇÃO");
        disciplina2.setNota(notasLOGICA);
        aluno.getDisciplinas().add(disciplina2);

        // ********************************************************* */
        Aluno[] arrayAlunos = new Aluno[1];

        arrayAlunos[0] = aluno;

        for (int i = 0; i < arrayAlunos.length; i++) {
            //// array aluno
            System.out.println("nome =" + arrayAlunos[i].getNome());

            //// array de disciplina
            for (Disciplina d : arrayAlunos[i].getDisciplinas()) {
                System.out.println("disciplina " + d.getDisciplina());

                // array de notas

                for (int j = 0; j < d.getNota().length; j++) {
                    System.out.println("notas" + d.getNota()[j]);
                }
            }
        }

       
    }

}