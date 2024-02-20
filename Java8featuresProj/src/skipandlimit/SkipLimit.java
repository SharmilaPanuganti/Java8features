package skipandlimit;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class SkipLimit {
    public static void main(String[] args) throws IOException {
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,910);
        numbers.stream().skip(1).limit(7).forEach(System.out::println);
        List<String> fileData=Files.readAllLines(Paths.get("src\\skipandlimit\\data.txt"));
        fileData.stream().skip(1).limit(fileData.size()-2).forEach(System.out::println);
    }
}
