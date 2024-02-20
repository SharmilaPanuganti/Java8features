package streamfiles;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStreamExample {
    public static void main(String[] args) {
        Path path=Paths.get("src\\streams\\StreamExample.java");
        try(Stream<String> lines=Files.lines(path);){
            lines.forEach(System.out::println);
            System.out.println("___________________________________");
            Stream<String> lines2 = Files.lines(path,Charset.forName("UTF-8"));
            lines2.forEach(System.out::println);
        }
        catch(IOException ie){
            System.out.println("Exception occured");
        }
    }
}
