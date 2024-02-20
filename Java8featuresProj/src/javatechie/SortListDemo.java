package javatechie;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(9,7,3,4,5);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); //ascending
    }
}
