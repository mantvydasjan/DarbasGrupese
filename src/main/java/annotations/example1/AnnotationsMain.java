package annotations.example1;

import java.sql.SQLOutput;
public class AnnotationsMain {
    public static void main(String[] args) {
        //.class duomenys/info apie pacia klase
        Class<Student> classObject = Student.class;
        if (classObject.isAnnotationPresent(StudentInfo.class)) {
            System.out.println("StudentInfo annotation yra");
            StudentInfo studentInfo = classObject.getAnnotation(StudentInfo.class);
            System.out.println("StudentInfo from specific annotation");
            System.out.println(studentInfo.studentName());
            System.out.println(studentInfo.studentName());
        } else {
            System.out.println("StudentInfo annotation not found");
        }
    }
}