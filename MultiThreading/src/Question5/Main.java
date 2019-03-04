
//Question5:Use isShutDown() and isTerminate() with ExecutorService.

package Question5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        RunnableDemo[] objects={new RunnableDemo("rishabh"),
                new RunnableDemo("ram"),
                new RunnableDemo("ramesh")};
        ExecutorService service= Executors.newSingleThreadExecutor();
        for (RunnableDemo object:objects) {
            service.submit(object);
        }
        System.out.println(Thread.currentThread().getName());
        service.shutdownNow();
        System.out.println("Is shut down="+service.isShutdown());
        System.out.println("Is terminated="+service.isTerminated());
    }
}
