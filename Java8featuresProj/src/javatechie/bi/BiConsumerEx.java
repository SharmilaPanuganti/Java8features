package javatechie.bi;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerEx {
    public static void main(String[] args) {
        BiConsumer<String,Integer> biConsumer=(i1,i2)->System.out.println(i1+" "+ i2);
        biConsumer.accept("Hello", 1);
        Map<String,Integer> map=new HashMap<>();
            map.put("xyz", 25);
            map.put("pqr", 35);
            map.put("uvw", 45);
            map.forEach((k,v)->System.out.println(k+" "+v));
    }
}
