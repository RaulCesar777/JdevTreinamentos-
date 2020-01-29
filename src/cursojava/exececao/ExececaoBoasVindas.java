package cursojava.exececao;

public class ExececaoBoasVindas extends Exception {  
    private static final long serialVersionUID = 1L;



    public ExececaoBoasVindas(String erro) {
        super("vixx deu erro de arquivo de boas vindas    \n"+erro);
    }



    
}