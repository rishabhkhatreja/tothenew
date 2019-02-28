/*Question3:Write a method that takes a string and print the number of occurrence of each character
characters in the string.
*/

import java.util.*;

public class FrequencyOfCharacter {

        public static void main(String[] args) {
            String temp="my name is khan but i m not a terrorist";
            Map<Character,Integer> frequency=new LinkedHashMap<>();
            for(int i=0;i<temp.length();i++)
            {
                if(temp.charAt(i)!=' ')
                {
                    if(frequency.containsKey(temp.charAt(i)))
                    {
                        int k=frequency.get(temp.charAt(i));
                        k++;
                        frequency.put(temp.charAt(i),k);
                    }
                    else
                    {
                        frequency.put(temp.charAt(i),1);
                    }

                }

            }
            System.out.println(frequency.toString());
        }
    }

