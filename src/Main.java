import pojo.Student;
import pojo.StudentMutableClass;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        //mark student class as final.
        HashMap<Student, String> map= new HashMap<>();

        Student student = new Student("Urmila");
        map.put(student, "name");

        System.out.println(map.get(student));  //output: name


        //mark student class as non-final and override it
        HashMap<Student, String> map1= new HashMap<>();

        StudentMutableClass studentMutableClass = new StudentMutableClass("Urmila");
        Student student1 = studentMutableClass;

        map1.put(student1, "name");
        studentMutableClass.setStudentMutableName("Kadam");
        System.out.println(map1.get(student1));  //null
    }
}