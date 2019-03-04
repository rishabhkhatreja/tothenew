
//Question16:Create a deadlock and Resolve it using tryLock().

package Question16;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    ReentrantLock lock1 = new ReentrantLock();
    ReentrantLock lock2 = new ReentrantLock();
    public void getLock(ReentrantLock lock1, ReentrantLock lock2){
        boolean getLock1= lock1.tryLock();
        boolean getLock2= lock2.tryLock();
        if(getLock1 && getLock2){
            return;
        }
        if(getLock1){
            lock1.unlock();
        }
        if(getLock2){
            lock2.unlock();
        }
    }
    public void method1(){
        getLock(lock1,lock2);
        System.out.println("lock 1 method1 ");
        System.out.println("lock 2 method2");
        lock2.unlock();
        lock1.unlock();
    }
    public void method2(){
        getLock(lock2,lock1);
        System.out.println("lock 1 method2");
        System.out.println("lock 2 method2");
        lock1.unlock();
        lock2.unlock();
    }
    public static void main(String[] args) throws InterruptedException {
        Main demo=new Main();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                demo.method1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                demo.method2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
