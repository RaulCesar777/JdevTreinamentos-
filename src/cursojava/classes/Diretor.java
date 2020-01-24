package cursojava.classes;

public class Diretor extends Pessoa {

    private String registroEducação;
    private int tempoDirecao;
    private String titulacao;

    public Diretor() {
    }

    public Diretor(String nome, Integer idade, String dataNascimento, String regitroGeral, String numeroCPF,
            String nomeMae, String nomePai, String registroEducação, int tempoDirecao, String titulacao) {
        super(nome, idade, dataNascimento, regitroGeral, numeroCPF, nomeMae, nomePai);
        this.registroEducação = registroEducação;
        this.tempoDirecao = tempoDirecao;
        this.titulacao = titulacao;
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
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((registroEducação == null) ? 0 : registroEducação.hashCode());
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
        if (registroEducação == null) {
            if (other.registroEducação != null)
                return false;
        } else if (!registroEducação.equals(other.registroEducação))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "{" + " nome='" + getNome() + "'" + ", idade='" + getIdade() + "'" + ", dataNascimento='"
                + getDataNascimento() + "'" + ", regitroGeral='" + getRegitroGeral() + "'" + ", numeroCPF='"
                + getNumeroCPF() + "'" + ", nomeMae='" + getNomeMae() + "'" + ", nomePai='" + getNomePai() + "'"
                + " registroEducação='" + getRegistroEducação() + "'" + ", tempoDirecao='" + getTempoDirecao() + "'"
                + ", titulacao='" + getTitulacao() + "'" + "}";
    }

}