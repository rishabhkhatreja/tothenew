
//Question14:Coordinate mulitple threads using wait() and notifyAll()

package Question14;

public class Main {
    public void Example1(){
        synchronized (this) {
            System.out.println("Started Example1");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Example1 Completed");
        }
    }
    public void Example2(){
        synchronized (this) {
            System.out.println("Started Example2");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Example2 Completed");
        }
    }
    public void Example3(){
        synchronized (this) {
            System.out.println("Started Example3");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Example3 Completed");
        }
    }
    public void Example4(){
        synchronized (this) {
            System.out.println("Started Example4");
            System.out.println("Example4 Completed");
            notifyAll();
        }
    }
    public static void main(String[] args) {
        Main demo = new Main();
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo.Example1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo.Example2();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo.Example3();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo.Example4();
            }
        }).start();
    }
}
