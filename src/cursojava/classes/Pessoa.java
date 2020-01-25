package cursojava.classes;

public abstract class Pessoa {

    protected String nome;
    protected Integer idade;
    protected String dataNascimento;
    protected String regitroGeral;
    protected String numeroCPF;
    protected String nomeMae;
    protected String nomePai;

    public abstract double salario();

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRegitroGeral() {
        return this.regitroGeral;
    }

    public void setRegitroGeral(String regitroGeral) {
        this.regitroGeral = regitroGeral;
    }

    public String getNumeroCPF() {
        return this.numeroCPF;
    }

    public void setNumeroCPF(String numeroCPF) {
        this.numeroCPF = numeroCPF;
    }

    public String getNomeMae() {
        return this.nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return this.nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public Pessoa() {
    }

    public Pessoa(String nome, Integer idade, String dataNascimento, String regitroGeral, String numeroCPF,
            String nomeMae, String nomePai) {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.regitroGeral = regitroGeral;
        this.numeroCPF = numeroCPF;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
    }


    @Override
    public String toString() {
        return "[Pessoa]" +
            "\n nome = '" + getNome() + "" +
            ",\n idade = " + getIdade() + "" +
            ",\n dataNascimento = " + getDataNascimento() + "" +
            ",\n regitroGeral = " + getRegitroGeral() + "" +
            ",\n numeroCPF = " + getNumeroCPF() + "" +
            ",\n nomeMae = " + getNomeMae() + "" +
            ",\n nomePai = " + getNomePai() + "" +
            "";
    }
    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((numeroCPF == null) ? 0 : numeroCPF.hashCode());
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
        Pessoa other = (Pessoa) obj;
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
        return true;
    }

    public boolean pesssoaMaiorIdadde() {
        return idade >=18; 

    }

    
    

   

}