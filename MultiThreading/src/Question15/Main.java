
//Question15:Use Reentract lock for coordinating 2 threads with signal(), signalAll() and wait().

package Question15;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    ReentrantLock lock = new ReentrantLock(true);
    Condition condition = lock.newCondition();

    public void lockDemo1() {
        try {
            lock.lock();
            System.out.println("lockDemo 1 Started");
            condition.await();
            System.out.println("lockDemo 1 Finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void lockDemo2() {
        try{
            lock.lock();
            System.out.println("lockDemo2 Started");
            System.out.println("lockDemo2 Finished");
            condition.signal();
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Main demo = new Main();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                demo.lockDemo1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                demo.lockDemo2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}

