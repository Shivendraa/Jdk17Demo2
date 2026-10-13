package intro;

//Topics
//Main Thread - Thread.currentThread();
//Thread Priority - MIN_PRIORITY = 1;NORM_PRIORITY = 5;MAX_PRIORITY = 10;... setPriority(1-10)
//Thread Naming - Thread-0,Thread-1,Main.... setName()
class DemoThread extends Thread {
    @Override
    public void run() {
        System.out.println("Demo Thread Name: " + this.getName());
        this.setPriority(10);
        this.setName("demoThread");
        System.out.println("Demo Thread Priority: " + this.getPriority());
        for (int i = 0; i < 100; i++) {
            System.out.println("Inside "+this.getName()+" thread: "  + i);
        }
        System.out.println("Demo Thread processing end.");
    }
}

public class MainThread {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        startMyThread();
        System.out.println("Thread Name: " + mainThread.getName());
        mainThread.setName("megaThread");
        System.out.println("Main Thread Name: " + mainThread.getName());
        mainThread.setPriority(1);
        System.out.println("Main Thread Priority: " + mainThread.getPriority());

        for (int i = 0; i < 100; i++) {
            System.out.println("Inside "+mainThread.getName()+" thread: "  + i);
        }

        System.out.println("Main Thread processing end.");
    }


    private static void startMyThread() {
        DemoThread demoThread = new DemoThread();
        demoThread.start();
    }
}
