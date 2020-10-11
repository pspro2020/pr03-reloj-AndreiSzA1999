public class Reloj implements Runnable {

    private int horas, minutos, segundos;


    public Reloj(int horas, int minutos, int segundos) {

        this.horas = horas;

        this.minutos = minutos;

        this.segundos = segundos;

    }

    @Override
    public void run() {


        while (!Thread.currentThread().isInterrupted()) {


            System.out.println(reloj());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                return;
            }

        }


    }


    public String reloj() {

        String hora;

        hora = "";


        if (horas < 10) {

            hora += "0" + horas;

        } else {

            hora += horas;

        }

        hora += ":";

        if (minutos < 10) {

            hora += "0" + minutos;

        } else {

            hora += minutos;

        }

        hora += ":";

        if (segundos < 10) {

            hora += "0" + segundos;

        } else {

            hora += segundos;

        }

        segundos++;

        if (segundos == 60) {
            minutos++;
            segundos = 0;
            if (minutos == 60) {
                horas++;
                minutos = 0;
                if (horas == 24) {
                    horas = 0;
                }
            }
        }
        return hora;
    }
}
