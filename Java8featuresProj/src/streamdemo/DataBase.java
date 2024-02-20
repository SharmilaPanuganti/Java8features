package streamdemo;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
   public static List<Employee> getEmployees(){
    List<Employee> list=new ArrayList<>();
    list.add(new Employee(12,"Siraj",24000,"A"));
    list.add(new Employee(13,"Viraj",24000,"A"));
    list.add(new Employee(14,"raj",19000,"C"));
    list.add(new Employee(15,"rajk",20000,"B"));
    return list;
   }
}
