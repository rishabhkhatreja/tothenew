
/*
Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string
using String Buffer.?
*/

public class ReverseRemove
{
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("rishabh is a bad boy");
        s.reverse();
        s.delete(4,9);
        System.out.println(s);
    }
}
