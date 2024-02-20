package functionalInterfaces;

public class Employee {
   
    private String dept;
    private String name;
    private double salary;
    public Employee() {
    }

    public Employee(String name, double salary, String dept) {
        this.dept = dept;
        this.name = name;
        this.salary = salary;
    }
    public String getDept() {
        return dept;
    }
    public void setId(String dept) {
        this.dept = dept;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [dept=" + dept + ", name=" + name + ", salary=" + salary + "]";
    }
    public void getEmpInfo(){
        System.out.println("Employee Info");
    }
}

