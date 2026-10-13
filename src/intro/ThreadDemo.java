package intro;

//To implement multithreading
// 1. Extend Thread Class
// 2. Implement Runnable interface

class SampleThread extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getId());
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            SampleThread sampleThread = new SampleThread();
            sampleThread.start();
        }
    }
}
