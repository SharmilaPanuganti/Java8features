package mapreduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceEx {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,4,3,5,7,9);
        List<String> courses=Arrays.asList("Java","React","asp.net");
        int sum=list.stream().mapToInt(i->i).sum();
        System.out.println(sum);
        Integer reduce = list.stream().reduce(2,(a,b)->a+b);
        System.out.println(reduce);
        Optional<Integer> reduce2 = list.stream().reduce(Integer::sum);
        System.out.println(reduce2);
        Integer prod = list.stream().reduce(1,(a,b)->a*b);
        System.out.println(prod);
        // Integer max = list.stream().reduce(0,(a,b)->a>b?a:b);
        Integer max = list.stream().reduce(0,Integer::max);
        System.out.println(max);
        Optional<String> larger=courses.stream().reduce((w1,w2)->w1.length()>w2.length()?w1:w2);
        System.out.println(larger);
    }
}
