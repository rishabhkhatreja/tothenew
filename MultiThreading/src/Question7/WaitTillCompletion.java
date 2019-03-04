package Question7;

class WaitTillCompletion implements Runnable
{
    String name;
    WaitTillCompletion(String name)
    {
        this.name=name;
    }
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+" has called this method and printed="+name);
        try
        {
            Thread.sleep(1000L);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
