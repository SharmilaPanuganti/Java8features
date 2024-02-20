package mapflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDb {
    public static List<Customer> getAll(){
        return Stream.of(
            new Customer(101,"John","john@gmail.com",Arrays.asList("89080808","97897980989")),
            new Customer(102,"John","john@gmail.com",Arrays.asList("89080808","97897980989")),
            new Customer(103,"John","john@gmail.com",Arrays.asList("89080808","97897980989")),
            new Customer(104,"John","john@gmail.com",Arrays.asList("89080808","97897980989")))
            .collect(Collectors.toList());
    }
}
