package Question6;

import java.util.concurrent.Callable;

class ThreadDoneCancelled implements Callable<Integer>
{
    public Integer call()
    {
        try
        {
            Thread.sleep(4000);
        }
        catch (Exception e)
        {
          e.printStackTrace();
        }
        return 10;
    }
}
