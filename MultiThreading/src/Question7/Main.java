
//Question7:Submit List of tasks to ExecutorService and wait for the completion of all the tasks.

package Question7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WaitTillCompletion[] objects={new WaitTillCompletion("rishabh"),new WaitTillCompletion("ram"),
                new WaitTillCompletion("ramesh"),new WaitTillCompletion("mohit")};
        ExecutorService service= Executors.newSingleThreadExecutor();
        for (WaitTillCompletion object:objects) {
            service.submit(object);
        }
        service.shutdown();
       service.awaitTermination(5000L, TimeUnit.MILLISECONDS);
        if(service.isTerminated())
        {
            System.out.println("terminated");
        }
        else
        {
            System.out.println("still running");
        }
    }
}
