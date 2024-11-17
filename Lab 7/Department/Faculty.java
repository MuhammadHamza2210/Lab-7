package inheritance;

import java.util.ArrayList;


public class Faculty extends Employee {
    private String workingHours;
    private ArrayList<Course> courseList = new ArrayList<>();

   
    public Faculty(String name, String designation, String department, String email, 
                   String contact, int salary, int number, String workingHours) {
        super(name, designation, department, email, contact, salary, number);
        this.workingHours = workingHours;
    }

   
    public String getWorkingHours() {
        return workingHours;
    }

    public void assignCourse(Course course) {
        courseList.add(course);
    }

 
    public void printCourseList() {
        System.out.println("Courses assigned to " + getEmployeeName() + ":");
        for (Course course : courseList) {
            System.out.println("Code: " + course.getCourseCode() + ", Name: " + 
           course.getCourseName() + ", Credit Hours: " + 
           course.getCourseCreditHours());
        }
    }

   
    public String toString() {
        return super.toString() + ", Working Hours: " + workingHours;
    }
}
