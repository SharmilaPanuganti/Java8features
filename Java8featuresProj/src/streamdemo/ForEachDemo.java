package streamdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ForEachDemo {
    
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add(("ABC"));
        list.add(("BBC"));
        list.add(("BAC"));
        list.add(("ABC"));
        list.stream().forEach(System.out::println);
        System.out.println("------------------------------");
        Stream<String> filter = list.stream().filter(s->s.startsWith("A"));
        filter.forEach(System.out::println);
        Map<Integer,String> map=new HashMap<>();
        map.put(1, "A");
        map.put(2, "A");
        map.put(3, "A");
        map.put(4, "A");
        // map.forEach((key,value)->System.out.println("Key:"+key+" Value:"+value));
        map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj->System.out.println(obj));

    }
}
