
//Find average of the number inside integer list after doubling it.
package Question11;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    static void AnotherWay(List<Integer> list)
    {
        System.out.println("this is the another way!!!"+list.stream().collect(Collectors.averagingInt(e->e*2)));
    }
    public static void main(String[] args) {
        List<Integer> listOfInteger= Arrays.asList(4,5,2,1,5,2,1);
        Double collect = listOfInteger.stream().map(e -> e * 2).collect(Collectors.averagingInt(e -> e));
        System.out.println(collect);
        AnotherWay(listOfInteger);
    }
}
