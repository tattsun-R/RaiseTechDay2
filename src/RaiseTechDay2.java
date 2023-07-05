import java.util.List;

public class RaiseTechDay2 {
    public static void main(String[] args) {

        List<Student> studentList = List.of(new Student("稲葉　太郎", 18, "B"),
                new Student("松本　一郎", 22, "B"),
                new Student("増田　次郎", 22, "A"),
                new Student("青山　三郎", 15, "C"),
                new Student("滝山　四郎", 15, "C"));

        int count = 0;

        for (Student Student : studentList) {
            if (Student.getClassName().equals("B")) {
                count++;
                System.out.println(count + "人目: " + Student.getStudentName() + " , " + Student.getAge() + "歳");
            }
        }
    }
}


