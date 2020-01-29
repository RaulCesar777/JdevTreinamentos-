package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.exececao.ExececaoBoasVindas;

public class PrimeiraClasseJava {

      public static void main(String[] args) {
            try {
                  lerarquivodeboasvindas();

                  String login = JOptionPane.showInputDialog("QUAL  O LOGIN");
                  String senha = JOptionPane.showInputDialog("QUAL  A SENHA");

                  if (new FuncaoAutenticacao(new Secretario(login, senha)).autenticar() == false) {

                        do {
                              JOptionPane.showMessageDialog(null, "Senha ou login incorretos");
                              login = JOptionPane.showInputDialog("QUAL  O LOGIN");
                              senha = JOptionPane.showInputDialog("QUAL  A SENHA");

                        } while (!new FuncaoAutenticacao(new Secretario(login, senha)).autenticar());
                  }

                  if (new FuncaoAutenticacao(new Secretario(login, senha)).autenticar()) {

                        List<Aluno> alunos = new ArrayList<Aluno>();

                        HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

                        for (int qtd = 1; qtd <= 1; qtd++) {

                              String NOME = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
                              /*
                               * Integer IDADE =
                               * Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do aluno ?"));
                               * 
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
                              /*
                               * aluno1.setIdade(IDADE);
                               * 
                               * aluno1.setDataNascimento(DNASC); aluno1.setRegitroGeral(RG);
                               * aluno1.setNumeroCPF(CPF); aluno1.setNomeMae(NMAE); aluno1.setNomePai(NPAI);
                               * aluno1.setDataMatricula(DMATR); aluno1.setSerieMatriculado(SERIE);
                               * aluno1.setNomeEscola(NOMEESCOLA);
                               */

                              for (int pos = 1; pos <= 1; pos++) {
                                    String nomeDisciplina = JOptionPane
                                                .showInputDialog("QUAL A DISCIPLINA  " + pos + " ");
                                    String notaDisciplina = JOptionPane.showInputDialog("QUAL A NOTA " + pos + " ");
                                    Disciplina disciplina = new Disciplina();
                                    disciplina.setDisciplina(nomeDisciplina);
                                    disciplina.setNota(Double.valueOf(notaDisciplina));
                                    aluno1.getDisciplinas().add(disciplina);
                              }

                              int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
                              if (escolha == 0) {

                                    int continuarremover = 0;
                                    int posicao = 1;
                                    while (continuarremover == 0) {

                                          String disciplinaRemover = JOptionPane
                                                      .showInputDialog("Qual disciplina deseja remover ? 1,2,3 ou 4 ?");
                                          aluno1.getDisciplinas().remove(Integer.parseInt(disciplinaRemover) - posicao);
                                          posicao++;
                                          continuarremover = JOptionPane.showConfirmDialog(null,
                                                      "deseja remover outra disciplina ?");

                                    }

                              }

                              alunos.add(aluno1);
                        }
                        maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
                        maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
                        maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

                        for (Aluno aluno : alunos) {

                              if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
                                    maps.get(StatusAluno.APROVADO).add(aluno);
                              } else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
                                    maps.get(StatusAluno.RECUPERACAO).add(aluno);
                              } else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
                                    maps.get(StatusAluno.REPROVADO).add(aluno);
                              }

                        }
                        System.out.println(".....................");
                        System.out.println("lista dos aprovados");
                        for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
                              System.out.println(
                                          "Nome = " + aluno.getNome() + "  Resultado = " + aluno.getAlunoAprovado2());
                        }
                        System.out.println(".....................");
                        System.out.println("lista dos que Recuperação");

                        for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
                              System.out.println(
                                          "Nome = " + aluno.getNome() + "  Resultado = " + aluno.getAlunoAprovado2());
                        }

                        System.out.println(".....................");
                        System.out.println("lista alunos Reprovados");

                        for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
                              System.out.println(
                                          "Nome = " + aluno.getNome() + "  Resultado = " + aluno.getAlunoAprovado2());
                        }
                  }

            } catch (NumberFormatException e) {

                  StringBuilder NFE = new StringBuilder();
                  NFE.append("erro " + e.getMessage());
                  JOptionPane.showMessageDialog(null,
                              "\n erro de conversão....\n" + e.getClass() + "\n " + NFE.toString());
                  e.printStackTrace();

            } catch (NullPointerException e) {

                  StringBuilder NPE = new StringBuilder();
                  NPE.append("erro " + e.getMessage());
                  JOptionPane.showMessageDialog(null,
                              "\n erro de nullpointer...\n" + e.getClass() + "\n " + NPE.toString());
                  e.printStackTrace();

            } catch (ExececaoBoasVindas e) {

                  StringBuilder EBV = new StringBuilder();
                  EBV.append("erro " + e.getMessage());
                  JOptionPane.showMessageDialog(null,
                              "\n erro de Boas Vindas...\n" + e.getClass() + "\n " + EBV.toString());
                  e.printStackTrace();

            } catch (Exception e) {

                  StringBuilder saida = new StringBuilder();
                  StringBuilder saida2 = new StringBuilder();
                  int Linha = 0;
                  String Classe = new String();
                  saida2.append("erro " + e.getMessage());

                  for (int i = 0; i < e.getStackTrace().length; i++) {

                        Classe = (e.getStackTrace()[i].getClassName());
                        Linha = (e.getStackTrace()[i].getLineNumber());
                        saida.append("\n Class :" + e.getClass().getName());

                  }
                  JOptionPane.showMessageDialog(null, "\n Erro generico: " + " Linha :" + Linha + "\n Classe : "
                              + Classe + " \n\n causa : " + saida2);

                  e.printStackTrace();
            } finally {
                  JOptionPane.showMessageDialog(null, "Até logo");
            }

      }

      public static void lerarquivodeboasvindas() throws ExececaoBoasVindas {

            File texto = new File("C://BoasVindas.txt");
            Scanner sc = null;
            StringBuilder impressaoarquivo = new StringBuilder();
            try {
                  sc = new Scanner(texto);
                  while (sc.hasNextLine()) {
                        impressaoarquivo.append(" \n" + sc.nextLine());
                  }
                  JOptionPane.showMessageDialog(null, "\n " + impressaoarquivo.toString());

            } catch (FileNotFoundException e) {
                  throw new ExececaoBoasVindas(e.getMessage());

            } finally {
                  if (sc != null) {
                        sc.close();

                  }

            }
      }
}