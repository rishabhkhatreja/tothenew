package Question13;

public class WaitAndNotify implements Runnable {
    public void run()
    {
        synchronized (this)
        {
            System.out.println("executing");
            System.out.println("giving notification");
            this.notify();
        }
    }
}
