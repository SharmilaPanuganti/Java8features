package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionDefaultMethods {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        Function<Student,String> student=Student::getName;
        Function<Student,Student> fName=e->{
            int index=e.getName().indexOf(" ");
            String fname=e.getName().substring(0,index);
            e.setName(fname);
            return e;
        };
        students.add(new Student("ABC XYZ", 10));
        students.add(new Student("UVW XYZ", 20));
        students.add(new Student("DEF XYZ", 20));
        //compose
        List<String> studentFnameList = convertListToNamesList(students, student.compose(fName));
		studentFnameList.forEach(s -> {
			System.out.println(s);
		});
        //andThen
        Function<String,String> initial=s->s.substring(0,1);
        Function<Student,String> studentName=Student::getName;
        List<String> stuNameListInitial=convertListToNamesList(students, studentName.andThen(initial));
        stuNameListInitial.forEach(s -> {
			System.out.println(s);
		});
        //Identity
        List<Student> studentNames=applyIdentityToStuList(students,Function.identity());
        studentNames.forEach(System.out::println);

        
    }
    public static List<String> convertListToNamesList(List<Student> students,
			Function<Student, String> fName) {
		List<String> studentFNmae = new ArrayList<String>();
		// for (Student student : students) {
		//  studentFNmae.add(fName.apply(student));
		// }
        students.forEach(student->studentFNmae.add(fName.apply(student)));
		return studentFNmae;
	}
    public static List<Student> applyIdentityToStuList(List<Student> students,
			Function<Student, Student> funStudent) {
		List<Student> studentNames = new ArrayList<Student>();
		for (Student student : students) {
			studentNames.add(funStudent.apply(student));
		}
		return studentNames;
	}
    
}
