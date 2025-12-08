package Students;

import java.util.ArrayList;
import java.util.HashMap;
public class Student {
    String id;
    String name;
    ArrayList<Integer> grades;
    public Student(String id, String name){
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    @Override
    public String toString(){
        return "id = " + id + ", name = " + name + ", grades = " + grades;
    }
}
class GradeBook{
    HashMap<String, Student> students;
    public GradeBook(){
        students = new HashMap<>();
    }
    public void addStudent(Student student){
        students.put(student.id, student);
    }
    public void removeStudent(String id){
        students.remove(id);
    }
    public Student getStudent(String id){
        return students.get(id);
    }
    public void printStudents(){
        System.out.println("All students:");
        for(Student student: students.values()){
            System.out.println(student);
        }
    }
}
class Main{
    public static void main(String[] args){
        GradeBook gradebook = new GradeBook();
        Student s1 = new Student("1", "Java");
        s1.addGrade(100);
        s1.addGrade(50);
        s1.addGrade(150);
        Student s2 = new Student("2", "LaTeX");
        s2.addGrade(50);
        s2.addGrade(150);
        s2.addGrade(100);
        Student s3 = new Student("3", "Python");
        s3.addGrade(50);
        s3.addGrade(150);
        s3.addGrade(100);

        gradebook.addStudent(s1);
        gradebook.addStudent(s2);
        gradebook.addStudent(s3);

        gradebook.printStudents();

        gradebook.removeStudent("1");
        System.out.println("Students.Student 2: " + gradebook.getStudent("2"));
    }
}
