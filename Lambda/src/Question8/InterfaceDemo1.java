package Question8;

public interface InterfaceDemo1 {
    void sum();
    default void methodDemo()
    {
        System.out.println("Interface default method from InterfaceDemo1");
    }
}
