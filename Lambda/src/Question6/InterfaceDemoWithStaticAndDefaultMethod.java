package Question6;

public interface InterfaceDemoWithStaticAndDefaultMethod {
    default void methodDemo()
    {
        System.out.println("Default method of the interface");
    }
    static void staticMethod()
    {
        System.out.println("Static method of the interface");
    }
}
