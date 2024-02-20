package streamoperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperation {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        l.add("Abc");
        l.add("pqr");
        l.add("uvw");
        l.add("abc");
        // Stream<String> stream=l.stream();
        // Stream<String> dist=stream.distinct();
        long count=l.stream().distinct().count();
        System.out.println(count); //streams cannot be reused
        boolean anyMatch=l.stream().anyMatch(s->s.contains("x"));
        System.out.println(anyMatch);
        System.out.println("_______________________________");
        List<Student> stuList=new ArrayList<>();
        stuList.add(new Student("Abce", 12));
        stuList.add(new Student("def", 14));
        stuList.add(new Student("xyze", 20));
        stuList.add(new Student("uvwe", 19));
        Stream<Student> filStream=stuList.stream().filter(s->s.getAge()>18);
        filStream.forEach(System.out::println);
        System.out.println("________________________");
        boolean allMatch=stuList.stream().allMatch(s->s.getName().contains("e"));
        System.out.println(allMatch);
        System.out.println("_____________________________________");
        boolean noneMatch=stuList.stream().noneMatch(s->s.getName().contains("sh"));
        System.out.println(noneMatch);        
    }
}
