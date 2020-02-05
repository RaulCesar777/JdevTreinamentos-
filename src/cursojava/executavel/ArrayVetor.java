package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
    public static  void main(String[] args) {

       

        Double[] notas= {8.8,9.9,7.7,6.6};
        Double[] notasLOGICA= {6.8,4.9,7.4,5.6,5.9,8.9,8.7};

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
        
        System.out.println("NOME DO ALUNO :"+aluno.getNome()+"\n"+"NOME DO CURSO  :"+aluno.getNomeEscola());
      for ( Disciplina d :  aluno.getDisciplinas()) {
          System.out.println("*************DISCIPLINA**************");
         System.out.println(d.getDisciplina());
         System.out.println("*****************NOTAS*****************");
         for (int i = 0; i <d.getNota().length; i++) {
             System.out.println("NOTA "+(i+1)+ " :      "+d.getNota()[i]);///PARA O USO DOS [] NÃO PRESICA DE NOTAÇÃO PONTO
             
         }
           
      }


    }

}