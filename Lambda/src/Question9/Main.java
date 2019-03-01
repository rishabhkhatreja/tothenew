//Collect all the even numbers from an integer list

package Question9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> listOfInteger= Arrays.asList(4,5,2,1,5,2,1,6,7,3,8,3,1);
        List<Integer> collect = listOfInteger.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println("even number list is="+collect);
    }
}
