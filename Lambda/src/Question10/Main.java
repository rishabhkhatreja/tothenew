//Sum all the numbers greater than 5 in the integer list.

package Question10;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> listOfInteger= Arrays.asList(4,5,2,1,5,2,1,6,7,3,8,3,1);
        System.out.println("Sum of number greater than 5 is="+listOfInteger.stream().filter(e -> e > 5).collect(Collectors.summingInt(e->e)));
    }
}
