package Question11;

public class SyncronizedBlock extends Thread{
    public void name(String name)
    {
        System.out.println("running thread is="+currentThread().getName());
        synchronized(this)
        {
            for(int i=0;i<10;i++)
            {
                System.out.println("good morning");
                try
                {
                    Thread.sleep(1000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                System.out.println(name);
            }
        }
    }
}
