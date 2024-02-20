package streamdemo;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaxService {
    public static List<Employee> evaluateEmployees(String input) {

        return input.equalsIgnoreCase("tax")
                ? DataBase.getEmployees().stream().filter(emp -> emp.getSalary() > 20000).collect(Collectors.toList())
                : DataBase.getEmployees().stream().filter(emp -> emp.getSalary() <= 20000).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(evaluateEmployees("non tax"));
        // mapreduce
        // get salary

        OptionalDouble averDouble = DataBase.getEmployees().stream().filter(emp -> emp.getGrade().equalsIgnoreCase("A"))
                .map(Employee::getSalary).mapToDouble(i -> i).average();
        double sum = DataBase.getEmployees().stream().filter(emp -> emp.getGrade().equalsIgnoreCase("A"))
                .map(Employee::getSalary).mapToDouble(i -> i).sum();
        System.out.println(averDouble);
        System.out.println("Sum:"+sum);
    }
}
