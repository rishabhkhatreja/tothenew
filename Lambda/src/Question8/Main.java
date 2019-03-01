
//Implement multiple inheritance with default method inside  interface.
package Question8;

import java.sql.SQLOutput;

public class Main implements InterfaceDemo1,InterfaceDemo{
    public static void main(String[] args) {
        new Main().methodDemo();
    }
    @Override
    public void sum() {
        System.out.println("Implemented sum method of InterfaceDemo1");
    }

    @Override
    public void methodDemo() {
        InterfaceDemo.super.methodDemo();
        InterfaceDemo1.super.methodDemo();
    }
}
