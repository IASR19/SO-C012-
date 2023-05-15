import java.util.concurrent.Semaphore;

public class MonitorDeComputador {

    private static Semaphore semaforo = new Semaphore(1);

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Thread thread = new Thread(new UsuarioDoMonitor(i));
            thread.start();
        }
    }

    static class UsuarioDoMonitor implements Runnable {
        private int id;

        public UsuarioDoMonitor(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            try {
                System.out.println("Usuário " + id + " está esperando para utilizar o monitor.");

                semaforo.acquire(); // Obtém permissão para utilizar o monitor

                System.out.println("Usuário " + id + " está utilizando o monitor.");

                // Simula o uso do monitor
                Thread.sleep(2000);

                System.out.println("Usuário " + id + " liberou o monitor.");

                semaforo.release(); // Libera o monitor
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
