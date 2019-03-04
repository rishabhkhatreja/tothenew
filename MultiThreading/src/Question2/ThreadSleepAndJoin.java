package Question2;

public class ThreadSleepAndJoin implements Runnable {
    @Override
    public void run() {
        System.out.println("new created thread and running");
        try
        {
            Thread.sleep(2000l);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("thread completed execution");
    }
}
