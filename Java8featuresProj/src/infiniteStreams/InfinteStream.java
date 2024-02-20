package infiniteStreams;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfinteStream {
     

    public static void main(String[] args) {
        Stream<Integer> iterate=Stream.iterate(0, i->i+2);
        List<Integer> collect=iterate.limit(10).collect(Collectors.toList());
        collect.forEach(System.out::println);
        Supplier<UUID> randomUUID=UUID::randomUUID; //of custom types
        Stream<UUID> gStream=Stream.generate(randomUUID);
        List<UUID> list=gStream.skip(10).limit(10).collect(Collectors.toList());
        list.forEach(System.out::println);
        System.out.println("________________________________");
        Stream.iterate(0,i->i+1).limit(10).forEach(System.out::println);;

    }
}
