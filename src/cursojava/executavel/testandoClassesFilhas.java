package cursojava.executavel;

import cursojava.classes.Diretor;

public class testandoClassesFilhas {
    public static void main(String[] args) {
        
        Diretor diretore =new Diretor();
        diretore.setNome("teste nome");
        diretore.setIdade(16);
        System.out.println(diretore.toString());
        System.out.println(diretore.pesssoaMaiorIdadde());
        System.out.println(diretore.salario());

        



    }


}