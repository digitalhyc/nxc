package students;

import course.Course;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrew on 14-3-22.
 */
public class Student {
    private int id;
    private String name;
    private List<Course> courseList = new ArrayList<Course>();

    public Student(int studentId,
                   String studentName)
    {
        name = studentName;
        id = studentId;
    }

    public void addCourse(Course newCourse)
    {
        courseList.add(newCourse);
    }

    public void removeCourseById(int courseIndex)
    {
        courseList.remove(courseIndex);
    }

    public double getAverageGrade()
    {
        if (true == courseList.isEmpty())
            return 0;

        int weightTotal;
        double gradeTotal;
        double averageGrade;

        weightTotal = 0;
        gradeTotal = 0;
        averageGrade = 0;

        for (Course eachCourse : courseList)
        {
            weightTotal += eachCourse.getWeight();
            gradeTotal += eachCourse.getGrade() * eachCourse.getWeight();
        }

        averageGrade = gradeTotal / weightTotal;

        return averageGrade;
    }

}
