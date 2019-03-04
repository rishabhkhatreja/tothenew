package Question9;

public class CachedThreadPoolDemo implements Runnable {
    String name;
    CachedThreadPoolDemo(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        try
        {
            Thread.sleep(2000l);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Cached Thread pool Example:"+Thread.currentThread().getName() + " has called this method and printed=" + name);
    }

}
