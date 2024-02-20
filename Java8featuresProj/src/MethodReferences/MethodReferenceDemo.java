package MethodReferences;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        EmployeeService es = new EmployeeService();
        // es.loadEmployees().stream().forEach((e)->{System.out.println(e);});
        // es.loadEmployees().stream().forEach(MethodReferenceDemo::print); //Method
        // reference
        // es.loadEmployees().stream().forEach(System.out::println); //Object reference
        EmployeeMapper mp = new EmployeeMapper();
        // List<EmployeeDO> employees = es.loadEmployees()
        // .stream()
        // .map(mp::convert) // Instance method reference
        // .collect(Collectors.toList());
        // System.out.println(employees);
        List<String> names = es.loadEmployees().stream()
        .map(Employee::getName)
        .collect(Collectors.toList());
        System.out.println(names);
        //Constructor Reference: classname::new
        // EmployeeMan en=()->new Employee(10,"John",80909);
        EmployeeMan en=Employee::new;
        en.getEmployee().getEmpInfo();
        List<Integer> li= (List<Integer>) es.loadEmployees()
        .stream()
        .map(Employee::getId)
        .map(ArrayList::new);
    }

    public static void print(Employee emp) {
        System.out.println(emp);
    }
}
