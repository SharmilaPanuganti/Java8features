package javatechie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



public class SortMap {
    public static void main(String[] args) {
        
    
    Map<Integer,String> map=new HashMap<>();
    map.put(1,"Abc");
    map.put(2,"Abc");
    map.put(3,"Abc");
    map.put(4,"Abc");
    List<Entry<Integer,String>> entries=new ArrayList<>(map.entrySet());
    Collections.sort(entries,(o1,o2)->o1.getValue().compareTo(o2.getValue()));
    entries.forEach(s->System.out.println(s.getKey()+" "+s.getValue()));
    map.entrySet().stream().sorted((o1,o2)->o1.getValue().compareTo(o2.getValue())).forEach(System.out::println);;
    }
    
}
