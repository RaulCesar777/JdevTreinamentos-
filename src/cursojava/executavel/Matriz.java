package cursojava.executavel;

public class Matriz {


public static void main(String[] args) {

    //String entrada = null;

    int notas [][]= new int [3][3];

    notas[0][0]=10;
    notas[0][1]=20;
    notas[0][2]=30;
    notas[1][0]=40;
    notas[1][1]=50;
    notas[1][2]=60;
    notas[2][0]=70;
    notas[2][1]=80;
    notas[2][2]=90;


   

  /*  for (int i = 0; i < notas.length; i++) {
        for (int j = 0; j < notas.length; j++) {
            entrada = JOptionPane.showInputDialog("QUAL  a nota para a linha"+i+ "coluna "+j);
            notas[i][j]= Integer.valueOf(entrada);
        }
        
    }*/

    for (int i = 0; i < notas.length; i++) {
        System.out.print("\n");
        for (int j = 0; j < notas.length; j++) {
            
            System.out.print(notas[i][j]+"\t");
           
        }

    }
    
}


    
}