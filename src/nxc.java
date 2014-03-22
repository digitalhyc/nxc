import templates.Course;
import templates.Student;

/**
 * Created by andrew on 14-3-22.
 */
public class nxc {
    public static void main(String[] args)
    {
        Student junzki = new Student(1, "Junzki");

        Course math = new Course(1, "Math", 6.0, 60.0);
        Course eng = new Course(2, "English", 2.0, 90.0);


        junzki.addCourse(math);
        junzki.addCourse(eng);

        System.out.print(junzki.getAverageGrade());
    }
}
