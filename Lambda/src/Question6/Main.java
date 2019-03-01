//Create and access default and static method of an interface
package Question6;

public class Main implements InterfaceDemoWithStaticAndDefaultMethod {

    public static void main(String[] args) {
        new Main().methodDemo();
        InterfaceDemoWithStaticAndDefaultMethod.staticMethod();
    }

}
