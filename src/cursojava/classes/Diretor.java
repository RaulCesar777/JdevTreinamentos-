package cursojava.classes;

public class Diretor extends Pessoa {

    private String registroEducacao;
    private int tempoDirecao;
    private String titulacao;

    public Diretor() {
    }

    public Diretor(String nome, Integer idade, String dataNascimento, String regitroGeral, String numeroCPF,
            String nomeMae, String nomePai, String registroEducacao, int tempoDirecao, String titulacao) {

        super(nome, idade, dataNascimento, regitroGeral, numeroCPF, nomeMae, nomePai);
        this.registroEducacao = registroEducacao;
        this.tempoDirecao = tempoDirecao;
        this.titulacao = titulacao;
    }

    public String getRegistroEducacao() {
        return this.registroEducacao;
    }

    public void setRegistroEducacao(String registroEducacao) {
        this.registroEducacao = registroEducacao;
    }

    public int getTempoDirecao() {
        return this.tempoDirecao;
    }

    public void setTempoDirecao(int tempoDirecao) {
        this.tempoDirecao = tempoDirecao;
    }

    public String getTitulacao() {
        return this.titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((registroEducacao == null) ? 0 : registroEducacao.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Diretor other = (Diretor) obj;
        if (registroEducacao == null) {
            if (other.registroEducacao != null)
                return false;
        } else if (!registroEducacao.equals(other.registroEducacao))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return super.toString()+
         "\n[Diretor]\n registroEducação = " + registroEducacao + ",\n tempoDirecao = " + tempoDirecao + ",\n titulacao = "
                + titulacao + "\n";
    }

    @Override
    public double salario() {
      
        return 3900.78;
    }

   
    
  
   

}