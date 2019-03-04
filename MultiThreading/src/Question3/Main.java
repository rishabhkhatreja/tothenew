

//Question3:Use a singleThreadExecutor to submit multiple threads.

package Question3;

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
        service.shutdown();
    }

}
