package School;

public class Course {
    private String courseDept;
    private int courseNum;
    private int credits;

    public Course(String courseDept, int courseNum, int credits) {
        this.courseDept = courseDept;
        this.courseNum = courseNum;
        this.credits = credits;
    }

    public String toString() {
        return courseNum + " is in the " + courseDept + " department and is worth " + credits + " credits";
    }
}
