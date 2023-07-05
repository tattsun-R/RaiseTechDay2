public class Student {

    private String studentname;
    private int age;
    private String classname;

    public Student(String studentname, int age, String classname) {
        this.studentname = studentname;
        this.age = age;
        this.classname = classname;
    }

    public String getStudentname() {
        return studentname;
    }

    public int getAge() {
        return age;
    }

    public String getClassname() {
        return classname;
    }

}
