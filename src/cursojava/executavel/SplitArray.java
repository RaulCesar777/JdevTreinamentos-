package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {
    public static void main(String[] args) {

        String texto = "Alex, curso java, 80, 90, 89";
        
        String[] arraytexto = texto.split(",");
        
        for (int i = 0; i < arraytexto.length; i++) {
            System.out.print("\t"+arraytexto[i]);
            
        }

        ///////converter array para lista
        List<String> list =Arrays.asList(arraytexto);

        for (String stringr : list) {
            System.out.println(stringr);
        }

        //////////converter lista para array

        String [] convertarray = list.toArray(new String[4]);

        for (int i = 0; i < convertarray.length; i++) {
            System.out.println(convertarray[i]);
            
        }


        
    }
    
}