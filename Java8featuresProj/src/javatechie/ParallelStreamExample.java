package javatechie;

import java.util.List;
import java.util.stream.IntStream;

import MethodReferences.Employee;

public class ParallelStreamExample {
    public static void main(String[] args) {
        long start = 0;
        long end = 0;
        // start=System.currentTimeMillis();
        // IntStream.range(1, 100).forEach(System.out::println);
        // end=System.currentTimeMillis();
        // System.out.println("stream time: "+(end-start));
        // System.out.println("---------------------------------------");
        // start=System.currentTimeMillis();
        // IntStream.range(1, 100).parallel().forEach(System.out::println);
        // end=System.currentTimeMillis();
        // System.out.println("stream time: "+(end-start));

        IntStream.range(1, 10)
                .forEach(x -> System.out.println("Thread: " + Thread.currentThread().getName() + " " + x));
        IntStream.range(1, 10).parallel()
                .forEach(x -> System.out.println("Thread: " + Thread.currentThread().getName() + " " + x));
        List<Employee> employees = EmployeeDB.getEmployees();
        start = System.currentTimeMillis();
        System.out.println(employees.stream().map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble());
        end = System.currentTimeMillis();
        System.out.println("stream time: " + (end - start));
        start = System.currentTimeMillis();
        System.out.println(
                employees.parallelStream().map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble());
        end = System.currentTimeMillis();
        System.out.println("stream time: " + (end - start));

    }
}
