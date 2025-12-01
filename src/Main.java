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
        System.out.println("Student 2: " + gradebook.getStudent("2"));
    }
}
