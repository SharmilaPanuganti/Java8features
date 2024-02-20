package functionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ComparatorEx {
    public static void main(String[] args) {
         List<Student> students=new ArrayList<>();
         students.add(new Student("ABC XYZ", 25));
         students.add(new Student("UVW XYZ", 20));
         students.add(new Student("DEF XYZ", 20));
         students.add(new Student("DEF XYZ", 18));
         System.out.println("Before sorting:");
         students.forEach(System.out::println);
        //  Collections.sort(students,(s1,s2)->s1.getName().compareTo(s2.getName()));
        //  students.sort((s1,s2)->s1.getName().compareTo(s2.getName())); //List sort
         System.out.println("After sorting: ");
         
        //  Comparator<Student> comp=Comparator.comparing(Student::getName,String.CASE_INSENSITIVE_ORDER);
         Comparator<Student> comp=Comparator.comparing(Student::getName);
        //  Collections.sort(students,comp);
        students.sort(comp.reversed());
         students.forEach(System.out::println);
         //Comparing int
         List<String> list = Arrays.asList("Carter","James","Davis","Zorra","Barry","Zola");
			
			Comparator<String> compInt = Comparator.comparingInt(String::length);
			Collections.sort(list, compInt);
			list.forEach(System.out::println);
            Comparator<Student> comp3 = Comparator.comparing(Student::getName).thenComparing(Student::getAge);
		Collections.sort(students, comp3);
		System.out.println("After Sorting...............");
		students.forEach(System.out::println);
        students.add(new Student("sharmi",20));
       
        students.add(new Student("Madhu",20));
        //Natural and reverseOrder
        List<String> nameList=students.stream().map(Student::getName).collect(Collectors.toList());
        System.out.println("Before sorting....");
        nameList.forEach(System.out::println);
		// nameList.sort(Comparator.naturalOrder());
        nameList.sort(Comparator.reverseOrder());
        System.out.println("After sorting.....");
        nameList.forEach(System.out::println);
        System.out.println("-----------------------------------");
        students.add(new Student(null, 10));
        students.forEach(System.out::println);
        // Comparator<Student> comp4 = Comparator.comparing(Student::getName, Comparator.nullsFirst(String::compareTo));
		Comparator<Student> comp4 = Comparator.comparing(Student::getName, Comparator.nullsLast(String::compareTo));
        students.sort(comp4);
        System.out.println("After sorting..........");
        students.forEach(System.out::println);

    }
}
