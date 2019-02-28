//Write a program to find the number of occurrences of the duplicate words in a string and print them ?

public class Duplicate
{
    public static void main(String[] args)
    {
        String string="My name is rishabh & my EmailID is Rishabh.Khatreja03@gmail.com. Rishabh is my name";
        String[] words=string.split(" ");
        int count;
        for(int i=0;i<words.length;i++)
        {
            count=1;
         for(int j=i+1;j<words.length;j++)
         {
             if(words[i].equals(words[j]))
             {
                 count++;
                 words[j]="";
             }
         }
         if(words[i]!="" && count>1)
         {
             System.out.println(words[i]+"="+count);
         }

        }
    }
}
/*

//Another Way:

 Map<String,Integer> map=new HashMap<>();
        String word="";
        for(int i=0;i<string.length();i++)
        {
            if(string.charAt(i)==' '|| i==string.length()-1)
            {
                if(i==string.length()-1)
                {
                    word=word+string.charAt(i);
                    if(map.containsKey(word))
                    {
                        int count=map.get(word);
                        count++;
                        map.put(word,count);
                        word=" ";
                    }
                    else
                    {
                        map.put(word,1);
                        word=" ";
                    }
                }
                else
                {
                    if(map.containsKey(word))
                    {
                        int count=map.get(word);
                        count++;
                        map.put(word,count);
                        word=" ";
                    }
                    else
                    {
                        map.put(word,1);
                        word=" ";
                    }
                }
            }
            else
            {
                word=word+string.charAt(i);
            }
        }
        System.out.println(map);
        for (String key:map.keySet())
        {
            if(map.get(key)>1)
            {
                System.out.println("duplicate words are="+key+"and there frequency is="+map.get(key));
            }
        }
 */