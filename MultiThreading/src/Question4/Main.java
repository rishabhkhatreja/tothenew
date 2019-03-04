
//Question4:Try shutdown() and shutdownNow() and observe the difference.

package Question4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        MyRunnable[] jobs={new MyRunnable("rishabh"),
                new MyRunnable("harsh"),
                new MyRunnable("mohit"),
                new MyRunnable("ram")};
        ExecutorService service = Executors.newSingleThreadExecutor();
        for (MyRunnable object:jobs)
        {
            service.submit(object);
        }
        service.shutdown();//Shut down means it will not take any new job but will complete all the submitted jobs which are already provided to the Executor service
        MyRunnable1[] jobs1={new MyRunnable1("rohit"),
                new MyRunnable1("ramu"),
                new MyRunnable1("montu"),
                new MyRunnable1("dhruv")};
        ExecutorService service1 = Executors.newSingleThreadExecutor();
        for (MyRunnable object1:jobs)
        {
            service.submit(object1);
        }
        service1.shutdownNow();//ShutdownNow means it will stop the execution of the job in between.
    }
}
