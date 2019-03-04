package Question8;

import java.util.concurrent.Callable;

public class ScheduleDemo implements Callable<Integer> {
    public Integer call()
    {
        return 20;
    }
}
