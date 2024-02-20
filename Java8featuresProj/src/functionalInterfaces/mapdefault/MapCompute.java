package functionalInterfaces.mapdefault;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapCompute {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "Java");
		map.put(2, "Java");
		
		System.out.println("Original map: " + map);
        map.compute(1, (key, oldVal) -> oldVal.concat("Script"));
		map.compute(2, (key, oldVal) -> oldVal.concat("FrameWork"));
		System.out.println("Recomputed map: " + map);
        String r1 = map.compute(1, (key, oldVal) -> null); //removes the key
		System.out.println(r1);
        System.out.println("----------------------------------------");
        System.out.println("Recomputed again: "+map);
        String r2 = map.compute(3, (key, oldVal) -> null); //do nothing
		System.out.println("------------------------------------------");
        System.out.println(map);
        System.out.println("--------------------------------------------");
        String r3 = map.compute(30, (key, oldVal) -> "Spring Framework"); //adds the key
		System.out.println(r3);
		System.out.println("After null: " + map);
        //computeIfPresent and Absent
        map.computeIfAbsent(2,k->"Java at"+k);
        System.out.println("----------------------------------------------");
        System.out.println("No changes: "+map);
        map.put(3, null);
        map.computeIfAbsent(3, key->".Net");
        System.out.println("Updated: "+map);
        map.computeIfAbsent(1, key->"javaScript");
        System.out.println("Added new: "+map);
        Map<String,Collection<String>> multiTechMap = new HashMap<>();
        multiTechMap.computeIfAbsent("names", key -> new ArrayList<>()).add("KK");
        System.out.println("multimap: " + multiTechMap);
 
        multiTechMap.computeIfAbsent("names", key -> new ArrayList<>()).add("PK");
        multiTechMap.computeIfAbsent("names", key -> new ArrayList<>()).add("RK");
        
        multiTechMap.computeIfAbsent("fruits", key -> new ArrayList<>()).add("Apple");
        multiTechMap.computeIfAbsent("fruits", key -> new ArrayList<>()).add("Mango");
        System.out.println("multimap: " + multiTechMap);
    }
}
