
//Question9:Increase concurrency with Thread pools using newCachedThreadPool() and newFixedThreadPool().

package Question9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        NewFixedThreadPoolDemo[] jobs={new NewFixedThreadPoolDemo("rishabh"),
                new NewFixedThreadPoolDemo("harsh"),
                new NewFixedThreadPoolDemo("mohit"),
                new NewFixedThreadPoolDemo("ram")};
        ExecutorService service = Executors.newFixedThreadPool(2);
        for (NewFixedThreadPoolDemo object:jobs)
        {
            service.submit(object);
        }
        service.shutdown();
        CachedThreadPoolDemo[] jobsCached={new CachedThreadPoolDemo("rishabh"),
                new CachedThreadPoolDemo("harsh"),
                new CachedThreadPoolDemo("mohit"),
                new CachedThreadPoolDemo("ram")};
        ExecutorService service1 = Executors.newCachedThreadPool();
        for (CachedThreadPoolDemo object:jobsCached)
        {
            service1.submit(object);
        }
        service1.shutdown();
    }
}
