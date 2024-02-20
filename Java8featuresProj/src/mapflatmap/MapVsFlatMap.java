package mapflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<Customer> customers = CustomerDb.getAll();
        List<String> collect = customers.stream().map(Customer::getEmail).collect(Collectors.toList()); // data
                                                                                                        // transformation
        System.out.println(collect);
        //
        List<String> phoneNumbers = customers.stream().flatMap(c -> c.getPhonNo().stream())
                .collect(Collectors.toList());
        System.out.println(phoneNumbers);
    }
}
