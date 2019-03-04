package Question8;

public class ScheduleAtFixedDelayDemo implements Runnable
{
    String name;
    ScheduleAtFixedDelayDemo(String name)
    {
        this.name=name;
    }
    public void run()
    {
        System.out.println("hello="+name);
    }
}
