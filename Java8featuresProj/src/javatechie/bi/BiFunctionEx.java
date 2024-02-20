package javatechie.bi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiFunctionEx {
    public static void main(String[] args) {
        List<Integer> list1 = Stream.of(1, 3, 4, 5, 2, 5, 68).collect(Collectors.toList());
        List<Integer> list2 = Stream.of(1, 9, 0, 7, 2, 5, 6).collect(Collectors.toList());
        BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction = (l1, l2) -> Stream.of(l1, l2)
                .flatMap(List::stream).distinct().collect(Collectors.toList());
            biFunction.andThen(l->l.stream().sorted().collect(Collectors.toList())).apply(list1, list2).forEach(System.out::println);
            Map<String,Integer> map=new HashMap<>();
            map.put("xyz", 25);
            map.put("pqr", 35);
            map.put("uvw", 45);
            map.replaceAll((k,v)->v+5000);
            System.out.println(map);      
    }
}
