package functionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Student {
    private String name;
    private int age;
    public Student() {
    }
    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String customShow(BiFunction<Integer,Student,String> function,Integer value){
        return function.apply(value,this);
    }
}
