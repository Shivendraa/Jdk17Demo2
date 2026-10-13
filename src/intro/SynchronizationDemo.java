package intro;

//Synchronization
// P: 2 or more threads are trying to access or modify shared/same resource, race condition takes place.
// S: to address race conditions we use synchronized method
// race condition - inconsistent/invalid results
class Counter {
    int count = 0;
    public synchronized void increment() { //thread safe - when 2 or more threads accessing the resource, and we do not  run into any failures
        count++;
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        t2.start();
        t1.start();

        t1.join();
        t2.join();

        System.out.println("Final count : " + counter.count);
    }
}
