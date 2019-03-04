package Question10;

public class SyncronizedMethod {
    public synchronized void name(String name)
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
