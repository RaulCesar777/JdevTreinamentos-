package cursojava.classes;

public class Diretor extends Pessoa{

        private String  registroEducação;
        private int tempoDirecao;
        private String titulacao;


    public Diretor() {
    }




    public String getRegistroEducação() {
        return this.registroEducação;
    }

    public void setRegistroEducação(String registroEducação) {
        this.registroEducação = registroEducação;
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
    public String toString() {
        return "{" +
            " registroEducação='" + getRegistroEducação() + "'" +
            ", tempoDirecao='" + getTempoDirecao() + "'" +
            ", titulacao='" + getTitulacao() + "'" +
            "}";
    }
   
    
}