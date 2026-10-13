package intro;

//DaemonThread - Background processing
//example - Garbage Collection
//Daemon threads stop when other threads complete their processing
class DaemonThread extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Daemon Thread is running...");
        }
    }
}

public class DaemonThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("Daemon");
        daemonThread.setDaemon(true);
        daemonThread.start();

        System.out.println("Main thread processing");
        Thread.sleep(10000);

        System.out.println("Main thread processed");
    }
}
