package Question9;

public class NewFixedThreadPoolDemo implements Runnable{

    String name;
        NewFixedThreadPoolDemo(String name) {
            this.name = name;
        }
    @Override
        public void run() {
            try
            {
                Thread.sleep(2000l);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " has called this method and printed=" + name);
        }

}
