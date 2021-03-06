package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.StatusAluno;

public class Aluno extends Pessoa{

    
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;
    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    
    


    public Aluno() {

    }

    public Aluno(String nome, Integer idade) {
        this.nome = nome;

    }

    public Aluno(String nome, Integer idade, String dataNascimento, String regitroGeral, String numeroCPF,
            String nomeMae, String nomePai, String dataMatricula, String nomeEscola, String serieMatriculado) {
        super();
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.regitroGeral = regitroGeral;
        this.numeroCPF = numeroCPF;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.dataMatricula = dataMatricula;
        this.nomeEscola = nomeEscola;
        this.serieMatriculado = serieMatriculado;
    }

    @Override
    public String toString() {
        return "{" +
            " dataMatricula='" + getDataMatricula() + "'" +
            ", nomeEscola='" + getNomeEscola() + "'" +
            ", serieMatriculado='" + getSerieMatriculado() + "'" +
            ", disciplinas='" + getDisciplinas() + "'" +
            "}";
    }


    public double getMediaNota() {
        double somaNotas = 0;
        for (Disciplina disciplina : disciplinas) {
            somaNotas += disciplina.getMediaNota();
        }
        return somaNotas / disciplinas.size();
    }

    public boolean getAlunoAprovado() {
        double media = this.getMediaNota();
        if (media >= 70) {

            return true;
        } else {
            return false;

        }

    }
  

    public String getAlunoAprovado2() {
        double media = this.getMediaNota();
        if (media >= 50) {
            if (media >= 70) {
                return StatusAluno.APROVADO;
            } else {
                return StatusAluno.RECUPERACAO;
            }

        } else {
            return StatusAluno.REPROVADO;
        }

    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplina) {
        disciplinas = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRegitroGeral() {
        return regitroGeral;

    }

    public void setRegitroGeral(String regitroGeral) {
        this.regitroGeral = regitroGeral;
    }

    public String getNumeroCPF() {
        return numeroCPF;
    }

    public void setNumeroCPF(String numeroCPF) {
        this.numeroCPF = numeroCPF;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((numeroCPF == null) ? 0 : numeroCPF.hashCode());
        result = prime * result + ((regitroGeral == null) ? 0 : regitroGeral.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (numeroCPF == null) {
            if (other.numeroCPF != null)
                return false;
        } else if (!numeroCPF.equals(other.numeroCPF))
            return false;
        if (regitroGeral == null) {
            if (other.regitroGeral != null)
                return false;
        } else if (!regitroGeral.equals(other.regitroGeral))
            return false;
        return true;
    }

    @Override
    public double salario() {
       
        return 0;
    }

}
