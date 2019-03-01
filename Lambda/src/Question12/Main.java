//Find the first even number in the integer list which is greater than 3.

package Question12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,7,2,1,3,4,5,6,1);
        Optional<Integer> firstElement = list.stream().filter(e -> e % 2 == 0).filter(e -> e > 3).findFirst();
        if(firstElement.isPresent())
        {
            System.out.println(firstElement.get());
        }
        else
        {
            System.out.println("No number is present");
        }
    }

}
