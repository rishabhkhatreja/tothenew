/*
Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference
create and apply multiplication method for the functional interface created.
 */
package Question3;

public class Main {
    int add(int a,int b)
    {
        return a+b;
    }
    int sub(int a,int b)
    {
        return a-b;
    }
    static int mul(int a,int b)
    {
        return a*b;
    }

    public static void main(String[] args)
    {
        Calculate object=new Main()::add;
        Calculate object1=new Main()::sub;
        Calculate object2=Main::mul;
        System.out.println("Addition of two numbers using instance method reference="+object.cal(4,5));
        System.out.println("Subtraction of two numbers using instance method reference="+object1.cal(4,5));
        System.out.println("Multiplication of two number using static reference="+object2.cal(4,5));
    }

}
