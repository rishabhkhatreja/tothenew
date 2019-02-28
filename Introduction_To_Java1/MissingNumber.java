/*
There is an array with every element repeated twice except one. Find that element?
 */
import java.util.*;
public class MissingNumber {

    public static void main(String[] args)
    {
        int[] arr1={2,3,5,1,7,8,1,2,3,5,8};
        Map<Integer,Integer> mapOfElement=new HashMap<>();
        for(int i=0;i<arr1.length;i++)
        {
            if(mapOfElement.containsKey(arr1[i]))
            {
                int keyValue=mapOfElement.get(arr1[i]);
                keyValue++;
                mapOfElement.put(arr1[i],keyValue);
            }
            else
            {
                mapOfElement.put(arr1[i],1);
            }
        }
        for (int key:mapOfElement.keySet())
        {
            if(mapOfElement.get(key)==1)
            {
                System.out.println(key);
            }
        }
    }
}


   /*

   //Another-Way:


   int[] arr1={1,2,3,4,5,6,7,8,1,2,3,4,5,6,7};
    int m=0,sum=0;
        for(int i=0;i<arr1.length;i++)
        {
        if(m<arr1[i])
        {
        m=arr1[i];
        }
        }
        sum=(m*(m+1)/2)*2;
        for(int i=0;i<arr1.length;i++)
        {
        sum=sum-arr1[i];
        }
        System.out.println("Missing number is="+sum);

        */

   /*
   Another-Way

   public class MissingNumber {
    public static void main(String[] args)
    {
        int[] arr1={20,31,41,56,20,41,31,58,11,58};
        for(int i=0;i<arr1.length-1;i++)
        {
            for(int j=i+1;j<arr1.length;j++)
            {
                if(arr1[i]>arr1[j])
                {
                    int temp;
                    temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
        for (int i=0;i<arr1.length;i=i+2)
        {
            if(i==arr1.length-1)
            {
                System.out.println("missing number is="+arr1[i]);
                break;
            }
            if(arr1[i]==arr1[i+1])
            {
             continue;
            }
            else
            {
                System.out.println("missing number is="+arr1[i]);
                break;
            }
        }
    }
}



    */