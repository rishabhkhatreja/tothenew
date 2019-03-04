package Question4;

class MyRunnable implements Runnable {
    String name;
    MyRunnable(String name)
    {
        this.name=name;
    }
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+" has called this method and printed="+name);
    }
}
