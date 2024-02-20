package functionalInterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerEx {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1, "ABC");
        map.put(2, "ABC");
        map.put(3, "ABC");
        BiConsumer<Integer,String> biConsumer=(k,v)->System.out.println("Key,value: "+k+","+v);
        map.forEach(biConsumer.andThen((k,v)->System.out.println(v.substring(0,1))));
        BiConsumer<Integer,Integer> adder=(i1,i2)->System.out.println(i1+i2);
        BiConsumer<Integer,Integer> multiplier=(i1,i2)->System.out.println(i1*i2);
        adder.andThen(multiplier).accept(10, 20);
        multiplier.andThen(adder).accept(10, 20);
    }
}
