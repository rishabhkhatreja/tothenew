//Override the default method of the interface.

package Question7;

public class Main implements InterfaceDemo {
    @Override
    public void Demo() {
        //InterfaceDemo.super.Demo();
        System.out.println("hello from main");
    }
    public static void main(String[] args)
    {
     new Main().Demo();
    }
}
