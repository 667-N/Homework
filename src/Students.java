import java.util.ArrayList;
import java.util.HashMap;
class Student{
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
