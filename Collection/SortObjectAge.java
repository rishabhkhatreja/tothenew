
/*
Question4:Write a program to sort Employee objects based on highest salary using Comparator.
 Employee class{ Double Age; Double Salary; String Name }
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Age implements Comparator<SortObjectAge>
{


    @Override
    public int compare(SortObjectAge o1, SortObjectAge o2) {
        if (o1.age < o2.age) return -1;
        if (o1.age>o2.age) return 1;
        else return 0;
    }
}
public class SortObjectAge  {
    int age;
    int salary;
    String name;

    @Override
    public String toString() {
        return "SortObjectAge{" +
                "age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }

    public SortObjectAge(String name, int salary, int age)
    {
        this.age=age;
        this.salary=salary;
        this.name=name;
    }
    public static void main(String[] args) {
        SortObjectAge person1=new SortObjectAge("rishabh",200000,23);
        SortObjectAge person2=new SortObjectAge("ram",500000,26);
        SortObjectAge person3=new SortObjectAge("ramesh",100000,21);
        SortObjectAge person4=new SortObjectAge("raju",800000,27);
        List<SortObjectAge> person=new ArrayList<>();
        Age age=new Age();
        person.add(person1);
        person.add(person2);
        person.add(person3);
        person.add(person4);
        Collections.sort(person,age);
        System.out.println(person.toString());
    }
}
