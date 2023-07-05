public class Student {

    private String studentName;
    private int age;
    private String className;

    public Student(String studentName, int age, String className) {
        this.studentName = studentName;
        this.age = age;
        this.className = className;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public String getClassName() {
        return className;
    }

}
