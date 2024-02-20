package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String arr[]={"AA","BB","CC"};
        Stream<String> stream=Arrays.stream(arr);
        stream.forEach(System.out::println);
        Stream<String> of=Stream.of("a","b","c","d");
        of.forEach(System.out::println);

        List<String> l=new ArrayList<>();
        l.add("PQR");
        l.add("PQR");
        l.add("PQR");
        l.add("PQR");
        Stream<String> stream2=l.stream();
        System.out.println("_______________________________");
        stream2.forEach(System.out::println);
        List<Student> stuList=new ArrayList<>();
        stuList.add(new Student("Abc",13));
        stuList.add(new Student("pqr",13));
        stuList.add(new Student("xyz",13));
        stuList.add(new Student("uvw",13));
        Stream<Student> pStream=stuList.parallelStream();   //Multithreading implemented
        System.out.println("Student data for processing...");
       pStream.forEach(s->doProcess(s));
       Stream<String> lStream=Pattern.compile(",").splitAsStream("a,b,c"); //String stream
       lStream.forEach(System.out::println);
       IntStream intStream="abcd".chars();
       intStream.forEach(System.out::println);
    }
    private static void doProcess(Student s){
        System.out.println(s);

    }
}
