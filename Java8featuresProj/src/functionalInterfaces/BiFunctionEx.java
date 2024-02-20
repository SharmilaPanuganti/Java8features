package functionalInterfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

public class BiFunctionEx {
    public static void main(String[] args) {
        Map<Integer,Student> map=new HashMap<>();
        map.put(1, new Student("ABC", 10));
        map.put(2, new Student("ABC", 10));
        map.put(3, new Student("ABC", 20));
        BiFunction<Integer,Student,String> style=(k,v)->v.getName()+"'s age "+v.getAge();
        for (Entry<Integer, Student> entry : map.entrySet()) {
            System.out.println(entry.getValue().customShow((k,v)->v.getName()+"\t"+v.getAge(), entry.getKey()));
        } 
        System.out.println("---------------------------------------");
        BiFunction<Integer,Student,Integer> style2=(k,v)->v.getAge();
        map.forEach((k,v)->System.out.println(style2.andThen(value->{
            if(value<15) 
            return "he is younger";
            return "he is an adult";
        })
        .apply(k, v)));
       
    }
}
