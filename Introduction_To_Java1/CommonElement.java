
//Find common elements between two arrays.

import java.util.*;
public class CommonElement
{
    public static void main(String[] args) {
        int[] arr1={2,3,4,5,6,9,12,45};
        int[] arr2={5,6,9,12};
        Map<Integer,Integer> common=new HashMap<>();
        for(int i=0;i<arr1.length;i++)
        {
            common.put(arr1[i],1);
        }
        for(int i=0;i<arr2.length;i++)
        {
            if(common.containsKey(arr2[i]))
            {
                int k=common.get(arr2[i]);
                k++;
                common.put(arr2[i],k);
            }
            else
            {
                common.put(arr2[i],1);
            }
        }
        for (int key:common.keySet())
        {
            if(common.get(key)>1)
            {
                System.out.println(key);
            }
        }
    }
}
/*
//Another Way:

public class CommonElement
{
    public static void main(String[] args) {
        int[] arr1={2,3,4,5,6};
        int[] arr2={1,2,3,4,5,6,8,9};
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
 */