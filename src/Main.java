public class Main {

    public static void main(String[] args) throws InterruptedException {


        Thread reloj = new Thread(new Reloj(0, 0, 0));

        reloj.start();

        Thread.sleep(12000);

        reloj.interrupt();

        System.out.println("El hilo secundario ya ha terminado de ejecutarse");
    }
}
