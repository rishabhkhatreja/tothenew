
//Question13:Coordinate 2 threads using wait() and notify().

package Question13;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WaitAndNotify r1=new WaitAndNotify();
        Thread thread=new Thread(r1);
        thread.start();
        synchronized (thread)
        {
            System.out.println("main thread calling wait method");
            thread.wait();
            System.out.println("main terminated");
        }
    }
}
