package cursojava.executavel;

public class ArrayVetor {
    public static void main(String[] args) {

        double notas[] = new double[4];

        notas[0]= 9.9;
        notas[1]= 7.8;
        notas[2]= 4.8;
        notas[3]= 7.6;

        for (int i = 0; i < notas.length; i++) {
            
            System.out.println("nota " + (i+1)+ " é :" + notas[i]);
        }



    }

}