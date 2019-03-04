
//Question6:Return a Future from ExecutorService by using callable and use get(), isDone(), isCancelled() with the Future object to know the status of task submitted.

package Question6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadDoneCancelled[] objects={new ThreadDoneCancelled(),new ThreadDoneCancelled()};
        ExecutorService service= Executors.newSingleThreadExecutor();
        Future value=null;
        for (ThreadDoneCancelled eachOject:objects)
        {
            value=service.submit(eachOject);
            System.out.println("returned value by callable is ="+value.get());
        }
        service.shutdownNow();
        System.out.println("Thread Is done ="+value.isDone());
        System.out.println("Thread is cancelled ="+value.isCancelled());//we can cancel the task by using value.cancel(true).
        service.shutdown();
    }
}
