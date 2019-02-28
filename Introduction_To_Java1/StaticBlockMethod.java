

//Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively.


public class StaticBlockMethod {

    static String firstName="Rishabh",lastName="khatreja";
    static int age=23;
    static
    {

        System.out.println("From static block------------");
        System.out.println("firstName="+firstName);
        System.out.println("lastName="+lastName);
        System.out.println("Age="+age);
    }
    public static void display()
    {
        System.out.println("From static method-----------------");
        System.out.println("firstName="+firstName);
        System.out.println("lastName="+lastName);
        System.out.println("Age="+age);
    }
    public static void main(String[] args)
    {
        display();
    }

}

/*
Another-Way

public class StaticBlockmethod {
    static String firstName,lastName;
    static int age;
    static
    {
        firstName="rishabh";
        System.out.println("From static block------------");
        System.out.println("firstName="+firstName);
        System.out.println("lastName="+lastName);
        System.out.println("Age="+age);
    }
    public static void display()
    {
        System.out.println("From static method-----------------");
        System.out.println("firstName="+firstName);
        System.out.println("lastName="+lastName);
        System.out.println("Age="+age);
    }
    public StaticBlockmethod(String firstName, String lastName, int age)
    {
        StaticBlockmethod.firstName=firstName;
        StaticBlockmethod.lastName=lastName;
        StaticBlockmethod.age=age;
    }
    public static void main(String[] args)
    {
        Static_Block_method obj=new Static_Block_method("Rishabh","khatreja",23);
        display();
    }
}
 */