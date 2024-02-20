package functionalInterfaces.mapdefault;

import java.util.HashMap;
import java.util.Map;

public class MapDefaultMethods {
    public static void main(String[] args) {
        Map<Integer,String> empMap = new HashMap<>();
		empMap.put(190292, "Martin");
		empMap.put(190928, "Farnk");
		empMap.put(902292, "Andrew");
        String result = empMap.getOrDefault(10001, "Rocky");
		System.out.println(result);
        empMap.forEach((k,v)->System.out.println(k+" : "+v));
        Map<Double,Double> map = new HashMap<>();
		map.put(2.0, 3.0);
		map.put(3.0, 3.0);
		map.put(1.0, 4.0);
        map.replaceAll((i1,i2)->Math.pow(i1, i2));
        map.forEach((k,v)->System.out.println(k+": "+v));
        System.out.println("--------------------------------------");
        //putIfAbsent
        empMap.putIfAbsent(10001, "Sam");
        empMap.forEach((k,v)->System.out.println(k+" : "+v));
        String result2 = empMap.putIfAbsent(190928, "KK");
		System.out.println(result2);
        //removeandreplace
        boolean remove=empMap.remove(10001, "Sam");
        System.out.println(remove);
        System.out.println("-----------------------------------");
		
		boolean replace = empMap.replace(190928, "Farnk", "Frank");
		System.out.println(replace);
		empMap.forEach((k,v)->System.out.println(k+" : "+v));
        String replace2 = empMap.replace(190292, "Luther");
		System.out.println(replace2);
        String replace3 = empMap.replace(200, "Author-X");
		System.out.println(replace3);
    }
}
