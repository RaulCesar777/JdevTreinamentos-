package cursojava.threads;

import javax.swing.JOptionPane;

public class AulaThread {

    public static void main(String[] args) throws InterruptedException {

        Thread TEmail = new Thread(thread1);
        TEmail.start();

        Thread TNotaFiscal = new Thread(thread2);
        TNotaFiscal.start();

      

        System.out.println("fim da thread");
        JOptionPane.showMessageDialog(null, " sistema continua para usuario");

    }

    private static Runnable thread1 = new Runnable() {

        @Override
        public void run() {

          for (int i = 0; i < 10; i++) {

          

               

                System.out.println("exeutando rotina envio de email");

               try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }

        }
    };

    private static Runnable thread2 = new Runnable() {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {

                System.out.println("exeutando rotina envio de notafiscal");

                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }

        }
    };

}