package Question1;

public class ThreadCreationByImplementingRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("thread created by implementing runnable interface="+Thread.currentThread().getName());
    }
}
