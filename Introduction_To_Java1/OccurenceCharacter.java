
//Write a program to find the number of occurrences of a character in a string without using loop?

public class OccurenceCharacter
{
    public static void main(String[] args) {
        String string="my name is rishabh";
        int a=string.replace("a","").length();
        System.out.println(string.length()-a);
    }
}
