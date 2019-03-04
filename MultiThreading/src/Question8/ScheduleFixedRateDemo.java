package Question8;

public class ScheduleFixedRateDemo implements Runnable
{
    String name;
    ScheduleFixedRateDemo(String name)
    {
        this.name=name;
    }
    public void run()
    {
        try
        {
            Thread.sleep(2000L);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("hello="+name);
    }
}
