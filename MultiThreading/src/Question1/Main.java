
//Question1:Create and Run a Thread using Runnable Interface and Thread class.
package Question1;

public class Main {
    public static void main(String[] args) {
     ThreadCreationUsingThreadClass thread1=new ThreadCreationUsingThreadClass();
     thread1.start();
     ThreadCreationByImplementingRunnable runable=new ThreadCreationByImplementingRunnable();
     Thread thread2=new Thread(runable);
     thread2.start();
        System.out.println("This is the main thread="+Thread.currentThread().getName());
    }
}
