package intro;

class MyThread1 implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Other Thread State: " + RunnableDemo.myThread1.getState() + "\n Thread Name: "+ RunnableDemo.myThread1.getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Other Thread State at end : " + RunnableDemo.myThread1.getState() + "\n Thread Name: "+ RunnableDemo.myThread1.getName());
    }
}

public class RunnableDemo implements Runnable {
    static Thread myThread1;
    static Thread myThread2;

    @Override
    public void run() {
        myThread1 = new Thread(new MyThread1());

        System.out.println("State of thread 2 - create : " + myThread1.getState() + "\n Thread Name: "+myThread1.getName());

        myThread2 = new Thread(new MyThread1());

        System.out.println("State of thread 3 - create : " + myThread2.getState() + "\n Thread Name: "+myThread2.getName());

        myThread1.start();

        System.out.println("State of thread 2 - start : " + myThread1.getState() + "\n Thread Name: "+myThread1.getName());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("State of thread 2 - sleep : " + myThread1.getState() + "\n Thread Name: "+myThread1.getName());

        try {
            myThread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("State of thread 2 - join : " + myThread1.getState() + "\n Thread Name: "+myThread1.getName());

        myThread2.start();

        System.out.println("State of thread 3 - start : " + myThread2.getState() + "\n Thread Name: "+myThread2.getName());

    }

    public static void main(String[] args) {
        RunnableDemo obj = new RunnableDemo();
        Thread thread1 = new Thread(obj);

        System.out.println("State of thread 1 - create : " + thread1.getState() + "\n Thread Name: "+thread1.getName());

        thread1.start();

        System.out.println("State of thread 1 - start : " + thread1.getState() + "\n Thread Name: "+thread1.getName());

    }
}
