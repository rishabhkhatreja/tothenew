/*


Implement following functional interfaces from java.util.function using lambdas:

    (1) Consumer

    (2) Supplier

    (3) Predicate

    (4) Function


 */

package Question5;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    static void MethodConsumer()
    {
        Consumer<Integer> consumer =
                e -> System.out.println("Consumer takes the value but do not return anything " + e);
        consumer.accept(10);

    }
    static void MethodSupplier()
    {
        int a = 10;

        Supplier supplier = () -> "Value returned by supplier: " + (a + 9);
        System.out.println(supplier.get());


    }
    static void MethodFunction()
    {
        Function<Integer, Integer> function = e ->
        {
            System.out.print("Square of " + e + " is: ");
            return e * e;
        };
        System.out.println(function.apply(25));

    }
    static void MethodPredicate()
    {
        Predicate<Integer> predicate = e -> {
            System.out.print("number is odd: ");
            return (e % 2 != 0);
        };
        System.out.println(predicate.test(10));


    }
    public static void main(String[] args)
    {
        MethodConsumer();

        MethodSupplier();

        MethodPredicate();

        MethodFunction();

    }
}
