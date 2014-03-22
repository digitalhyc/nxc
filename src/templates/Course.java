package templates;

/**
 * Created by andrew on 14-3-22.
 */
public class Course {
    private int id;
    private String name;
    private double weight;
    private double grade;

    public Course(int courseId,
                  String courseName,
                  double courseWeight,
                  double courseGrade)
    {
        id = courseId;
        name = courseName;
        weight = courseWeight;
        grade = courseGrade;
    }


    public double getGrade()
    {
        return grade;
    }

    public double getWeight()
    {
        return weight;
    }
}
