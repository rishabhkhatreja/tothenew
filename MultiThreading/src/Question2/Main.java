
//Question2:Use sleep and join methods with thread.
package Question2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadSleepAndJoin runnable=new ThreadSleepAndJoin();
        Thread threadDemo=new Thread(runnable);
        threadDemo.start();
        threadDemo.join();
        System.out.println("this is the main thread");
    }
}
