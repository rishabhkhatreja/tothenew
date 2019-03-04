package Question4;

class MyRunnable1 implements Runnable
{
    String MyName;

    MyRunnable1(String name)
        {
            this.MyName=name;
        }
        public void run()
        {
            System.out.println(Thread.currentThread().getName() + " has called this method and printed=" +MyName);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
