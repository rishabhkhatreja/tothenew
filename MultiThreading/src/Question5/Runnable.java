package Question5;

class RunnableDemo implements Runnable {
    String name;
    RunnableDemo(String name)
    {
        this.name=name;
    }
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+" has called this method and printed="+name);
        try
        {
            Thread.sleep(3000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
