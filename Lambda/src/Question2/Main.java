
/*
Create a functional interface whose method takes 2 integers and return one integer.
 */

package Question2;

public class Main {
    int sumCalculate(int a,int b)
    {
        return a+b;
    }
    public static void main(String[] args)
    {
        ReturnOneArgument ref=new Main()::sumCalculate;
        System.out.println(ref.sum(10,20));

    }
}