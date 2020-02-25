package cursojava.threads;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

    private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

    public static void add(ObjetoFilaThread OBJFT) {
        pilha_fila.add(OBJFT);
    }

    @Override
    public void run() {
        System.out.println("----funciona ------");
        int a =0;
        while (true) {
            Iterator iteracao = pilha_fila.iterator();

            synchronized (iteracao) {

                while (iteracao.hasNext()) {
                    ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();

                    /// processar e-mail
                    a++;
                    System.out.println("---------------------------------------------------"+a);
                    System.out.println(processar.getNome());
                    System.out.println(processar.getEmail());

                    iteracao.remove();

                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}