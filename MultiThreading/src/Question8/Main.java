
//Question8:Schedule task using schedule(), scheduleAtFixedRate() and scheduleAtFixedDelay()


package Question8;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduleDemo object=new ScheduleDemo();
        ExecutorService service= Executors.newSingleThreadScheduledExecutor();
        Future<Integer> submit = ((ScheduledExecutorService) service).schedule(object,3000l, TimeUnit.MILLISECONDS);
        System.out.println(submit.get());

        ExecutorService service1 = Executors.newSingleThreadScheduledExecutor();
        ScheduleAtFixedDelayDemo[] objects = {new ScheduleAtFixedDelayDemo("rishabh"),
                new ScheduleAtFixedDelayDemo("ram"),
                new ScheduleAtFixedDelayDemo("ramesh")};
        for (ScheduleAtFixedDelayDemo object1 : objects) {
            ((ScheduledExecutorService) service).scheduleWithFixedDelay(object1, 0, 2000L, TimeUnit.MILLISECONDS);
        }
        service1.awaitTermination(5000L,TimeUnit.MILLISECONDS);

        ExecutorService service2 = Executors.newSingleThreadScheduledExecutor();
        ScheduleFixedRateDemo object2 = new ScheduleFixedRateDemo("rishabh");
        ((ScheduledExecutorService) service).scheduleAtFixedRate(object2,0,1000L,TimeUnit.MILLISECONDS);
        service2.awaitTermination(6000L,TimeUnit.MILLISECONDS);
        service.shutdown();
        service1.shutdown();
        service2.shutdown();
    }
}
