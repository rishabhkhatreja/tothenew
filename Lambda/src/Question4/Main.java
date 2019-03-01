/*
Create an Employee Class with instance variables (String) name, (Integer)age,(String)city and get the instance
of the Class using constructor reference
 */

package Question4;

public class Main {
    public static void main(String[] args) {
        MyInterface reference=Employee::new;
        System.out.println(reference.display("rishabh",23,"Delhi"));
    }
}
