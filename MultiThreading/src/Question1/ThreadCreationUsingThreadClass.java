package Question1;

class ThreadCreationUsingThreadClass extends Thread
{
    public void run()
    {
        System.out.println("Thread created by extending Thread class and thread name is="+Thread.currentThread().getName());
    }
}
