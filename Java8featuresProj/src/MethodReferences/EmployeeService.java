package MethodReferences;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeService {
    public List<Employee> loadEmployees(){
        return IntStream.rangeClosed(1, 5).mapToObj(i->new Employee(i,"employee"+i,new Random().nextInt())).collect(Collectors.toList());
    }
}
