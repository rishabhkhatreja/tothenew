/*
Question5:Write a program to sort the Student objects based on Score ,
if the score are same then sort on First Name . Class Student{ String Name; Double Score; Double Age}
 */

import java.util.*;

class Sort implements Comparator<SortObjectMarks>
{
    @Override
    public int compare(SortObjectMarks o1, SortObjectMarks o2) {
        if(o1.Score>o2.Score)
            return 1;
        if(o1.Score<o2.Score)
            return -1;
        else
            return o1.Name.compareTo(o2.Name) ;
    }
}
public class SortObjectMarks {
    String Name;
    double Score;
    int age;

    @Override
    public String toString() {
        return "SortObjectMarks{" +
                "Name='" + Name + '\'' +
                ", Score=" + Score +
                ", age=" + age +
                '}';
    }

    SortObjectMarks(String name, double score, int age)
    {
        this.Name=name;
        this.Score=score;
        this.age=age;
    }

    public static void main(String[] args) {
        List<SortObjectMarks> list=new ArrayList<>();
        list.add(new SortObjectMarks("rishabh",76.50,23));
        list.add(new SortObjectMarks("ram",76.50,45));
        list.add(new SortObjectMarks("ramesh",78.00,13));
        list.add(new SortObjectMarks("sahil",42.00,33));
        list.add(new SortObjectMarks("gaurav",33.50,53));
        Sort sort=new Sort();
        Collections.sort(list,sort);
        System.out.println(list);
    }
}
