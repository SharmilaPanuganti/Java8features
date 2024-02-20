package map;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapExample {
    public static void main(String[] args) {
        List<String> uris=new ArrayList<>();
        uris.add("C:\\myfile1.txt");
        uris.add("D:\\myfile2.txt");
        uris.add("C:\\myfile3.txt");
        // Stream<Path> map=uris.stream().map(uri->Paths.get(uri));
        Stream<Path> map=uris.stream().map(Paths::get);  //Method reference
        map.forEach(System.out::println);
        System.out.println("_______________________________");
        List<Details> details=new ArrayList<>();
        List<String> parts1=new ArrayList<>();
        parts1.add("part_1");
        parts1.add("part_2");
        parts1.add("part_3");
        List<String> parts2=new ArrayList<>();
        parts2.add("part_1");
        parts2.add("part_2");
        parts2.add("part_3");
        Details details1=new Details(1002, parts1);
        Details details2=new Details(1003, parts2);
        details.add(details2);
        details.add(details1);
        Stream<String> flStream=details.stream().flatMap(d->d.getDetails().stream());
        flStream.forEach(System.out::println);
        List<Integer> li=Arrays.asList(1,2,3,4);
        int reduce=li.stream().reduce(12, (a,b)->a+b);
        System.out.println(reduce);
       
    }
}
