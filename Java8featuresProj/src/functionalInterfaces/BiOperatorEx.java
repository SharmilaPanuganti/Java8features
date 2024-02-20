package functionalInterfaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class BiOperatorEx {
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();
		employees.add(new Employee("D", 30000.00, "HR"));
        employees.add(new Employee("A", 30000.00, "HR"));
		employees.add(new Employee("B", 20000.00, "HR"));
		employees.add(new Employee("C", 100000.00, "HR"));
		
		employees.add(new Employee("X", 30000.00, "Finance"));
		employees.add(new Employee("Y", 20000.00, "Finance"));
		employees.add(new Employee("X", 1000.00, "Finance"));
		employees.add(new Employee("P", 90000.00, "Finance"));
        Comparator<Employee> salComparator=Comparator.comparing(Employee::getSalary);
        Map<String, Optional<Employee>> maxSalByDeptMap = employees.stream().collect(Collectors.groupingBy(Employee::getDept,
				Collectors.reducing(BinaryOperator.maxBy(salComparator))));
        maxSalByDeptMap.forEach((k,v)->System.out.println(k+" : "+v.get()));
        Map<String, Optional<Employee>> minSalByDeptMap = employees.stream().collect(Collectors.groupingBy(Employee::getDept,
				Collectors.reducing(BinaryOperator.minBy(salComparator))));
        minSalByDeptMap.forEach((k,v)->System.out.println(k+" : "+v.get()));

    }
}
