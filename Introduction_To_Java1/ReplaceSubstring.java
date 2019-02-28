//Write a program to replace a substring inside a string with other string ?

public class ReplaceSubstring
{
    public static void main(String[] args) {
        String name = "Rishabh is a bad boy";
        String substring = "bad";
        String replaceword = "good";
        if (name.contains(substring)) {
            String s = name.replace(substring, replaceword);
            System.out.println(s);
        } else {
            System.out.println("no");
        }
    }

}

/*
//Another way:

    StringBuffer s=new StringBuffer("rishabh is a bad boy");
        System.out.println("Old string="+s);
        String substring="bad";
        String replace="good";
        int i=s.indexOf(substring);
        if(i>-1)
        {
            s.replace(i,i+substring.length(),replace);
            System.out.println("New string="+s);
        }

    }*/

