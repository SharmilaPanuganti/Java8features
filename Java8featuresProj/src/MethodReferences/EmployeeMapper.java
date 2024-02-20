package MethodReferences;

public class EmployeeMapper {
    public EmployeeDO convert(Employee e){
      EmployeeDO ed=new EmployeeDO();
      ed.setId(e.getId());
      ed.setName(e.getName());
      ed.setSalary(e.getSalary());
      return ed;
    }
}
